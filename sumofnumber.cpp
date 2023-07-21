#include<iostream>
using namespace std;
int main(){
    int n, first,second,third,sum;
    n=524;
    first=n/100;
    n=n%100;
    second=n/10;
    third=n%10;
    sum=first+second+third;
    cout<<"sum of 3 digit is :"<< sum <<endl;
}