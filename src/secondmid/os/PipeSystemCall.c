#include <stdio.h>
#include <sys/types.h>
#include <unistd.h>

 main() {

    int fp[2], nbytes;
    pid_t childpid;
    char string[] = "venkat \n";
    char readbuffer[80];
    pipe(fp);
    if ((childpid = fork()) == -1 ){
        perror("fork");
        exit(1);
    }else if (childpid == 0){
        close(fp[0]);
        write(fp[1], string, strlen(string)+1);
        exit(1);
    } else{
        close(fp[1]);
        nbytes = read(fp[0], readbuffer, sizeof(readbuffer));
        printf("Recieved String is %s", readbuffer);
    }

}
