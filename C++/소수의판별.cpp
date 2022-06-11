#include <cstdio>
#include <iostream>

using namespace std;

bool isPrime(int N)
{
    if(N==1) return false;
    for(int i=2; i<=N; i++)
    {
        for(int j=2; j<=i; j++)
        {
            if(i%j==0)
            {
                if(i==j)
                {
                    return true;
                }
                else
                    return false;
            }
        }
    }

    return true;
}

void testcase(int caseIndex)
{
    int n;
    scanf("%d", &n);

    bool result = isPrime(n);
    printf("Case #%d\n",caseIndex);
    if(result)
    {
        printf("YES\n");
    }
    else
    {
        printf("NO\n");
    }
}

int main()
{
    int caseSize;
    scanf("%d",&caseSize);
    for(int caseIndex = 1; caseIndex <= caseSize; caseIndex += 1)
    {
        testcase(caseIndex);
    }
    return 0;
}