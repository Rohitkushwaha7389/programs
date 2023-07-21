#include<bits/stdc++.h>
using namespace std;
int main(){
    int n,i;
    int f=0;
    cin>>n;
    for(i=1;i<=n;i++){
        if(n%i==0)
        cout<<i<< endl;
    }
    while(n>0){
        f++;
        n=n/10;
    }
        cout<<endl<<"Total number of digit :"<<f;
    }
    
