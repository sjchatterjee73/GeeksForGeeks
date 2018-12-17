// url: https://practice.geeksforgeeks.org/problems/binary-number-to-decimal-number/0/?track=interview-mathematical
#include<iostream>
#include<cmath>
using namespace std;
long getPower(long a, long b){
	long p = 1;
	while(b--){
		p *= a;
	}
	return p;
}
long getDec(long num, long power){
    return num * getPower(2, power);
}
int main()
 {
	int t;
	cin>>t;
	
	while(t--){
	    long num;
	    cin>>num;
	    long original = num;
	    long sum =0;
	    long power = 0;
	    
	    while(num){
	        sum += getDec(num % 10, power);
	        power++;
	        num /=10;
	    }
		
		cout<<sum<<endl;
	}
	return 0;
}
