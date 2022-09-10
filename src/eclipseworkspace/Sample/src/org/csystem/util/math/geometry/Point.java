/*------------------------------------------------------------------
	FILE		: Point.java
	AUTHOR		: Java-Apr-2022 Group
	LAST UPDATE	: 10.09.2022
	
	Point class that represents a 2(two) dimensional point in Cartesian
	plane
	
	Copyleft (c) 1993 by C and System Programmers Association
	All Rights Free	
------------------------------------------------------------------ */
package org.csystem.util.math.geometry;

public class Point {
	public double x;
	public double y;
	
	public Point()	
	{		
	}
	
	public Point(double a)
	{
		x = a;
	}
	
	public Point(double a, double b)
	{
		x = a;
		y = b;
	}
	
	public double distance(double a, double b)
	{
		return Math.sqrt(Math.pow(x - a, 2) + Math.pow(y - b, 2));				
	}
	
	public double distance(Point other)
	{
		return distance(other.x, other.y);
	}	
	
	public void offset(double dxy)
	{
		offset(dxy, dxy);
	}
	
	public void offset(double dx, double dy)
	{
		x += dx;
		y += dy;
	}
	
	public String toString()
	{
		return String.format("(%f, %f)", x, y);
	}
}
