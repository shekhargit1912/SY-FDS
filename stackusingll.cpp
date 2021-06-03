
//shekhra
// Stack 

#include <iostream>
using namespace std;

struct Node{   
    int data;
    struct Node *prev;
};

Node *last = NULL;

void addToEnd();
void deleteLast();

int main(){
    int task;

    while (true){
        cout << "\nEnter operation :- " << endl;
        cout << "1) Push" << endl;
        cout << "2) Pop" << endl;
        cout << "3) display" << endl;
        cout << "0) Exit" << endl;
        cout << "Choice : ";
        cin >> task;

        switch(task){
            case 1:
                addToEnd();
                break;

            case 2:
                deleteLast();
                break;

            case 3:
                if(last == NULL){
                    cout << "=> Stack is empty." << endl;
                }
                else{
                    //temp=last
                    while (last!=NULL)
                    {
                    cout << "=> element is '" << last->data << "'." << endl;
                    last=last->prev;
                        
                    }
                }
                break;

            case 0:
                exit(0);

            default:
                cout << "Invalid choice, please try again." << endl;
                break;
        }

    }

}

void addToEnd(){
    int value;
    cout << "Enter data : " ;
    cin >> value;

    Node *temp = new Node();
    temp->data = value;
    temp->prev = last;

    last = temp;
}


void deleteLast(){
    if(last == NULL){
        cout << "=> Stack is already empty." << endl;
    }
    else{
        Node *temp = last;
        last = last->prev;
        temp->prev = NULL;
        cout << "=> Top element '" << temp->data << "' popped." << endl;
        delete(temp);
    }
}

