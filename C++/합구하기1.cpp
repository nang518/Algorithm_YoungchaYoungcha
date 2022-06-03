//정수 N개가 주어진다. N개의 정수의 합을 출력하는 프로그램 작성
#include <stdio.h>
#include <iostream>

using namespace std;

int getSum(int data[], int n)
{
    int answer = 0;
    
    for(int i=0; i<n; i++)
        answer += data[i];

    return answer;
}

int main()
{
    int n;
    int *data;

    scanf("%d", &n);
    data = new int[n];
    for(int i=0; i<n; i++)
    {
        scanf("%d", &data[i]);
    }

    int answer = getSum(data,n);

    printf("%d\n",answer);
    delete[] data;
    return 0;
}