/*
  
A sorted array A[ ] with distinct elements is rotated at some unknown point, the task is to find the minimum element in it.

Expected Time Complexity: O(Log n)

Input:

The first line of input contains a single integer T denoting the number of test cases. Then T test cases follow. Each test case consist of two lines. The first line of each test case consists of an integer N, where N is the size of array.
The second line of each test case contains N space separated integers denoting array elements.

Output:
Corresponding to each test case, in a new line, print the minimum element in the array.

Constraints:

1 ≤ T ≤ 200
1 ≤ N ≤ 500
1 ≤ A[i] ≤ 1000

Example:

Input
1
5
4 5 1 2 3

Output
1
*/
import java.util.*;
class List{
	int data;
	List next;
	public List(int data){
		next = null;
		this.data = data;
	}
}

class Nodes{
	List head;
	public Nodes(){
		head = null;
	}
	void insert(int data){
		List newnode = new List(data);

		if(head == null){
			head = newnode;
			return;
		}else if(head.data >= data){
			newnode.next = head;
			head = newnode;
			return;
		}

		List temp = head;
		List current = null;

		while(temp != null){
			if(temp.next == null && temp != null){
				temp.next = newnode;
				return;
			}
			current = temp;

			if(temp.data == data || (temp.data < data && temp.next.data > data)){
				newnode.next = current.next;
				current.next = newnode;
				return;
			}
			temp = temp.next;
		}
	}

	void display(){
		System.out.println(head.data);
	}
}

class MinimumValue{
	static Scanner inp = new Scanner(System.in);
	static int t;
	public static void main(String[] args) {
		t = inp.nextInt();
		while(t-- > 0){
			int n = inp.nextInt();
			Nodes obj = new Nodes();
			while(n-- > 0){
				obj.insert(inp.nextInt());
			}
			obj.display();
		}
	}
}
