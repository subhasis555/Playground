from math import factorial
n=int(input())
lis=list(map(int,input().split()))[:n]
q=int(input())
lst=[]
for _ in range(q):
  m=list(map(int,input().split()))[:2]
  lst.append(m)
mod=1000000007
fact=[]
fact.append(1)
for i in range(1,100000):
  fact.append((fact[i-1]*i)%mod)
for x in range(q):
  temp=lst[x]
  l=temp[0]
  r=temp[1]
  s=1
  for i in range(l,r+1):
    s=(s*fact[lis[i-1]])%mod
  ans=s%mod
  result=ans**(r-l)
  print(result%mod)