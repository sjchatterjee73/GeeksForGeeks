/*
	url: https://practice.geeksforgeeks.org/problems/kth-smallest-element/0

	Given an array and a number k where k is smaller than size of array, the task is to find the k’th smallest element in the given array. It is given that all array elements are distinct.

	Input:

	First Line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of three lines. First line of each test case contains an integer N denoting size of the array. Second line contains N space separated integer denoting elements of the array. Third line of the test case contains an integer K.

	Output:

	Corresponding to each test case, print the desired output in a new line.

	Constraints:

	1<=T<=200
	1<=N<=1000
	K

	Expected Time Complexity: O(n)

	Example:

	INPUT
	2
	6
	7 10 4 3 20 15
	3
	5
	7 10 4 20 15
	4
	Output:
	7
	15

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

	void display(int k){
		int count = 1;
		List temp = head;
		while(temp != null){
			if(count++ == k){
				System.out.println(temp.data);
				break;
			}
			temp = temp.next;
		}
	}
}

class KthSmallest{
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
			obj.display(inp.nextInt());
		}
	}
}