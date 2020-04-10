#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int main()
{
vector<int> vec{50,30,20,40,70,60,80 };
vector<int> vals{20,30,40,50,60,70,80 };
cout<<vec.size()<<endl;

int i=0;
   int  j=vals.size()-1;
    while(i<j)
    {
        cout<<vals[i]<<" "<<vals[j]<<" ";
        i++;
        j--;
    }
    if(i==j)
        cout<<vals[i];


return 0;
}
