// Name: Stack using two queues
class GfG
{
    LinkedList<Integer> q1 = new LinkedList<Integer>();
    LinkedList<Integer> q2 = new LinkedList<Integer>();
    
    /*The method pop which return the element poped out of the stack*/
    int pop()
    {
	    while(!q1.isEmpty()){
	        q2.addLast(q1.removeLast());
	    }
	    if(q2.isEmpty())
	       return -1; 
	    
	    int t= q2.removeLast();
	    while(!q2.isEmpty()){
	        q1.addLast(q2.removeLast());
	    }
	    return t;
    }
	
    /* The method push to push element into the stack */
    void push(int a)
    {
	    q1.addFirst(a);
    }
}