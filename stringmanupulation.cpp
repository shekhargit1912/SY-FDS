#include<iostream>
using namespace std;
class withs
{
public:
	int length(char st1[60])
  {
int len=0;
while (st1[len]!='\0')
{
  len+=1;
}
    return len;
  }
  void copy(char st1[60], char st2[60])
  {
int i=0;
while (st1[i]!='\0') {
st2[i]=st1[i];
i++;

  /* code */
}
st2[i]='\0';
cout<<"copy ofthe string is "<<st2<<endl;

  }
  void concat(char st1[60],char st2[60])
  {
    int i=0,j=0;
    while(st1[i]!='\0')
    {
      i++;
    }
    while(st2[j]!='\0')
    {
      st1[i]=st2[j];
      i++;
      j++;
    }
    st1[i]='\0';
    cout<<"concatination of the string is"<<st1<<endl;


  }

  void compare(char st1[60],char st2[60])
  {
    int l1=length(st1), l2=length(st2);
    int i =0;
    if (l1==l2)
    {
        while(st1[i]!='\0' || st2[i]!='\0')
        {
          if(st1[i]>st2[i])
          {
            cout<<"st1 is greater than st2"<<endl;
            return;
          }
          else if (st2[i]>st1[i])
          {
            cout<<"str2 1 is greater than 2"<<endl;
            return;
          }
          else
          {
            i++;
          }
        }
        cout<<"bothe string are equal"<<endl;
    }
    else {
      cout<<"not e1ual"<<endl;
    }

  }

  void reverse(char st1[60])
  {
    char st2[50];
    int j=0;
    for(int i =length(st1)-1;i>=0;i--)
    {
      st2[j]=st1[i];
      j++;
    }
    st2[j]='\0';
    cout<<"reverse  of the strring "<<st1 <<"is"<<st2<<'\n';

  }


};
int main()
{
char st1[60],st2[60];
withs s1;
cout<<"enter the strin1"<<endl;
cin>>st1;
cout<<"enter the string 2"<<endl;
cin>>st2;
cout<<s1.length(st1)<<endl;
s1.copy(st1,st2);
s1.concat(st1,st2);
s1.compare(st1,st2);
s1.reverse(st1);


}
