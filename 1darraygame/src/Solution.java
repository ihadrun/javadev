import java.util.*;public class Solution {
	

    public static boolean canWin(int leap, int[] game) {
    	
    	int count=0;
    	for(int i=0;i<game.length;i++){
    	if(game[i]==0) {count++;}
    	
    
    	else if(game[i+leap]>game.length) 
    	{try{i=i+leap; }catch(Exception e) {
    		
   		 count=count+leap;
   		}
    	}
    	else if(game[i+leap]<game.length&&game[i+leap]==0) {
    		
    		i=i+leap;
    		count=count+leap;
    	}
    	
    	else {i++;}
    	}
    	
    	if(count<=game.length) { return true;}
    	else {return false;}
    	
    	}
    	    	
    	
    	
        
        // Return true if you can win the game; otherwise, return false.
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}