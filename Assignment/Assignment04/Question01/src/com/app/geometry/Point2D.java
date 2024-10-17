package com.app.geometry;

import java.util.Scanner;

public class Point2D {
public int x_axis;
public int y_axis;

public void accept()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value for x_axis and y_axis:");
	x_axis=sc.nextInt();
	y_axis=sc.nextInt();
}

public String getDetails(){
	
return "x_axiz:"+this.x_axis+"y_axis:"+this.y_axis;
}

public boolean isEqual(Point2D d)
{
	if((d.x_axis==this.x_axis)&&(d.y_axis==this.y_axis))
	{
		return true;
	}
	return false;
	
}

public double calculateDistance(Point2D p2)
{
	double ians=0.0;
	if((p2.x_axis==this.x_axis)&&(p2.y_axis==this.y_axis)){
		System.out.println("Distace are equal");
	
	}
	else {
		ians=Math.sqrt(Math.pow(p2.x_axis, p2.y_axis));
	}
	return ians;
}
}
