#include <bits/stdc++.h>
using namespace std;

void insertToQueue(int arr[], int rearIndex){
    int toAdd;
    cout << "Enter Data : ";
    cin >> toAdd; 
    arr[rearIndex] = toAdd;
}

void printQueue(int arr[], int frontIndex, int rearIndex){
    if(frontIndex > rearIndex){
        cout << "\nQueue is Empty" << endl;
    }
    else{
        cout << "\nQueue is : ";
        for(int i=frontIndex; i<=rearIndex; i++){
            cout << arr[i] << " ";
        }
        cout << endl;
    }
}

int main(){
    int arr[30], choice = 1;
    int frontIndex = 0;
    int rearIndex = -1;

    while(choice != 0){
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
                if(rearIndex < 29){
                    insertToQueue(arr, rearIndex+1);
                    rearIndex ++;
                }
                else{
                    cout << "\nQueue is full" << endl;
                }
                break;

            case 2:
                if(frontIndex > rearIndex){
                    cout << "\nQueue is already empty." << endl;
                }
                else{
                    frontIndex ++ ;
                }
                break;

            case 3:
                printQueue(arr, frontIndex, rearIndex);
                break;
            
            default:
                if(choice != 0){
                    cout << "\nInvalid Choice";
                }
                break;
        }

        if(frontIndex > rearIndex){
            frontIndex = 0;
            rearIndex = -1;
        }

    }

}

