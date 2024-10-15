import java.util.Scanner;

public class Question2 {
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
int num;
int total=0;
do {
System.out.println("1.Dosa");
System.out.println("2.Samosa");
System.out.println("3.Idli");
System.out.println("4.SambarVada");
System.out.println("5.Ice-cream");
System.out.println("6.Upma");
System.out.println("7.Tari-Poha");
System.out.println("8.Pav Bhaji");
System.out.println("9.Rabdi");
System.out.println("10.Generate Bill");
System.out.println("Choice the Option...");
num=sc.nextInt();

switch(num)
{
case 1:{
	System.out.println("Enter the Quantity");
	int Qty=sc.nextInt();
	total+=Qty*5;
	}
	break;

case 2:{
	System.out.println("Enter the Quantity");
	int Qty=sc.nextInt();
	total+=Qty*10;
}
	break;
case 3:{
	System.out.println("Enter the Quantity");
	int Qty=sc.nextInt();
	total+=Qty*15;	
}
break;
case 4:{
	System.out.println("Enter the Quantity");
	int Qty=sc.nextInt();
	total+=Qty*20;	
}
break;
case 5:{
	System.out.println("Enter the Quantity");
	int Qty=sc.nextInt();
	total+=Qty*25;	
}
break;
case 6:{
	System.out.println("Enter the Quantity");
	int Qty=sc.nextInt();
	total+=Qty*30;
	}
	break;

case 7:{
	System.out.println("Enter the Quantity");
	int Qty=sc.nextInt();
	total+=Qty*35;
}
	break;
case 8:{
	System.out.println("Enter the Quantity");
	int Qty=sc.nextInt();
	total+=Qty*40;	
}
break;
case 9:{
	System.out.println("Enter the Quantity");
	int Qty=sc.nextInt();
	total+=Qty*45;	
}
break;
case 10:
	System.out.println("Bill:"+total);
	System.exit(0);
	break;

}
}while(num!=10);
}
}
