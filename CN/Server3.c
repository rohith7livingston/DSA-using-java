#include<stdio.h>
#include<sys/types.h>
#include<arpa/inet.h>
#include<netinet/in.h>
#include<sys/socket.h>
#include<unistd.h>
#include<stdlib.h>

int main()
{
    int sock,cli_sock,test;
    char buff1[50],buff2[50];
    struct sockaddr_in server,client;
    sock = socket(AF_INET,SOCK_DGRAM,IPPROTO_UDP);
    if(sock == -1)
    {
        printf("\nsocket creation error");
        exit(1);
    }
    server.sin_family=AF_INET;
    server.sin_addr.s_addr= inet_addr("127.0.0.1");
    server.sin_port = htons(7070);
    test = bind(sock,(struct sockaddr*)&server,sizeof(server));
    if(test == -1)
    {
        printf("\nerror in binding");
        exit(1);
    }
    while(1)
    {
        int len = sizeof(client);
        int pid = fork();
       if(pid == 0)
       {
            printf("\nchild process executing ");
            printf("\nchild process %d",getpid());
            int accp = recvfrom(sock,buff1,sizeof(buff1),0,(struct sockaddr*)&client,&len);
            if(accp == -1)
            {
                printf("\nError in receiving");
                exit(1);
            }
            printf("\nreceivd message is :: %s",buff1);
            int sen = sendto(sock,buff1,sizeof(buff1),0,(struct sockaddr*)&client,&len);
            if(sen == -1)
            {
                printf("\nError in sending");
                exit(1);
            }
            printf("\nMessage is successfully sent");
       }
       else{
            printf("\nParent process is executing PID :: %d",getpid());
       }
    }
    close(sock);
}