#include <stdio.h>
#include<stdlib.h>
#include<sys/socket.h>
#include<netinet/in.h>
#include<arpa/inet.h>
#include<sys/types.h>
#include<unistd.h>
#include<fcntl.h>
#include<string.h>

int main()
{
    int sock,len,test;
    char buff1[50],buff2[50];
    struct sockaddr_in server,client;
    sock = socket(AF_INET,SOCK_STREAM,IPPROTO_TCP);
    if(sock < 0)
    {
        printf("sock error");
        exit(1);
    }
    server.sin_family = AF_INET;
    server.sin_addr.s_addr = inet_addr("127.0.0.1");
    server.sin_port= htons(7077);
    test = connect(sock,(struct sockaddr*)&server,sizeof(server));
    if(test == -1)
    {
        printf("connect error");
        exit(1);
    }
    printf("Enter a command");
    scanf("%s",buff1);
    test = send(sock,buff1,sizeof(buff1),0);
    if(test == -1)
    {
        printf("send error");
        exit(1);
    }
    test = recv(sock,buff2,sizeof(buff2),0);
     if(test == -1)
    {
        printf("recv error");
        exit(1);
    }
    printf("recv message is :: %s",buff2);
    exit(1);
}