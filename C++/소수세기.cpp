#include <cstdio>
#include <vector>

using namespace std;

class Sieve
{
public:
    int maximumValue;
    vector<bool> isPrime;
    Sieve(int maximumValue)
    {
        this -> maximumValue = maximumValue;
        this -> isPrime.assign(maximumValue +1, false);
        this -> fillSieve();
    }

    bool isPrimeNumber(int num) const
    {
        return this -> isPrime[num];
    }

    //isPrime 배열의 값을 채우는 함수
    void fillSieve()
    {
        isPrime.assign(this -> maximumValue, true); //모두 소수라고 저장
        isPrime[0] = isPrime[1] = false; //0과 1은 소수가 아님

        for(int num=2; num <= maximumValue; num+=1)
        {
            if(isPrime[num] == false) //이미 소수가 아님을 처리한 수는 건너뛰기
            {
                continue;
            }
            //num의 배수만큼 숫자 증가시키면서 배수 지우기
            for(long long mul = (long long) num * num; mul <= maximumValue; mul += num)
            {
                int index = (int) mul;
                isPrime[index] = false;
            }
        }
    }
};

vector<int> getAllPrimeNumbers(int from, int to, const Sieve& sieve)
{
    vector<int> primes;

    for(int num = from; num = to; num += 1)
    {
        if(sieve.isPrimeNumber(num))
        {
            primes.push_back(num);
        }
    }

    return primes;
}

void process(int caseIndex, const Sieve &sieve)
{
    int L,R;
    scanf("%d %d", &L, &R);

    vector<int> allPrimeNumbers = getAllPrimeNumbers(L,R,sieve);

    printf("Case #%d: \n",caseIndex);
    printf("%d\n", (int)allPrimeNumbers.size());
}

int main()
{
    const int MAX_VALUE = 1000000;
    Sieve sieve = Sieve(MAX_VALUE);

    int caseSize;
    scanf("%d",&caseSize);

    for(int caseIndex = 1; caseIndex <= caseSize; ++caseIndex)
    {
        process(caseIndex, sieve);
    }
}