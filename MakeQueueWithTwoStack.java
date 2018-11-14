/*
	Approach:
	A. if query input is 1, push it in stack-1
	B. if query input is 2, move all item from stack-1 to stack-2
		B.1. if stack-2 is empty, return -1
		B.2. else, return top of stack-2
	C. Move all the item from stack-2 to stack-1.
	
	url: https://practice.geeksforgeeks.org/problems/queue-using-two-stacks/1
*/
class GfG
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();
    /* The method insert to push element into the queue */
    void insert(int B)
    {
	    s1.push(B);
    }
	
    
    /*The method remove which return the element popped out of the queue*/
    int remove()
    {
	    while(!s1.isEmpty()){
	        s2.push(s1.pop());
	    }
	    int t  = s2.pop();
	    while(!s2.isEmpty()){
	        s1.push(s2.pop());
	    }
	    return t;
    }
}