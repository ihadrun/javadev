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
                    int y = sc.nextInt();
                  al[i].add(y);
                  //System.out.print(al[i]);
                }
              // System.out.print(al[1].get(0)); 
            }
         int q= sc.nextInt();
         for(int k=0;k<q;k++) {
             int x= sc.nextInt();
             int z=sc.nextInt();
             try{System.out.println(al[x-1].get(z-1)); }
             catch(Exception e){
                 System.out.println("ERROR!");
             }
             
            // System.out.print(al[x].get(z));
             
         }
         sc.close();
         
         

    }


}
