import java.util.Scanner;

public class MainFunction {

		public static void main(String[] args) {
			  Scanner scan=new Scanner(System.in);
			  
			  Employee[] employees=new Employee[3];
			  
			  for(int i=0;i<employees.length;i++)
			  {
				  employees[i]=new Employee();
				  employees[i].acceptDetails();
				  employees[i].displayDetails();
			  }
		}
}
			  
			
			
		
			  

	


