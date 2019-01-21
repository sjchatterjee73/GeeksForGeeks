//url: https://practice.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1/?ref=self
class GfG
{
    boolean nowCheck(Node head, Stack<Integer> stack){
        if(head.data != stack.peek())
            return false;
        
        if(head.next == null || stack.isEmpty())
            return true;
          
        stack.pop();  
        return nowCheck(head= head.next, stack);
    }
    boolean isPalindrome(Node head) 
    {
        Stack<Integer> stack = new Stack<Integer>();
        Node temp = head;
        while(temp != null){
            stack.push(temp.data);
            temp = temp.next;
        }
        
        return nowCheck(head, stack);
    }    
}
