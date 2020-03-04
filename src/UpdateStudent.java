import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class UpdateStudent implements Operations {

	@Override
	public void doOperation(File file) {
		try {
			
			Scanner read=new Scanner(file);
			Scanner scan=new Scanner(System.in);
			ArrayList arr=new ArrayList();
			System.out.println("Enter ID of The Student You Want To Update : ");
			String id=scan.next();
			while(read.hasNext()) {
				String str=read.next();
				arr.add(str);
			}
			
			int index;
			for(int i=0;i<arr.size();i++) {
				if(id.equals(arr.get(i))) {
					index=arr.indexOf(arr.get(i));
					Student student=new Student();
					System.out.println("Please Enter New Student ID : ");
					student.setID(scan.next());
					System.out.println("Please Enter New Student Name : ");
					student.setName(scan.next());
					System.out.println("Please Enter New Student Surname : ");
					student.setSurname(scan.next());
					System.out.println("Please Enter New Student Department : ");
					student.setDepartment(scan.next());
					System.out.println("Please Enter New Student Grade : ");
					student.setGrade(scan.nextInt());
					
					arr.set(index, student.getID());
					arr.set(index+1,student.getName());
					arr.set(index+2,student.getSurname());
					arr.set(index+3,student.getDepartment());
					arr.set(index+4,String.valueOf(student.getGrade()));
					
					
				}
				
			}
			
			
			FileWriter fw=new FileWriter(file);
			BufferedWriter bw=new BufferedWriter(fw);
			for(Object data:arr) {
				bw.write(String.valueOf(data));
				bw.newLine();
				
			}
			
			bw.close();
				
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

}
