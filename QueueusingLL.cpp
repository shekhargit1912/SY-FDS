#include <bits/stdc++.h>
using namespace std;

struct Node{   
    int data;
    struct Node *next;
};

Node *first = NULL;
Node *last = NULL;

void addToEnd();
void deleteFirst();
void printQueue();


int main(){
    int choice;
    while(true){
        cout << "\nEnter your Choice :-" << endl;
        cout << "1) Insert" << endl;
        cout << "2) Delete" << endl;
        cout << "3) Print" << endl;
        cout << "0) Exit" << endl;
        cout << "Choice : ";
        cin >> choice;

        switch (choice)
        {
            case 1:
                addToEnd();
                break;

            case 2:
                deleteFirst();
                break;

            case 3:
                printQueue();
                break;

            case 0:
                exit(0);
                break;
            
            default:
                cout << "\nInvalid Choice, please try again" << endl;
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
    temp->next = NULL;

    if(last != NULL){
        last->next = temp;
    }

    if(first == NULL){
        first = temp;
    }

    last = temp;
}


void deleteFirst(){
    if(first == NULL){
        cout << "=> Queue is already empty." << endl;
    }
    else{
        Node *temp = first;
        first = first->next;
        if(first == NULL){
            last == NULL;
        }
        temp->next = NULL;
        cout << "=> First element '" << temp->data << "' deleted." << endl;
        delete(temp);
    }
}


void printQueue(){
    if(first == NULL){
        cout << "=> Queue is empty." << endl;
    }
    else{
        cout << "=> Queue is : ";
        Node *temp = first;
        while(temp != NULL){
            cout << temp->data << ", ";
            temp = temp->next;
        }
        cout << endl;
    }
}
