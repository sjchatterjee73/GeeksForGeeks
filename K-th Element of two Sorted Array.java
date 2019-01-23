//url:  https://practice.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array/0



/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static Scanner inp = new Scanner(System.in);
	public static void main (String[] args) {
		int t= inp.nextInt();
		while(t-- > 0){
		    int n = inp.nextInt();
		    int m = inp.nextInt();
		    int k = inp.nextInt();
		    
		    int [] array = new int[n+m];
		    for(int i=0; i<array.length; i++){
		        array[i] = inp.nextInt();
		    }
		    Arrays.sort(array);
		    System.out.println(k > array.length-1 ? "-1" : array[k-1]);
		}
	}
}
