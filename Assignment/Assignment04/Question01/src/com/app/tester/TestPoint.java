package com.app.tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point2D p1=new Point2D();
		Point2D p2=new Point2D();
		p1.accept();
		p2.accept();
		
		if(p1.equals(p2))
		{
			System.out.println("Both point are at same point");
		}else {
			double distance=p1.calculateDistance(p2);
			System.out.println("Distance between the points: " + distance);
		}
		
		
	}

}
