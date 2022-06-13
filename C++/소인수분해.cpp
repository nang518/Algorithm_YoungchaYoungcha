#include <cstdio>
#include <vector>

using namespace std;

vector<int> factorize(long n)
{
    vector<int> factors;
    for(int div=2; div*div<=n; div+=1)
    {
        while(n%div==0)
        {
            factors.push_back(div);
            n /= div;
        }
    }
    if(n>1)
    {
        factors.push_back(n);
    }
    return factors;
}

void process(int caseIndex)
{
    long long n;
    scanf("%lld", &n);

    vector <int> factors = factorize(n);

    printf("#%d: \n",caseIndex);
    for(int i=0; i<factors.size(); ++i)
    {
        if(i>0)
        {
            printf(" ");
        }
        printf("%lld",factors[i]);
    }
    printf("\n");
}

int main()
{
    int caseSize;
    scanf("%d", &caseSize);

    for(int caseIndex = 1; caseIndex <= caseSize; ++caseIndex)
    {
        process(caseIndex);
    }
}