// url: https://practice.geeksforgeeks.org/problems/npr/0/?track=interview-mathematical
#include<iostream>
using namespace std;
long getValue(int r, int s){
    if(r == s)
		return 1;
	
	return r * getValue(r - 1, s);
}
int main()
 {
	int t;
	cin>>t;
	
	while(t--){
	    int n;
	    cin>>n;
	    int r;
	    cin>>r;
	    
	    cout<<getValue(n, (n-r))<<endl;
	}
	return 0;
}
