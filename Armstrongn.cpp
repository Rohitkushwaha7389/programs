#include<iostream>
using namespace std;
int main(){
    int n,sum=0,l=0,o=n;
    cin>>n;
    while(n>0){
        l=n%10;
        sum+=l*l*l;
        n=n/10;
    }
    if(sum==o){
        cout<<"Armstrong n";
    }else{
    cout<<"not armstrong n";
    }
    return 0;
}
