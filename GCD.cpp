// url: https://practice.geeksforgeeks.org/problems/gcd-of-two-numbers/0/?track=interview-mathematical
#include<iostream>
using namespace std;

int isDivisible(int n, int i){
	return (n % i == 0);
}
int getGcd(int a, int b){
	int count = 0;
	for(int i=1; i<=b; i++){
		if((isDivisible(a, i) && (isDivisible(b, i)) && i > count))
			count = i;
	}
	
	return count;
}
int main(void){
	int t;
	cin>>t;
	
	while(t-- > 0){
		int f;
		cin>>f;
		int s;
		cin>>s;
		
		cout<<getGcd(f, s)<<endl;
	}
	return 0;
}
