/*
총 N개의 앨범을 구매하여 화보들을 번호 순셔대로 정렬하여 보관하려고 한다.
첫 줄: N(총 화보의 수)
두번째 줄: 각 화보의 고유번호
*/

#include <cstdio>
#include <iostream>

using namespace std;

int getElementTypeCount(int data[], int n)
{
    int countType = 0;

    for(int i=1; i<=n; i++)
    {
        if(data[i-1] != data[i])
        {
            countType++;
        }
    }

    return countType;
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

    int answer = getElementTypeCount(data,n);

    printf("%d",answer);

    delete[] data;
    return 0;
}