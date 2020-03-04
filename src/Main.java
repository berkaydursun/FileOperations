import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file=CreateFile.getInstance();
		Scanner scan=new Scanner(System.in);
		Context ctxAdd=new Context(new AddStudent());
		Context ctxShow=new Context(new ShowAllStudent());
		Context ctxFind=new Context(new FindStudent());
		Context ctxDelete=new Context(new DeleteStudent());
		Context ctxUpdate=new Context(new UpdateStudent());
		
		int temp=-1;
		while(temp!=0) {
			System.out.println("******************\n"
					+ "Operation List : \n"
					+ "1 - Add Student \n"
					+ "2 - Show All Students \n"
					+ "3 - Find Student \n"
					+ "4 - Delete Student \n"
					+ "5 - Update Student \n"
					+ "0 - Quit \n"
					+ "********************");
			temp=scan.nextInt();
			switch(temp) {
			
			case 1 : ctxAdd.executeOperation(file);
			break;
			case 2 : ctxShow.executeOperation(file);
			break;
			case 3 : ctxFind.executeOperation(file);
			break;
			case 4 : ctxDelete.executeOperation(file);
			break;
			case 5 : ctxUpdate.executeOperation(file);
			break;
			case 0 : temp=0;
			break;
			
			
			}
			
			
			
			
			
			
			
		}
		
		
		
		
		

	}

}
