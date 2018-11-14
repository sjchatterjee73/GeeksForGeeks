//url: https://practice.geeksforgeeks.org/problems/get-minimum-element-from-stack/1/?ref=self
//Name: Get minimum element from stack
int getMin(){
        if(s.isEmpty())
            return -1;
        else{
            Stack<Integer> temp = new Stack<Integer>();
            minEle = s.peek();
        
            if(s.size() == 1)
                return s.peek();
            
	        while(!s.isEmpty()){
	            if(s.peek() < minEle){
    	            minEle = s.peek();
	            }
	            temp.push(s.pop());    
	        }
	   
	         while(!temp.isEmpty()){
	            s.push(temp.pop());
	         }
	        return minEle;
        }
    }