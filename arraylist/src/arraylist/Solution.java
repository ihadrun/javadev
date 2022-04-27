package arraylist;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer>[] al = new ArrayList[n];
		
		 for (int i = 0; i < n; i++) {
	            al[i] = new ArrayList<Integer>();
	            int f = sc.nextInt();
	            for(int j=0;j<f;j++) {
	            	al[i].add(sc.nextInt());
	            	
	            }
	            
	        }
		 int q= sc.nextInt();
		 for(int k=0;k<q;k++) {
			 int x= sc.nextInt();
			 int y=sc.nextInt();
			 System.out.println(al[x].get(y));
			 
		 }

	}

}
