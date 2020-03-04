import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DeleteStudent implements Operations {

	@Override
	public void doOperation(File file) {
		
		try {
			
			Scanner read=new Scanner(file);
			Scanner scan=new Scanner(System.in);
			ArrayList arr=new ArrayList();
			System.out.println("Enter ID of The Student You Want To Delete : ");
			String id=scan.next();
			while(read.hasNext()) {
				String str=read.next();
				arr.add(str);
			}
			
			
			
			int index;
			for(int i=0;i<arr.size();i++) {
				if(id.equals(arr.get(i))) {
					index=arr.indexOf(arr.get(i));
					arr.remove(index);
					arr.remove(index);
					arr.remove(index);
					arr.remove(index);
					arr.remove(index);
					
					
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
