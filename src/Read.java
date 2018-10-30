import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read {
	public static void main(String[] args) {
		
		if (args.length > 1 ) {
			System.out.println("You enter more than one parameter. Bye!");
		}
		else if (args.length < 1) {
			System.out.println("You don't enter a parameter. Bye!");
		}
		else {			
		try{
			File f = new File(args[0]);
			Scanner s = new Scanner(f);
			while(s.hasNextLine()){
			String line = s.nextLine();
			System.out.println(line);
			}
			 
			}catch(FileNotFoundException e){
			System.out.println("El archivo no existe...");
			}
		}
	}
}