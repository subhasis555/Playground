#include<bits/stdc++.h>
using namespace std;

int main()
{
  //Type your code here
  int n,i,cnt=0;
  cin>>n;
  int x[n],y[n],v[n],t[n];
  for(i=0;i<n;i++)
  {
    cin>>x[i]>>y[i]>>v[i];
  }
  for(i=0;i<n;i++)
  {
    t[i]=(sqrt(x[i]*x[i]+y[i]*y[i]))/v[i];
  }
  map<int,int> freq;
  for(i=0;i<n;i++)
  {
    freq[t[i]]++;
  }
  map<int,int> :: iterator itr;
  for(itr=freq.begin();itr!=freq.end();itr++)
  {
    if(itr->second>1)
    {
      cnt+=itr->second*(itr->second-1)/2;
    }
  }
  cout<<cnt;
  return 0;
}