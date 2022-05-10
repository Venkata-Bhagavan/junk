#include <stdio.h>
int main()
{
    int incomingStream[20] ;
    int pageFaults = 0;
    int frames;
    int m, n, s, pages;

    printf("\nEnter the number of Pages:\t");
    scanf("%d", &pages);
    
    printf("\nEnter reference page no. :\n");
    for( m = 0; m < pages; m++){
        printf("Page No. [%d]:\t", m + 1);
        scanf("%d", &incomingStream[m]);
    }
    printf("\n What are the total number of frames:\t");
    scanf("%d", &frames);


    printf("Incoming \t Frame 1 \t Frame 2 \t Frame 3");
    int temp[frames];
    for(m = 0; m < frames; m++)
    {
        temp[m] = -1;
    }

    for(m = 0; m < pages; m++)
    {
        s = 0;

        for(n = 0; n < frames; n++)
        {
            if(incomingStream[m] == temp[n])
            {
                s++;
                pageFaults--;
            }
        }
        pageFaults++;
        
        if((pageFaults <= frames) && (s == 0))
        {
            temp[m] = incomingStream[m];
        }
        else if(s == 0)
        {
            temp[(pageFaults - 1) % frames] = incomingStream[m];
        }
      
        printf("\n");
        printf("%d\t\t\t",incomingStream[m]);
        for(n = 0; n < frames; n++)
        {
            if(temp[n] != -1)
                printf(" %d\t\t\t", temp[n]);
            else
                printf(" - \t\t\t");
        }
    }

    printf("\nTotal Page Faults:\t%d\n", pageFaults);
    return 0;
}
