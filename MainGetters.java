import java.util.Scanner;
public class MainGetters {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		GettersSetters gst1=new GettersSetters();
		
		gst1.setId(scan.nextInt());
		scan.nextLine();
		gst1.setName(scan.nextLine());
		gst1.setCity(scan.nextLine());
		
		System.out.println("The id is"+gst1.getId());
		System.out.println("The name is"+gst1.getName());
		System.out.println("The city is"+gst1.getCity());
		
				
		

	}

}
