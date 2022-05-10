#include <stdio.h>

 main() {

    char max[] = "Unix Programming Lab \n";
    int n;
    printf("Enter value of n : ");
    scanf("%d",&n);
    display(max, n);

}

display(char *p, int d){
    int i;
    for(i=0; i<d; i++)
        write(1,p,strlen(p));
}
