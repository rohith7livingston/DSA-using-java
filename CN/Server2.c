#include <stdio.h>
#include<stdlib.h>
#include<sys/socket.h>
#include<netinet/in.h>
#include<arpa/inet.h>
#include<sys/types.h>
#include<unistd.h>

int main()
{
    int res,sock;
    char buff1[20];
    struct sockaddr_in server,client;
    sock=socket(AF_INET,SOCK_STREAM,0);
    if(sock==-1){
        printf("error in creating a socket\n");
        exit(1);
    }else{
        server.sin_family=AF_INET;
        server.sin_addr.s_addr=inet_addr("127.0.0.1");
        server.sin_port=htons(8080);
        res=bind(sock,(struct sockaddr*)&server,sizeof(server));
        if(res==-1){
            printf("error in binding\n");
            exit(1);
        }
        else{
            listen(sock,5);
            while(1){
                int len=sizeof(client);
                int acc=accept(sock,(struct sockaddr*)&client,&len);
                if(acc==-1){
                    printf("error in accepting the client\n");
                }
                else{
                    int pid=fork();
                    if(pid==0){
                        printf("child process is executing\n");
                        printf("the child provess id is %d\n",getpid());
                        int res3=recv(acc,buff1,sizeof(buff1),0);
                        if(res3==-1){
                            printf("error in receive in the message from the client\n");
                            exit(1);
                        }{
                            printf("received message is %s",buff1);
                            res3=send(acc,buff1,sizeof(buff1),0);
                            printf("message is sent\n");
                        }
                    }
                    else if(pid>0){
                        printf("parent process executing\n");
                        printf("parent id is %d\n",getpid());
                        
                    }
                }
            }
        }
    }

    return 0;
}