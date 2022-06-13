#include <cstdio>

using namespace std;

const int MAX_ROW = 0;
const int MAX_COL = 0;

class SudokuBoard
{
public:
    //칸의 번호로 행 번호 계산
    int getRowByIndex(int index)
    {
        return (index-1)/9 +1;
    }
    //칸의 번호로 열 번호 계산
    int getColByIndex(int index)
    {
        return (index-1)%9 +1;
    }
    //칸의 번호로 그룹 번호 계산
    int getGroupByIndex(int index)
    {
        int r =getRowByIndex(index);
        int c = getColByIndex(index);
        return getGroupByPosition(r,c);
    }
    //칸의 행,열로 그룹 번호 계산
    int getGroupByPosition(int row, int col)
    {
        int left = ((row-1)/3)*3+1;
        int offset = (col-1)/3;

        return left+offset;
    }
};

void process(int caseIndex)
{
    int index;
    scanf("%d",&index);

    SudokuBoard board = SudokuBoard();

    int row = board.getRowByIndex(index);
    int col = board.getColByIndex(index);
    int group = board.getGroupByIndex(index);

    printf("Case #%d: \n",caseIndex);
    printf("%d %d %d\n", row, col, group);
}

int main()
{
    int caseSize;
    scanf("%d",&caseSize);

    for(int caseIndex = 1; caseIndex <= caseSize; ++caseIndex)
    {
        process(caseIndex);
    }
}