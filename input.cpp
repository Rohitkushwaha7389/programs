#include<iostream>
using namespace std;
int main(){
int a,b;
cin>>a>>b;
int c=0;
c=b;
b=a;
a=c;
cout<<"a"<<"="<<a<<endl;
cout<<"b"<<"="<<b;
return 0;
}