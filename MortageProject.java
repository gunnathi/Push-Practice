import java.util.Scanner;
public class MortageProject {

	public static void main(String[] args) {
	       final byte MONTHS_IN_YEAR=12;
	       final byte PERCENT=100;
	       
	  Scanner scan=new Scanner(System.in); 
	  System.out.println("Enter the principal");
	 int principal=scan.nextInt();
	  while(!(principal>1000 && principal<1000000))
	  {  System.out.println("Enter a value between 1000 and 1000000");
	      principal=scan.nextInt();
	  }
	  System.out.println("Enter the Annual interest rate");
	  float annualInterest=scan.nextFloat();
	  while(!(annualInterest>1 && annualInterest<30)) {
		  System.out.println("Enter a value between 1 and 30");
	  annualInterest=scan.nextFloat();
	  }
	  float monthlyInterest=annualInterest/PERCENT/MONTHS_IN_YEAR;
	  
	  System.out.println("Period in years");
	  byte years=scan.nextByte();
	  while(!(years>1 && years<=30)) {
		  System.out.println("Enter between 1 and 30");
	   years=scan.nextByte();
	  }
	  int numberofpayments =years* MONTHS_IN_YEAR;
	  
	  double mortage=principal*(monthlyInterest*Math.pow(1+monthlyInterest, numberofpayments))/
			         (Math.pow(1+monthlyInterest, numberofpayments)-1);
	  
	  System.out.println("The mortage is$"+mortage);
	  
	  
	  
	  
	  
	  
	  

	}

}
