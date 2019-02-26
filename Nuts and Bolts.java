/* url: https://practice.geeksforgeeks.org/problems/nuts-and-bolts-problem/0/?ref=self */ 
/*
    Approaches:
        1. Make an array by combining both array with common elements
        2. create an auxilary map / key-value DS for storing elements in sorted order
        3. get value of every element from array, and swap it accordingly
        
        .SJ
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static Scanner inp = new Scanner(System.in);
   // static char [] auxilary = new char[]{'!', '#', '$', '%', '&', '*', '@', '^', '~'};
    static HashMap<Character, Integer> auxilary = new HashMap<Character, Integer>();
    private static void sortIt(char [] array){
        auxilary.put('!', 1);
        auxilary.put('#', 2);
        auxilary.put('$', 3);
        auxilary.put('%', 4);
        auxilary.put('&', 5);
        auxilary.put('*', 6);
        auxilary.put('@', 7);
        auxilary.put('^', 8);
        auxilary.put('~', 9);
        for(int i=1; i<array.length; i++){
            char key = array[i];
            int j =i-1;
            while(j>=0 && auxilary.get(key) <= auxilary.get(array[j])){
                array[j+1] = array[j];
                --j;
            }
            array[j+1] = key;
        }
    }
	public static void main (String[] args) {
		int t = inp.nextInt();
		while(t-->0){
		    int n = inp.nextInt();
		    char [] array = new char[n];
		    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		    for(int i=0; i<n; i++){
		        array[i] = inp.next().charAt(0);
		    }
		    for(int i=0; i<n; i++){
		        map.put(inp.next().charAt(0), 1);
		    }
		    
		    String s = "";
		    for(int i=0; i<n; i++){
		        if(map.containsKey(array[i]))
		            s += array[i];
		    }
		    array = s.toCharArray();
		    sortIt(array);

		    for(int i=0; i<array.length; i++){
		    	System.out.print(array[i]+" ");
		    }
		    System.out.println();
		     for(int i=0; i<array.length; i++){
		    	System.out.print(array[i]+" ");
		    }
		    System.out.println();
		}
	}
}
