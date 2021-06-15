//Shekhar Chauguele
//infixtoprefix conver
#include<bits/stdc++.h>
using namespace std;

int priority(char oper){
    if(oper == '+' || oper == '-'){
        return (1);
    }
    if(oper == '*' || oper == '/'){
        return (2);
    }
    if(oper == '^'){
        return (3);
    }

    return 0;
}


string convert(string infix){
    int i;
    string postfix = "";
    stack <char> stk;

    for(i=0; i<infix.length(); i++){
        if(infix[i] == ' '){
            ;
        }

        if((infix[i] >= 'a' && infix[i] <= 'z') || (infix[i] >= 'A' && infix[i] <= 'Z')){
            postfix += infix[i];
        }
        else if(infix[i] == '(' || infix[i] == '{' || infix[i] == '['){
            stk.push(infix[i]);
        }
        else if(infix[i] == ')' || infix[i] == '}' || infix[i] == ']'){
            if(infix[i] == ')'){
                while(stk.top() != '('){
                    postfix += stk.top();
                    stk.pop();
                    if(stk.top() == '{' || stk.top() == '['){
                        cout << "Invalid Expression !!\n" << endl;
                        exit (0);
                    }
                }
                stk.pop();
            }
            else if(infix[i] == '}'){
                while(stk.top() != '{'){
                    postfix += stk.top();
                    stk.pop();
                    if(stk.top() == '(' || stk.top() == '['){
                        cout << "Invalid Expression !!\n" << endl;
                        exit (0);
                    }
                }
                stk.pop();
            }
            else{
                while(stk.top() != '['){
                    postfix += stk.top();
                    stk.pop();
                    if(stk.top() == '{' || stk.top() == '('){
                        cout << "Invalid Expression !!\n" << endl;
                        exit (0);
                    }
                }
                stk.pop();
            }
        }
        else{
            if(!stk.empty()){
                while(priority(infix[i]) <= priority(stk.top())){
                    // cout << "HI" << endl;
                    postfix += stk.top();
                    stk.pop();
                    if(stk.empty()){
                        break;
                    }
                }
            }
            stk.push(infix[i]);
        }
    }

    while(!stk.empty()){
        postfix += stk.top();
        stk.pop();
    }

    return postfix;
}
int main()
{
    string infix,out;
    cout<<"\n Enter infix expression:-"<<endl;
    cin>>infix;
    
    out=convert(infix);
    cout<<"Postfix:-"<<out;
}




