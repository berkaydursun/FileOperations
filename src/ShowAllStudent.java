import java.io.File;
import java.util.Scanner;

public class ShowAllStudent implements Operations{

	@Override
	public void doOperation(File file) {
		try {
		Scanner read=new Scanner(file);
		while(read.hasNext()) {
			
			String str=read.next();
			System.out.println(str);
			
		}
		System.out.println("All Students Showed Succesfully !");
		
		
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	

}
