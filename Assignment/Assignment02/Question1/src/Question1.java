import java.util.Scanner;

public class Question1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int num=sc.nextInt();
	System.out.println("Number"+num);
	System.out.println("Binary Number:"+Integer.toBinaryString(num));
	System.out.println("Octal Value:"+Integer.toOctalString(num));
	System.out.println("Hexadecimal Value:"+Integer.toHexString(num));
	
	
}
}
