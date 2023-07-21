#include<iostream>
    using namespace std;
void perfectCube(int N)
{

    int cube;

    for (int i; i <= N; i++) {
        cube = i * i * i;
        if (cube == N) {
           cout << "Yes";
            return;
        }

        else if (cube > N) {
             cout << "NO";
            return;
        }
    }
}
 
int main()
{
    int N;
    cin>>N;
    perfectCube(N);
    return 0;
}