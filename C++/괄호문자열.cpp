#include <iostream>
#include <string>
#include <stack>
#include <vector>

using namespace std;

class Parenthesis
{
public:
    bool type; //열린 괄호면 true, 닫힌 괄호면 false
    int index;

    Parenthesis(int index, bool type)
    {
        this -> index = index;
        this -> type = type;
    }

    Parenthesis(int index, char c)
    {
        this -> index = index;
        if(c == '(')
        {
            this -> type = true;
        }
        else
        {
            this -> type = false;
        }
    }
};

bool isValidParentheses(const vector<Parenthesis>& parentheses)
//현재 짝을 찾지 못한 열린 괄호들
{
    stack<Parenthesis> st;

    for(int i=0; i<parentheses.size(); i++)
    {
        Parenthesis p = parentheses[i];

        if(p.type == true)
        {
            st.push(p);
        }
        else if(p.type == false)
        {
            if(st.size()>0)
            {
                st.pop();
            }
            else
            {
                return false;
            }
        }
    }

    if(st.size()>0)
    {
        return false;
    }
    return true;
}

void process(int caseIndex)
{
    string str;
    cin >> str;

    vector<Parenthesis> parentheses;
    for(int i=0; i<str.length(); i++)
    {
        parentheses.push_back(Parenthesis(i,str[i]));
    }

    bool isValid = isValidParentheses(parentheses);

    if(isValid)
    {
        cout << "YES" << endl;
    }
    else
    {
        cout << "NO" << endl;
    }
}

int main()
{
    int caseSize;
    cin >> caseSize;

    for(int caseIndex = 1; caseIndex <= caseSize; caseIndex +=1)
    {
        process(caseIndex);
    }
}