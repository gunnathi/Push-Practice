import java.util.Scanner;
public class Employee {
	int id;
	String name;
	float salary;
	String city;
	static String company="DXC";
	
	public void acceptDetails() {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the id no");
		this.id=scan.nextInt();
		scan.nextLine();
		System.out.print("Enter the name");
		this.name=scan.nextLine();
		System.out.print("Enter the salary");
		this.salary=scan.nextFloat();
		scan.nextLine();
		System.out.print("Enter the city");
		this.city=scan.nextLine();
		
	}
	
	public void displayDetails() {
		System.out.println("The id is "+ this.id);
		System.out.println("The name is "+ this.name);
		System.out.println("The salary is "+ this.salary);
		System.out.println("The city is "+ this.city);
		System.out.println("The company is"+Employee.company);
		
	}

}
