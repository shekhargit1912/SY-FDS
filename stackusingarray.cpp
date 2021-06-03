//shekhar 
#include<iostream>
#define MAX 10

using namespace std;

class Stack
{
    int top;
    int stack_array[MAX];
    bool isEmpty()
    {
        return top == -1;
    }
    bool isFull()
    {
        return top == MAX-1;
    }
public:
    Stack()
    {
        top = -1;
    }

    void push(int x)
    {
        if(!isFull())
        {
            stack_array[++top] = x;
        }
        else
            cout << "stack full " << endl;
    }

    void pop()
    {
        if(!isEmpty())
        {
            top--;
        }
        else
            cout << "stack is empty " << endl;
    }

    void find(int x)
    {
        int flag = 0;
        if(!isEmpty())
        {
            for(int i=0;i<=top;i++)
            {
                if(stack_array[i] == x)
                {
    cout << "found at position " << i << endl;
    flag = 1;
    break;
                }
            }
            if(flag == 0)
                cout << "number not found" << endl;
        }
        else
            cout << "stack is empty" << endl;
    }

    void display()
    {
        if(!isEmpty())
        {
            for(int i=0;i<=top;i++)
                cout << stack_array[i] << " ";
            cout << endl;
        }
        else
            cout << "Stack is empyt" << endl;
    }
};

int main()
{
    Stack s;
    s.push(15);
    s.push(25);
    s.push(35);
    s.push(45);
    s.push(55);
    s.display();
    s.find(25);
    s.pop();
    s.display();
    s.pop();
    s.display();
}
