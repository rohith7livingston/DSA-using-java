#include <stdio.h>
#include<stdlib.h>
#include<sys/socket.h>
#include<netinet/in.h>
#include<arpa/inet.h>
#include<sys/types.h>
#include<unistd.h>

int main()
{
    int sock,test;
    struct sockaddr_in server,addr;
    sock = socket(AF_INET,SOCK_STREAM,0);
    if(sock == -1)
    {
        printf("Socket error");
        exit(1);
    }
    server.sin_family = AF_INET;
    inet_aton("192.168.0.5",&server.sin_addr);
    server.sin_port = htons(7070);
    test = connect(sock,(struct sockaddr*)&server,sizeof(server));
    if(test == -1)
    {
        printf("Connect error");
        exit(1);
    }
    int len = sizeof(aadr);
    getpeerName(sock,(struct sockaddr*)&addr,&len);
    printf("\nIP address is %s",inet_ntoa(addr.sin_addr));
    printf("Port is %d",ntohs(addr.sin_port))
    return 0;
}