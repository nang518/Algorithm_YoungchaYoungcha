#include <iostream>
#include <vector>
#include <stack>

using namespace std;

class Tower
{
public:
    int index;
    int height;
    int targetTowerIndex;

    Tower(int index, int height)
    {
        this -> index = index;
        this -> height = height;
        this -> targetTowerIndex = 0;
    }

    void setTargetTowerIndex(int targetTowerIndex)
    {
        this -> targetTowerIndex = targetTowerIndex;
    }

    int getTargetTowerIndex()
    {
        return this -> targetTowerIndex;
    }
};

void findTargetTowers(vector<Tower>& towers)
//현재 다른 타워의 신호를 수신할 가능성이 있는 타워
{
    stack<Tower> stk;

    for(int i=0; i<towers.size(); i++)
    {
        Tower &t = towers[i];
        int targetTowerIndex = 0;

        while(stk.empty() == false && stk.top().height < t.height)
        //t보다 높이가 낮은 타워들은 이후에도 수신 가능성이 없으므로 제거
        {
            stk.pop();
        }

        if(stk.size()>0)
        {
            targetTowerIndex = stk.top().index;
        }
        t.setTargetTowerIndex(targetTowerIndex);

        stk.push(t);
    }
}

int main()
{
    int n;
    cin >> n;

    vector<Tower> towers;
    for(int i=0; i<n; i++)
    {
        int hi;
        cin >> hi;
        towers.push_back(Tower(i+1, hi));
    }

    findTargetTowers(towers);

    for(int i=0; i<n; i++)
    {
        if(i>0)
        {
            cout << " ";
        }

        Tower t = towers[i];
        int targetIndex = t.getTargetTowerIndex();
        cout << targetIndex;
    }
}