/*
N개의 수치 데이터가 정수로 주어진다. 
개별 데이터들 중 전체 데이터의 평균에 가장 가까운 데이터와 그 번호를 출력하고자 한다.
평균과의 거리가 같은 숫자가 두개 이상일 경우, 가장 먼저 입력된 데이터를 우선으로 한다.
*/

/*
입력형식: 첫 줄 -전체 데이터의 수 N, 두번째 줄 -수치 데이터가 공백으로 구분되어 한 줄에 주어짐
출력형식: 한 줄에 평균과 가장 거리가 가까운 데이터의 번호와 그 값을 공백으로 구분하여 출려
*/

#include <cstdio>
#include <cmath>
#include <iostream>

using namespace std;

int findIndex(int data[], int n)
{
    int sum=0, x=0;
    for(int i=0; i<n; i++)
        sum += data[i];

    for(int i=0; i<n; i++)
    {
        int dx = abs(n*data[x]-sum); //평균과의 최소거리
        int di = abs(n*data[i]-sum); //현재 데이터와 평균과의 거리

        if(dx>di)
            x=i;
    }

    return x+1;
}

int main()
{
    int n;
    int *data;

    scanf("%d",&n);
    data = new int[n];

    for(int i=0; i<n; i++)
    {
        scanf("%d", &data[i]);
    }

    int answer = findIndex(data,n);
    printf("%d %d\n", answer,data[answer-1]);

    delete[] data;
    return 0;
}
