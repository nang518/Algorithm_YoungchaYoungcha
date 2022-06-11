/*
오름차순 판별 프로그램 작성 (YES or NO)
첫 줄: N(학생 수)
두번째 줄: 학생들의 키 (총 N개) 
*/

#include <cstdio>
#include <iostream>

using namespace std;

bool isOrdered(int data[], int n)
{
    int count = 0;

    for(int i=0; i<n; i++)
    {
        if(data[i-1] > data[i])
        {
            count++;
            break;
        }
    }
    if(count>0)
        return false;
    else
        return true;
}

int main()
{
    int n;
    int *data;

    scanf("%d",&n);
    data = new int[n];

    for(int i=0; i<n; i++)
    {
        scanf("%d",&data[i]);
    }

    bool result = isOrdered(data,n);

    if(result)
    {
        printf("YES");
    }
    else
    {
        printf("NO");
    }

    delete[] data;
    return 0;
}