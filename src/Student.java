import java.util.ArrayList;
import java.util.Scanner;

public class Student {

	private String id;
	private String name;
	private String surname;
	private String department;
	private int grade;
	
	public Student() {
		
	}
	
	public Student(String id,String name,String surname,String department,int grade) {
		this.id=id;
		this.name=name;
		this.surname=surname;
		this.department=department;
		this.grade=grade;
		
	}
	
	public void setID(String id) {
		try {
		Scanner read=new Scanner(CreateFile.getInstance());
		Scanner scan=new Scanner(System.in);
		
		ArrayList arr=new ArrayList();
		
		while(read.hasNext()) {
			String str=read.next();
			arr.add(str);
			for(int i=0;i<4;i++) {
				read.next();
			}
			
		}
		
		for(int i=0;i<arr.size();i++) {
			if(id.equals(arr.get(i))) {
				while(id.equals(arr.get(i))) {
					System.out.println("There is ID.Please Enter Different ID : ");
					i=0;
					id=scan.next();
					
				}
			}
			
		} 
			
			
		this.id=id;
		
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
	}
	
	public String getID() {
		return id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setSurname(String surname) {
		this.surname=surname;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setDepartment(String department) {
		this.department=department;
	}
	public String getDepartment() {
		return department;
	}
	
	public void setGrade(int grade) {
		this.grade=grade;
	}
	public int getGrade() {
		return grade;
	}
	
	
	
}
