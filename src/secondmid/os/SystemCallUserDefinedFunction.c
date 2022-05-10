#include <stdio.h>

 main() {

   int n, i;
   FILE *fp;
   fp = fopen("Unix test", 'w');
   printf("Enter the value of n : ");
   scanf("%d",&n);
   if(fp!=NULL){
       for(i=1; i<=n; i++)
            fprintf(fp, "%s", "Unix lab \n");
        fclose(fp);
   }
   
}
