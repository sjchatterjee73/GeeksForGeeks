//url: https://practice.geeksforgeeks.org/problems/meta-strings/0

#include <stdio.h>
#define SIZE 1000
int getPrint(char * array, char * aux){
    int size = 0, size1= 0;
    for(int i=0; array[i] != '\0'; i++)
        size++;
    
    for(int i=0; aux[i] != '\0'; i++)
        size1++;
    
    if(size != size1)
        return 0;
    
    int count = 0;
    for(int i=0; i<size; i++){
        if(array[i] != aux[i])
            count++;
    }
    
    if(count == 0)
        return 0;
    
    return (count == 2 || count == 1) ? 1: 0;
}
int main() {
	int t;
	scanf("%i",&t);
	
	while(t--){
	    char array[SIZE] = {0};
	    char aux[SIZE] = {0};
	    
	    scanf("%s ",&array);
	    scanf("%s",&aux);
	    
	    printf("%i\n", getPrint(array, aux));
	}
	return 0;
}
