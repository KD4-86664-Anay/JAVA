package com.sunbeam;

public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice []Inv=new Invoice[5];
		Inv[0]=new Invoice("101","NutBold",5,10.5);
		Inv[1]=new Invoice("102","Book",50,100.50);
		Inv[2]=new Invoice("103","Pen",10,50.75);
		Inv[3]=new Invoice("104","SignPaper",25,75.20);
		Inv[4]=new Invoice("104","Color",2,1575.75);
		
		
		for(Invoice i:Inv)
		{
			i.Bill();
		}
	}

}
