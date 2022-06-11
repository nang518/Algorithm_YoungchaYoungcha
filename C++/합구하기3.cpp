//(1이상 1이하의 모든 자연수의 합) + (1이상 2이하의 모든 자연수의 합) + (1이상 N이하의 모든 자연수의 합)
#include <cstdio>
#include <iostream>

using namespace std;

int getRangeSumFromOne(int i) //1부터 i 계산
{
    int answer =0;
    for(int j=1; j<=i; j++)
    {
        answer += j;
    }
    return answer;
}

long long getAnswer(int N)
{
    long answer = 0;
    for(int i=1; i<=N; i++)
    {
        int rangeSum = getRangeSumFromOne(i);
        answer += rangeSum;
    }
    return answer;
}

int main()
{
    int n;
    scanf("%d", &n);

    long long answer = getAnswer(n);
    printf("%lld\n",answer);

    return 0;
}