/* url: https://www.geeksforgeeks.org/given-a-sorted-and-rotated-array-find-if-there-is-a-pair-with-a-given-sum/ */
;
import java.util.*;
class List{
	int data;
	List next;

	List(int data){
		this.data = data;
		next = null;
	}
}
class Driver{
	List head = null;
	void push(int data){
		List newnode = new List(data);

		if(head == null){
			head = newnode;
		}else{
			newnode.next = head;
			head = newnode;
		}
	}

	boolean isContains(int data){
		if(head == null)
			return false;
		else{
			List temp = head;
			while(temp != null){
				if(temp.data == data)
					return true;

				temp = temp.next;
			}

			return false;
		}
	}
}
class FindPairs{
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int t = inp.nextInt();

		while(t-- > 0){			
			int [] array = new int[inp.nextInt()];
			for(int i=0; i<array.length; i++){
				array[i] = inp.nextInt();
			}
			int x = inp.nextInt();

			Driver obj = new Driver();
			boolean ch = false;
			for(int i=0; i<array.length; i++){
				if(i == 0){
					obj.push(x-array[i]);
				}else{
					int dif = x - array[i];
					if(obj.isContains(array[i])){						
						ch = true;
						break;
					}else{
						obj.push(dif);
						continue;
					}
				}				
			}

			if(!ch)
				System.out.println("false");
			else
				System.out.println("true");
		}
	}
}