#include <stdio.h>
#include <iostream>

using namespace std;

int getMax(int a, int b)
{
    if(a>b)
        return a;
    else
        return b;
}

int main()
{
    int p,q;
    scanf("%d %d",&p,&q);

    int answer = getMax(p,q);
    printf("%d\n", answer);

    return 0;
}