#include <iostream>
#include <string>
#include <map>

using namespace std;

int main()
{
    int N;
    cin >> N;

    //후보 이름과 득표 수를 저장하는 key-value map
    map<string, int> frequencyMap;

    int maxFrequency = 0;

    //후보 이름이 하나 추가될 때마다 현재까지의 최다 득표 갱신, 최다 득표 후보 리스트 갱신
    for(int i=0; i<N; i++)
    {
        string st;
        cin >> st;
        frequencyMap[st]++;
        int k = frequencyMap[st];
        if(k>maxFrequency)
            maxFrequency = k;
    }

    cout << maxFrequency << endl;

    map<string, int> :: iterator it;
    for(it = frequencyMap.begin(); it!=frequencyMap.end(); it++)
    {
        if(it -> second == maxFrequency)
            printf("%s ", it->first.c_str());
    }
}