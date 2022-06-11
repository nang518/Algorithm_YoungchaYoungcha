#include <cstdio>
#include <iostream>

using namespace std;

//좌표 (x,y)인 픽셀이 반지름 R인 원에 포함되는가?
bool isInside(long long x, long long y, long long R)
{
    long long sqd = x*x + y*y;
    if(sqd < R*R)
    {
        return true;
    }
    return false;
}

void testcase(int caseIndex)
{
    long long R;
    scanf("%lld",&R);
    
    long long sum = 0;

    for(long x=0; x<=R; x++)
    {
        for(long y=R; y>=0; y--)
        {
            if(isInside(x,y,R))
            {
                sum += (y+1);
                break;
            }
        }
    }
    printf("#%d\n",caseIndex);
    printf("%lld\n",sum*4);
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