import java.io.File;
import java.util.Scanner;

public class FindStudent implements Operations{

	
	public void doOperation(File file) {
		
		try {
			Scanner read=new Scanner(file);
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter The ID of Student You Want To Find : ");
			String id=scan.next();
			while(read.hasNext()) {
				String str=read.next();
				if(id.equals(str)) {
					System.out.println(id);
					for(int i=0;i<4;i++) {
					System.out.println(read.next());
					}
					break;
				}
				
				
			}
			
			
			
			
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			
		}
		
	}

}
