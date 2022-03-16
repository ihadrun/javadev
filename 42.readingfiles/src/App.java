import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("test.txt");
		
		 try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			String line;
			while ((line = br.readLine()) != null){
			System.out.println(line);}
		} catch (FileNotFoundException e) {
			System.out.println("File not found:" + file.toString());
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
		System.out.println("unable to read file:" + file.toString());
		}
		 

	}
 
}
