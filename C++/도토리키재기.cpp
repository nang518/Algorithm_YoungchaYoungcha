/*
N개의 도토리에 대한 키와 생일 정보가 주어진다. 이 때 이번 달에 생일이 있는 도토리들 중 가장 키가 큰 도토리의 키를 출력하는 프로그램 작성
첫 줄: N(도토리의 수)
두번째 줄: N개의 도토리의 키
세번째 줄: N개의 도토리들의 생일이 속한 달
네번째 줄: M(현재 달)
*/

#include <cstdio>
#include <iostream>

using namespace std;

int getMaximumHeight(int height[], int month[], int n, int m)
{
    int maxHeight = -1;
    for(int i=n-1; i>=0; i--)
    {
        if(month[i]==m)
        {
            maxHeight = height[i];
            break;
        }
    }
    return maxHeight;
}

int main()
{
    int n,m;
    int *height;
    int *month;

    scanf("%d", &n);
    height = new int[n];
    month = new int[n];

    for(int i=0; i<n; i++)
    {
        scanf("%d", &height[i]);
    }
    for(int i=0; i<n; i++)
    {
        scanf("%d", &month[i]);
    }

    scanf("%d",&m);

    int answer = getMaximumHeight(height, month, n, m);

    printf("%d\n",answer);

    delete[] height;
    delete[] month;
    return 0;
}

