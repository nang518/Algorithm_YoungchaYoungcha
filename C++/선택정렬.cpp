#include <cstdio>
#include <iostream>

using namespace std;

int getMinIndexInRange(int data[], int n, int begin, int end)
{
    int index = begin;
    for(int i=begin; i<=end; i++)
    {
        if(data[index]>data[i])
            index = i;
    }

    return index;
}

void selectionSort(int data[], int n)
{
    for(int i=0; i<n; i++)
    {
        int minIndex = getMinIndexInRange(data,n,i,n-1);

        int temp = data[minIndex];
        data[minIndex] = data[i];
        data[i] = temp;
    }
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

    selectionSort(data,n);

    for(int i=0; i<n; i++)
    {
        if(i>0)
        {
            printf(" ");
        }
        printf("%d",data[i]);
    }

    delete[] data;
    return 0;
}