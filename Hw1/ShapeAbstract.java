/*
Java program to implement abstract class Shape and making derived class Triangle, 
Trapazoid, and Hexagon and call the same function NumberofSides()
*/


abstract class Shape{
	abstract void numberOfSides();
}

class Trapezoid extends Shape{

	@Override
	void numberOfSides() {
		System.out.println("Trapazoid has 4 sides ");	
	}
	
}

class Triangle extends Shape{

	@Override
	void numberOfSides() {
		System.out.println("Triangle has 3 sides");
	}
	
}

class Hexagon extends Shape{

	@Override
	void numberOfSides() {
		System.out.println("Hexagon has 6 sides");	
	}
	
}

public class ShapeAbstract {
	public static void main(String []args){
		Trapezoid trapezoid = new Trapezoid();
		Triangle triangle = new Triangle();
		Hexagon hexagon = new Hexagon();
		
		trapezoid.numberOfSides();
		triangle.numberOfSides();
		hexagon.numberOfSides();
	}
}
