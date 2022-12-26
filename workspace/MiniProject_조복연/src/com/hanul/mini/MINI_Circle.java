package com.hanul.mini;

public class MINI_Circle {
 double radius;

public MINI_Circle(double radius) {
	this.radius = radius;
}

public double getRadius() {
	return radius;
}

public void setRadius(int radius) {
	this.radius = radius;
}
public double getCircleAdd() {
	double add=0;
	add = 3.14 * this.radius * this.radius;
	return add;
}
 
}
