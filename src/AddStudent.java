import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class AddStudent implements Operations{

	@Override
	public void doOperation(File file) {
		
		try {
			Scanner scan=new Scanner(System.in);
			Student student=new Student();
			System.out.println("Please Enter Student ID : ");
			student.setID(scan.next());
			System.out.println("Please Enter Student Name : ");
			student.setName(scan.next());
			System.out.println("Please Enter Student Surname : ");
			student.setSurname(scan.next());
			System.out.println("Please Enter Student Department : ");
			student.setDepartment(scan.next());
			System.out.println("Please Enter Student Grade : ");
			student.setGrade(scan.nextInt());
		
			FileWriter fw=new FileWriter(file,true);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write(student.getID());
			bw.newLine();
			bw.write(student.getName());
			bw.newLine();
			bw.write(student.getSurname());
			bw.newLine();
			bw.write(student.getDepartment());
			bw.newLine();
			bw.write(String.valueOf(student.getGrade()));
			bw.newLine();
			bw.close();
			System.out.println("Student added succesfully ! ");
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
			
		}
			
		
		
	}

	
	
	
	
	
	
}
