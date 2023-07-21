#include<stdio.h>
int main(){
    int a,b;
    scanf("%d%d",&a,&b)
    int *p1=&a,*p2=&b;
    printf("%ld",p1-p2);
    return 0;
}