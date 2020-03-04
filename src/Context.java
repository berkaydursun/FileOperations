import java.io.File;

public class Context {

	private Operations operation;
	
	
	
	public Context(Operations operation) {
		// TODO Auto-generated constructor stub
		this.operation=operation;
	}


	public void executeOperation(File file) {
		operation.doOperation(file);
		
	}
	
	
}
