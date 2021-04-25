#include<iostream>
using namespace std;
class Node{
public:
    int data;
    Node *next;

};
void dispklay(Node* n1)
{
  cout<<"NI "<<" n2 "<<" n3 "<<'\t'<<endl;
while (n1!=NULL)
{
  cout<<n1->data<<'\t';
  n1=n1->next;
}

}

int main()
{
int a,b,c;
Node* head=NULL;
Node* second=NULL;
Node* third=NULL;

head=new Node();
second=new Node();
third=new Node();

cout<<"enter the value to the first node"<<endl;
cin>>a;
head->data=a;
head->next=second;
std::cout << "value" << '\n';
std::cin >> b;
second->data=b;
second->next=third;

std::cout << "n3" << '\n';
std::cin >> c;
third->data=c;
third->next=NULL;
dispklay(head);

  return 0;
}
