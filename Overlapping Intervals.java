/*package whatever //do not write package name here */
/*
	Approach:
	1. Take two array, one for intervals and one for interval's value
	2. sort them based on intervals increasing order;
	3. check every interval with next interval's value
	4. modify accordingly!

	SJ.

	url: https://practice.geeksforgeeks.org/problems/overlapping-intervals/0
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static Scanner inp = new Scanner(System.in);
    
    private static void sort(int [] intervals, int [] auxilaries){
        for(int i=1; i<intervals.length; i++){
            int key1 = auxilaries[i];
            int key = intervals[i];
            int j = i-1;
            while(j>=0 && key <= intervals[j]){
                auxilaries[j+1] = auxilaries[j];
                intervals[j+1] = intervals[j];
                --j;
            }
            auxilaries[j+1] = key1;
            intervals[j+1] = key;
        }
       // System.out.println("test");
    }
    
    private static void getOverlappingIntervals(int [] intervals, int [] auxilaries){
        List<Integer> list = new ArrayList<Integer>();
        int f = intervals[0];
        int l = auxilaries[0];
        /*
            i a
        -----------
            1 3
            2 4
            6 8
            9 10
        */
        int flag = 0;
        for(int i=1; i<intervals.length; i++){        	
            if(intervals[i] <= l){
                 if(auxilaries[i] >= l)
                 	l = auxilaries[i];               
            }else{
                list.add(f);
                list.add(l);
                f = intervals[i];
                l = auxilaries[i];
            }
            flag = i;
        }

        if(intervals[flag] <= l)
	   		if(auxilaries[flag] >= l)
				l = auxilaries[flag];
	       	list.add(f);
	       	list.add(l);
			       
       	
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
    }
	public static void main (String[] args) {
		int t = inp.nextInt();
		while(t-- > 0){
		    int n = inp.nextInt();
		    int [] intervals = new int[n];
		    int [] auxilaries = new int[n];
		    
		    for(int i=0; i<n; i++){
		        intervals[i] = inp.nextInt();
		        auxilaries[i] = inp.nextInt();
		    }
		    sort(intervals, auxilaries);
		  
		    getOverlappingIntervals(intervals, auxilaries);
		    System.out.println();
		}
	}
}