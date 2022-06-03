/*
몸무게가 P kg이 넘는 사람은 탑승할 수 없다.
승객의 몸무게 총 합은 Q kg을 넘을 수 없다.
인원 제한은 없다.
*/

/*단체손님은 모두 다 같이 탑승하길 원한다. 
단체 회원들 중 놀이기구를 탈 수 있는 사람은 몇 명인지, 
체중 제한을 통과한 사람들은 모두 함께 놀이기구를 탈 수 있는지 계산하는 프로그램 작성
*/

//입력 형식: 첫 줄 n,p,q: 동아리 회원 수, 제한 체중, 최대 하중
//출력 형식: 첫 출: 체중 제한에 걸리지 않은 회원의 수, 몸무게 총합
//두번째 줄: 단체손님 모두가 놀이기구에 탑승할 수 있는지 여부 (YES or NO)

#include <stdio.h>
#include <iostream>

using namespace std;

void solve(int data[], int n, int p, int q)
{
    int count = 0,weight_sum=0;
    for(int i=0; i<n; i++)
    {
        if(data[i] <= p)
        {
            count++;   
            weight_sum += data[i];
        }
    }
    printf("%d %d\n",count, weight_sum);

    if(weight_sum < q)
        printf("YES\n");
    else
        printf("NO\n");

}

int main()
{
    int n,p,q;
    int *data;

    scanf("%d %d %d",&n,&p,&q);
    data = new int[n];
    for(int i=0; i<n; i++)
    {
        scanf("%d", &data[i]);
    }

    solve(data,n,p,q);

    delete[] data;
    return 0;
}
