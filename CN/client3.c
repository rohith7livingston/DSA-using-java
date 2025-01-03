#include<stdio.h>
#include<sys/types.h>
#include<arpa/inet.h>
#include<netinet/in.h>
#include<sys/socket.h>
#include<unistd.h>
#include<stdlib.h>

int main()
{
    int sock;
    char buff1[50];
    struct sockaddr_in server,client;
    sock = socket(AF_INET,SOCK_DGRAM,IPPROTO_UDP);
    if(sock == -1)
    {
        printf("Error in socket creation");
        exit(1);
    }
    server.sin_family = AF_INET;
    server.sin_addr.s_addr = inet_addr("127.0.0.1");
    server.sin_port = htons(7070);
    printf("\nEnter a message");
    scanf("%s",buff1);
    int test = sendto(sock,buff1,sizeof(buff1),0,(struct sockaddr*)&server,sizeof(server));
    if(test == -1)
    {
        printf("\nerror in sending");
        exit(1);
    }
    printf("\nMessage successfully sent");
    char buff2[50];
    int len = sizeof(server);
    int test = recvfrom(sock,buff2,sizeof(buff2),0,(struct sockaddr*)&server,&len);
    if(test == -1)
    {
        printf("\nerror in sending");
        exit(1);
    }
    printf("Message received succesfully :: %s",buff2);
}