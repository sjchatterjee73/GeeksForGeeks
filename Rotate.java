/*
	url: https://practice.geeksforgeeks.org/problems/rotate-and-delete/0
*/
import java.util.Scanner;
import java.util.ArrayList;
class Rotate{
	static ArrayList<Integer> rotate(ArrayList<Integer> list,int count)
	{
		int length = list.size();
		list.add(0,list.remove(length-1));
		if(count < length)
			list.remove(length-count);
		else
			list.remove(0);
		return list;
	}
	public static void main(String args[])
	{
		Scanner sn = new Scanner(System.in);
		int cases = sn.nextInt();
		while(cases-- >0)
		{
			int n=sn.nextInt();
			ArrayList<Integer> al = new ArrayList<Integer>();
			for(int i=0;i<n;i++)
				al.add(sn.nextInt());
				
			int temp =1;
			while(al.size() >1)
			{
				al = rotate(al,temp);
				temp++;
			}								
			System.out.println(al.get(0));
		}
	}
}