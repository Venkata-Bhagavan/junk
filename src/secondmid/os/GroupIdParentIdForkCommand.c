#include <stdio.h>
#include <sys/types.h>
#include <unistd.h>

 main() {

  pid_t fork(void);
  pid_t pid, gpid;
  int n, p, i;
  printf("Enter the range of n : ");
  scanf("%d",&n);
  for(i=0; i<=n; i++){
      fork();
      printf("\n The parent process id is %d", getppid());
      printf("\n The child process id is %d", getpid());
      printf("\n The Group id is %d", getgid());
  }
 
}
