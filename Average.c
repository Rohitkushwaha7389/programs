#include<stdio.h>
int main(){
    int avg=0;
    int sum=0;
    int i=0;
    int num[4];
    for( i=0;i<4;i++){
        scanf("%d",&num[i]);
    }
    for(i=0;i<4;i++){
        sum=sum+num[i];
    }
    avg=sum/4;
    printf("Average of entered number is: %d",avg);
    return 0;
}