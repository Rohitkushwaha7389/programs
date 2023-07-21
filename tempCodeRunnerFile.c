
int main(){
    int a=0,b=10;
    int *p1=&a,p2=&b;
    printf("%ld",p1-p2);
    return 0;
}