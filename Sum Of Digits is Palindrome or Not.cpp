
//url: https://www.cricbuzz.com/live-cricket-scores/20302/aus-vs-ind-2nd-test-india-tour-of-australia-2018-19

#include<iostream>
using namespace std;
int isSame(int num, int sum){
    while(num){
        if((num%10)  != (sum%10)){
            return 0;
        }
        
        num /=10;
        sum /=10;
    }
    return 1;
}
int main()
 {
	int t;
	cin>>t;
	while(t--){
	    int num;
	    cin>>num;
	    int sum = 0;
	    while(num){
	        sum += (num%10);
	        num/=10;
	    }
	    
	    int rented = sum;
	    num = 0;
	    while(sum){
	        int temp = (sum % 10);
	        num = (num * 10) + temp;
	        sum /= 10;
	    }
	    
	    if(isSame(rented, num))
	        cout<<"YES"<<endl;
	    else
	        cout<<"NO"<<endl;
	}
	return 0;
}
