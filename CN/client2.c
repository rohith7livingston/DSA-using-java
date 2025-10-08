#include<stdio.h>
#include<sys/types.h>
#include<arpa/inet.h>
#include<netinet/in.h>
#include<sys/socket.h>
#include<unistd.h>
#include<stdlib.h>

int main()
{
    int sock,test;
    char buff[50],reciv[50];
    struct sockaddr_in server, client;
    sock = socket(AF_INET,SOCK_STREAM,IPPROTO_TCP);
    if(sock == -1)
    {
        printf("\nSocket creation error");
        exit(1);
    }
    server.sin_family = AF_INET;
    server.sin_addr.s_addr = inet_addr("127.0.0.1");
    server.sin_port = htons(7070);
    test = connect(sock,(struct sockaddr*)&server,sizeof(server));
    if(test == -1)
    {
        printf("\nconnect error ");
        exit(1);
    }
    printf("\nEnter a message ::");
    scanf("%s",buff);
    test = send(sock,buff,sizeof(buff),0);
    if(test == -1)
    {
        printf("\nmessage sending is unsuccssfull ");
        exit(1);
    }
    printf("\nMessage sent succesfully ");
    test = recv(sock,reciv,sizeof(reciv),0);
    if(test == -1)
    {
        printf("\nrecive error");
        exit(1);
    }
    printf("\nMessage recives successfully ");
    printf("\nMessage is %s",reciv);
    exit(1);
}