/*package whatever //do not write package name here */
/* url: https://practice.geeksforgeeks.org/problems/parenthesis-checker/0/?ref=self */

import java.util.*;
import java.lang.*;
import java.io.*;

class Balance {
    static Scanner inp = new Scanner(System.in);
    static int t;
    static String str;
	public static void main (String[] args) {
		t = inp.nextInt();
		while(t-->0){
		    Stack<Character> stack = new Stack<Character>();
		    str = inp.next();
		    for(int i=0; i<str.length(); i++){
		        if(i == 0 && (str.charAt(i) == ')' || str.charAt(i) == ']' || str.charAt(i) == '}')){
		            stack.push(str.charAt(i));
		            break;
		        }
				if(str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{'){
					stack.push(str.charAt(i));
					continue;
				}
				if(!stack.isEmpty()){
					char c = stack.peek();
					if(c == '(' && (str.charAt(i) == ']' || str.charAt(i) =='}'))
						break;
					if(c == '{' && (str.charAt(i) == ')' || str.charAt(i) ==']'))
						break;					
					if(c == '[' && (str.charAt(i) == '}' || str.charAt(i) ==')'))
						break;
				}
				if(!stack.isEmpty()){					
					if((stack.peek() == '[') && (str.charAt(i) == ']')){
						stack.pop();
						continue;
					}
					
					if((stack.peek() == '(') && (str.charAt(i) == ')')){
						stack.pop();
						continue;
					}
					
					if((stack.peek() == '{') && (str.charAt(i) == '}')){
						stack.pop();
					}
				}					
			}
		    
		    if(stack.isEmpty())
		        System.out.println("balanced");
		    else
		        System.out.println("not balanced");
		}
	}
}