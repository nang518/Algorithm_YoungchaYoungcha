#include <stdio.h>
#include <map>

using namespace std;

int main()
{
    int N;
    scanf("%d", &N);

    map<int,int> frequencyMap;

    for(int i=0; i<N; i++)
    {
        int X;
        scanf("%d", &X);
        frequencyMap[X]++;
        printf("%lu %d\n", frequencyMap.size(), frequencyMap[X]);
    }
    return 0;
}