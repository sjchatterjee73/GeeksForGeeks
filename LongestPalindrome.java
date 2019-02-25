/*
Given a string S, find the longest palindromic substring in S. Substring of string S: S[ i . . . . j ] where 0 ≤ i ≤ j < len(S). Palindrome string: A string which reads the same backwards. More formally, S is palindrome if reverse(S) = S. Incase of conflict, return the substring which occurs first ( with the least starting index ).

NOTE: Required Time Complexity O(n2).

Input:
The first line of input consists number of the testcases. The following T lines consist of a string each.

Output:
In each separate line print the longest palindrome of the string given in the respective test case.

Constraints:
1 ≤ T ≤ 100
1 ≤ Str Length ≤ 104

Example:
Input:
1
aaaabbaa

Output:
aabbaa

Explanation:
Testcase 1: The longest palindrome string present in the given string is "aabbaa".

.SJ
*/


/*
    1. start with 0, to len-1, and 0 to len-2, and 0 to len-3 and so on ..
    2. check every substring 0 to current len, if palindrome found return the string
    3. else increment 0 to 1
    4. repeat.
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static Scanner inp = new Scanner(System.in);
    private static boolean isPalindrome(String s){
        if(s.length() == 1) return false;
        int f = 0;
        int l = s.length()-1;
        while(true){
           // if(l == s.length()/2) break;
            if(f == s.length()-1) break;
            if(l == 0) break;
            
            if(s.charAt(l) != s.charAt(f)) return false;
            l--;
            f++;
        }
        return true;
    }
    private static String get(String s, int in, int len, String temp, boolean ch){
        if(in == len && ch == false) return ""+s.charAt(0);
        if(in == len) return temp;
        int n = len;
        while(n >= 0){
            if(in == n) break;
            String flag = s.substring(in, n);
            if(isPalindrome(flag) && flag.length() > temp.length()){
                ch = true;
                temp = flag;
                break;
            }
            n--;
        }
      return get(s, in+1, len, temp, ch);
    }
    private static String getLongestSubstring(String s, int in, int len, String temp, boolean ch){
        if(len == 1) return s;
        
        return get(s, in, len, temp, ch);
    }
    public static void main (String[] args) {
        int t = inp.nextInt();
        while(t-- > 0){
            String s = inp.next();
            System.out.println(getLongestSubstring(s, 0, s.length(), "", false));
        }
    }
}
