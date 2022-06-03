/*
데이터의 수 N과 그 데이터들이 순서대로 주어질 때,
같은 복무지로 처리해야 할 첫번째 데이터의 번호와 마지막 데이터의 번호를 구하는 프로그램
*/

/*
입력형식: 첫 줄 -데이터의 수 N
두번째 줄 - N줄에 걸쳐 해당 학생의 소속 학교
출력형식: 같은 복무지로 처리 할 첫 데이터와 마지막 데이터의 번호를 공백으로 구분하여 한 줄에 출력
*/

#include <stdio.h>
#include <string>
#include <iostream>

using namespace std;

void printIndexes(string school[], int n)
{
    int first = -1; //존재하지 않으면 -1
    int last = -1;

    for(int i=0; i<n; i++)
    {
        if(school[i] == "CNU")
        {
            if(first==-1)
                first = i+1;
            last = i+1;
        }
    }

    printf("%d %d\n", first,last);
}

int main()
{
    int n;
    char buff[11];
    string *school;

    scanf("%d",&n);
    school = new string[n];

    for(int i=0; i<n; i++)
    {
        scanf("%s",buff);
        school[i] = buff;
    }
    printIndexes(school,n);

    delete[] school;
    return 0;
}