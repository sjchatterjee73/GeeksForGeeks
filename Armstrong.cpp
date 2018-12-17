//url: https://practice.geeksforgeeks.org/problems/armstrong-numbers/0/?track=interview-mathematical

#include<iostream>
using namespace std;
int getSquare(int num){
    return num * num * num;
}
int main()
 {
	int t;
	cin>>t;
	while(t--){
	    int num;
	    cin>>num;
	    int original = num;
	    int sum = 0;
	    while(num){
	        int rem = num % 10;
	        sum += getSquare(rem);
	        num /= 10;
	    }
	    
	    if(original == sum) 
	        cout<<"Yes"<<endl;
	    else
	        cout<<"No"<<endl;
	}
	return 0;
}
