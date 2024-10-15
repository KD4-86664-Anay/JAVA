import java.util.Scanner;

public class CheckDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number od Input:");
		int input=sc.nextInt();
		System.out.println("Enetr Num1 and Num2:");
		if(!sc.hasNextDouble())
		{
			System.out.println("Number first is not Double");
			return;
		}
		double num1=sc.nextDouble();
		if(!sc.hasNextDouble())
		{
			System.out.println("Number second is not Double");
			return;
		}
		double num2=sc.nextDouble();
		
		double average=(num1+num2)/input;
	System.out.println("Agerage:"+average);
	}

}
