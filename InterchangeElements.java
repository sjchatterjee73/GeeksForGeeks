// url: https://www.geeksforgeeks.org/interchange-elements-of-first-and-last-columns-in-matrix/
import java.util.*;

class InterchangeElements{
	
	static void swap(int [][] array, int i, int j, int ii, int n){
		if(i == n)
			return;
		
		int temp = array[i][j];
		array[i][j] = array[i][ii];
		array[i][ii] = temp;
		
		swap(array, ++i, j, ii, n);
	}
	public static void main(String [] args){
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		
		int [][] array = new int[n][n];
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				array[i][j] = inp.nextInt();
			}
		}
		
		swap(array, 0, 0, n-1, n);
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
}