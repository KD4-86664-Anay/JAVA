package com.sunbeam;

public class Invoice {
String partNumber;
String PartDesc;
int qty;
double price;
public Invoice(String partNumber, String PartDesc, int qty, double price) {
	
	
	this.partNumber = partNumber;
	this.PartDesc = PartDesc;
	if(qty<0)
	{
	this.qty = 0;
	}else {
		this.qty = qty;
	}
	if(price<0)
	{
		this.price = 0.0;
	}else {
		this.price = price;
	}

	
	
}
public String getPartNumber() {
	return partNumber;
}
public void setPartNumber(String partNumber) {
	this.partNumber = partNumber;
}
public String getPartDesc() {
	return PartDesc;
}
public void setPartDesc(String partDesc) {
	PartDesc = partDesc;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public void Bill()
{
	double total=0;
	total=qty*price;
	System.out.println(total);
}

}
