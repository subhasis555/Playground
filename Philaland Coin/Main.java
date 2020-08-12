#include<iostream>
using namespace std;

int main()
{
  int t,n;
  cin>>t;
  while(t--)
  {
  cin>>n;
  int c=0;
  while(n>0)
  {
    n>>=1;
    c++;
  }
  cout<<c<<endl;
  }
  return 0;
}