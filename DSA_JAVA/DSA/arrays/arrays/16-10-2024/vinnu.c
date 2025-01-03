#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <arpa/inet.h>

int main(int argc, char *argv[]) {
    int sockfd, new_sockfd, rval, pid;
    char buff1[20], buff2[20];
    struct sockaddr_in server, client;
    socklen_t len;

    // Create socket
    sockfd = socket(AF_INET, SOCK_STREAM, IPPROTO_TCP);
    if (sockfd == -1) {
        perror("\nSOCK_ERR\n");
        exit(1);
    }

    // Set up server structure
    server.sin_family = AF_INET;
    server.sin_addr.s_addr = inet_addr("192.168.0.5");
    server.sin_port = htons(3339);

    // Bind the socket
    rval = bind(sockfd, (struct sockaddr *)&server, sizeof(server));
    if (rval != -1) {
        listen(sockfd, 5);
        while (1) {
            len = sizeof(client);
            new_sockfd = accept(sockfd, (struct sockaddr *)&client, &len);
            if (new_sockfd != -1) {
                pid = fork();
                if (pid == 0) { // Child process
                    printf("\nChild process executing\n");
                    printf("\nChild process ID is %d\n", getpid());
                    rval = recv(new_sockfd, buff1, sizeof(buff1), 0);
                    if (rval == -1) {
                        perror("\nRECV_ERR\n");
                        exit(1);
                    } else {
                        printf("\nReceived message is: %s\n", buff1);
                    }

                    // Send message back
                    rval = send(new_sockfd, buff1, sizeof(buff1), 0);
                    if (rval != -1) {
                        printf("\nMessage sent successfully\n");
                    } else {
                        perror("\nSEND_ERR\n");
                        exit(1);
                    }

                    close(new_sockfd);
                    exit(0); // Terminate child process
                } else { // Parent process
                    printf("\nParent process\n");
                    printf("Parent process ID is %d\n", getppid());
                    close(new_sockfd);
                }
            } else {
                perror("\nACCEPT_ERR\n");
                exit(1);
            }
        }
    } else {
        perror("\nBIND_ERR\n");
        close(sockfd);
    }
    
    return 0;
}
