#include<stdio.h>
#include<unistd.h>
#include<stdlib.h>
#include<arpa/inet.h>
#include<sys/types.h>
#include<sys/socket.h>
#include<netinet/in.h>

int main()
{
    int sock,cli_sock,test;
    char message[50];
    struct sockaddr_in server,client;
    sock = socket(AF_INET,SOCK_STREAM,IPPROTO_TCP);
    if(sock == -1)
    {
        printf("Socket creation error");
        exit(1);
    }
    server.sin_family = AF_INET;
    server.sin_addr.s_addr = inet_addr("127.0.0.1");
    server.sin_port = htons(7070);
    test = bind(sock,(struct sockaddr*)&server,sizeof(server));
    if(test == -1)
    {
        printf("\nerror in binding");
        exit(1);
    }
    listen(sock,5);
    while(1)
    {
        int len=sizeof(client);
        cli_sock = accept(sock,(struct sockaddr*)&client,&len);
        if(cli_sock != -1)
        {
            int pid = fork();
            if(pid == 0)
            {
                printf("\nchild process executing");
                printf("\nchild process :: %d",getpid());
                test = recv(cli_sock,message,sizeof(message),0);
                if(test ==-1)
                {
                    printf("\nreceive error ");
                    exit(1);
                }
                printf("\nreceived message is %s",message);
                char buff1[50];
                printf("\nEnter a message ");
                scanf("%s",buff1);
                test = send(cli_sock,buff1,sizeof(buff1),0);
                if(test == -1)
                {
                    printf("\nsend error");
                    exit(1);
                }
                printf("\nMessage succesfully sent");
                
            }
            else
            {
                printf("\nParent process is executing :: %d",getpid());
                close(cli_sock);
                exit(1);
            }
        }
        else
        {
            printf("accept error");
            exit(1);
        }
    }
}