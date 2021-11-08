package ru.study_java.sandbox;

public class MyFirstProgram {

	public static void main(String[] args) {
		hello("World");
		hello("Alex");

		Square s = new Square(5);
		System.out.println("Площадь:"  + s.area());

		Rectangle r = new Rectangle(4,6);
		System.out.println("Площадь: " + r.area());

	}

	public static void hello(String somebody) {
		System.out.println("Hello," + somebody + "!");
	}


}
