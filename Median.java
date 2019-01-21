//url: https://practice.geeksforgeeks.org/problems/find-median-in-a-stream/0

/*
  Approach:
    Insert Item in Sorted Order in a List.
    If List.size() == Odd
      return the middle element
    else
      return (middle + middle.next.data)/2;
     
     That's it. :)
*/

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
class List{
    int data;
    List next;
    
    public List(int data){
        this.data = data;
        next = null;
    }
}
class Driver{
    List head = null;
    
    void push(int elem){
        List newnode = new List(elem);
        newnode.next = null;
        
        if(head == null){
            head = newnode;
        }else if(elem <= head.data){
            newnode.next = head;
            head = newnode;
        }else if(elem > head.data && head.next == null){
            head.next = newnode;
        }else{
            List current = null;
            List temp = head;
            
            while(temp.next != null){
                current = temp;                                
                if(temp.data == elem || (temp.data < elem && temp.next.data > elem)){
                    newnode.next = current.next;
                    current.next = newnode;
                    return;
                }
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    
    int getSize(){
        int count= 0;
        List temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    int getItem(int size){
        int count = 0;
        List temp = head;
        size /= 2;
        while(temp != null){
            if(count++ == size)
                return temp.data;
            temp = temp.next;
        }
        return -1;
    }
    int getItem2(int size){
        int var1 = 0, var2 = 0, count = 0;
        List temp = head;
        size /=2;
        while(temp != null){
            if(++count == size){
                var1 = temp.data;
                var2 = temp.next.data;
                break;
            }
            temp = temp.next;
        }
        return (var1+var2)/2;
    }
    int getMedian(int t){
        int size = getSize();        
        
        if(size % 2 != 0)
            return getItem(size);
        else
            return getItem2(size);
    }
}
class Median {
    static Scanner inp = new Scanner(System.in);
	public static void main (String[] args) {
		int t = inp.nextInt();
		Driver obj = new Driver();
		while(t-- > 0){
		    obj.push(inp.nextInt());            
		    System.out.println(obj.getMedian(t+1));
		}
	}
}
