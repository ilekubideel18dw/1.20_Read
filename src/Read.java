import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read {
	public static void main(String[] args) {
		
		// Here, I define user only can enter one argument, not more than one or anyone.
		if (args.length > 1 ) {
			System.out.println("You enter more than one argument. Bye!");
		}
		else if (args.length < 1) {
			System.out.println("You don't enter a argument. Bye!");
		}
		else {
			
			// Here, I create a variable to save the file we define in the argument.
			try{
				File file = new File(args[0]);
				Scanner sc = new Scanner(file);
				
				// Here, I create a variable to read the text there is inside the file.
				while(sc.hasNextLine()){
					String line = sc.nextLine();
					System.out.println(line);
				}
				 
			}
			
			// If the program don't found any file with the name user put, is going to say "File not found...".
			catch(FileNotFoundException e){
				System.out.println("File not found...");
			}
		}
	}
}