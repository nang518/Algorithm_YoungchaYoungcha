#include <iostream>
#include <set>

using namespace std;

int main()
{
    int N;
    cin >> N;

    set<int> s;

    for(int i=0; i<N; i++)
    {
        int X;
        cin >> X;

        if(s.count(X)>0)
        {
            printf("DUPLICATED\n");
        }
        else
        {
            s.insert(X); //set에 등록
            printf("OK\n");
        }
    }
}