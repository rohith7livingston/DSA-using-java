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
    int sock,cli_sock,len,test,fd;
    struct sockaddr_in server, client;
    char buff1[50],buff2[50];
    sock = socket(AF_INET,SOCK_STREAM,IPPROTO_TCP);
    if(sock == -1)
    {
        printf("socket creation error");
        exit(1);
    }
    server.sin_family = AF_INET;
    server.sin_addr.s_addr = inet_addr("127.0.0.1");
    server.sin_port = htons(7077);
    test = bind(sock,(struct sockaddr*)&server,sizeof(server));
    if(test == -1)
    {
        printf("error in binding");
        exit(1);
    }
    listen(sock,5);
    while(1)
    {
        len = sizeof(client);
        cli_sock = accept(sock,(struct sockaddr*)&client,&len);
        if(cli_sock == -1)
        {
            printf("accept error");
            exit(1);
        }
        test = recv(cli_sock,buff1,sizeof(buff1),0);
        if(test == -1)
        {
            printf("receive error");
            exit(1);
        }
        strcat(buff1,">file.txt");
        system(buff1);
        fd = open("file.txt",O_RDONLY,0777);
        if(fd == -1)
        {
            printf("error opening file");
            exit(1);
        }
        read(fd,buff2,sizeof(buff2));
        test = send(cli_sock,buff2,sizeof(buff2),0);
        if(test == -1)
        {
            printf("sending error");
            exit(1);
        }
        printf("Message sent sucess fully");
        exit(1);
    }
}