import java.io.File;

public class CreateFile {
	
	private static File file=new File("mystudents.txt");
	
	private CreateFile() {
		
	}
	
	
	public static File getInstance() {
		return file;
	}
	
}
