//N개의 정수로 이루어진 배열과 찾고자 하는 값 M이 주어진다.
//이 배열에서 M이 존재하는 인덱스를 출력하는 프로그램 작성

#include <stdio.h>
#include <iostream>

using namespace std;

int findIndex(int data[], int n, int m)
{
    int index = -1;
    for(int i=0; i<n; i++)
    {
        if(data[i] == m)
            index = i;
    }

    return index;
}

int main()
{
    int n,m;
    int *data;

    scanf("%d %d", &n, &m);
    data = new int[n];
    for(int i=1; i<n; i++)
    {
        scanf("%d", &data[i]);
    }

    int answer = findIndex(data,n,m);

    printf("%d\n", answer);
    delete[] data;
    return 0;
}