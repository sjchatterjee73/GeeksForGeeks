/*
  It is a universal iterator as we can apply it to any Collection object. By using Iterator, we can perform both read and remove operations.Try this problem using Iterator.

  Given n spaced integers which are to be put in an ArrayList and an integer k.Iterate the Array List using iterator and remove all the numbers of the ArrayList which are less than k . And then print the sorted ArrayList.

  Input: 
  The first line will contain an integer T (number of test cases). First line of each test case consists of two integers n and k. Second and last line of each test case consists of n spaced integers.

  Output: 
  Print the sorted Array List after removing all the elements which are less than integer k.

  Constraints: 
  1 < = T < = 1000
  1<= n , k , element<= 104

  Example:
  Input:
  2
  5 8
  1 6 9 2 11
  4 13
  1 4 6 9

  Output:
  [9, 11]
  []

  Contributor: S_A
  Author: saksham0751
  url: https://practice.geeksforgeeks.org/problems/java-iterator/0
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static Scanner inp = new Scanner(System.in);
    static int t, size, k;
	public static void main (String[] args) {
		t = inp.nextInt();
		while(t-- > 0){
		    size = inp.nextInt();
		    k = inp.nextInt();
		    ArrayList<Integer> list = new ArrayList<Integer>();
		    
		    while(size-- > 0){
		        list.add(inp.nextInt());
		    }
		    Collections.sort(list);
		    Iterator iterator = list.iterator();
		    while(iterator.hasNext()){
		        int item = (int) iterator.next();
		        if(item < k)
		            iterator.remove();
		    }
		    System.out.println(list);
		}
	}
}
