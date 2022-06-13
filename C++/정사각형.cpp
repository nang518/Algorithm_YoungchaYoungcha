#include <iostream>
#include <iomanip>
#include <vector>
#include <cmath>
#include <set>

using namespace std;

class Point2D
{
public:
    int x;
    int y;
    int index;

    Point2D(int index, int x, int y)
    {
        this -> index = index;
        this -> x = x;
        this -> y = y;
    }

    Point2D(int x, int y)
    {
        this -> index = 1;
        this -> x = x;
        this -> y = y;
    }

    long long getSquaredDistanceTo(Point2D target)
    //두 좌표 제곱거리 계산
    {
        long long dx = abs(this->x-target.x);
        long long dy = abs(this->y-target.y);
        return dx*dx + dy*dy;
    }

    double getDistanceTo(Point2D target)
    //두 좌표 실수거리 계산
    {
        long long sqd = this -> getSquaredDistanceTo(target);
        return sqrt(sqd);
    }

    bool operator < (const Point2D& other) const
    {
        if(this -> x != other.x)
        {
            return this -> x < other.x;
        }

        return this -> y < other.y;
    }
};

long long getMaximumSquareArea(int n, const vector<Point2D>& points)
{
    long long answer = 0;
    set<Point2D> pSet;
    for(int i=0; i<n; i+=1)
    {
        pSet.insert(points[i]);
    }

    for(int i=0; i<n; i++)
    {
        Point2D pa = points[i];
        for(int j=0; j<n; j+=1)
        {
            Point2D pb = points[j];
            if(i==j) continue;

            long long area = pa.getSquaredDistanceTo(pb);

            if(area < answer) //이미 구한 값보다 더 작은 값은 스킵
                continue;

            int dx = pb.x - pa.x;
            int dy = pb.y - pa.y;

            //pa와 pb에 벡터<-dy, dx>를 더해 정사각형을 구성하는 두 점 계산
            Point2D pd(pa.x - dy, pa.y + dx);
            Point2D pc(pb.x - dy, pb.y + dx);

            //pc,pd의 점들이 pSet에 존재하는지 검사 (없으면 정사각형 불가)
            if((pSet.count(pc)>0) && pSet.count(pd)>0)
            {
                answer = max(answer, area);
            }
        }
    }   
    return answer;
}

void process(int caseIndex)
{
    int n;
    cin >> n;

    vector<Point2D> points;

    for(int i=0; i<n; i+=1)
    {
        int x,y;
        cin >> x >> y;
        points.push_back(Point2D(i,x,y));
    }

    long long answer = getMaximumSquareArea(n, points);

    cout<< fixed << setprecision(2) << answer << endl;
}

int main()
{
    int caseSize;
    cin >> caseSize;

    for(int caseIndex = 1; caseIndex <= caseSize; caseIndex += 1)
    {
        process(caseIndex);
    }
}