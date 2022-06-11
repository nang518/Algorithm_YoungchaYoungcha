#include <cstdio>
#include <iostream>

using namespace std;

void bubbleSort(int data[], int n)
{
    int negativecount = 0;
    for(int i=0; i<n; i++)
    {
        for(int j=0; j<n-1-i; j++)
        {
            if(data[j]>data[j+1])
            {
                int temp = data[j];
                data[j] = data[j+1];
                data[j+1] = temp;
                negativecount++;
            }
        }
        if(negativecount == 0)
            break;
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

    bubbleSort(data,n);

    for(int i=0; i<n; i++)
    {
        printf("%d ",data[i]);
    }

    delete[] data;
    return 0;
}