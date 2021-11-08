package ru.study_java.sandbox;

public class MyFirstProgram {

	public static void main(String[] args) {
		hello("World");
		hello("Alex");
		double l = 5;
		System.out.println("Площадь:"  + area(l));

		double a = 4;
		double b = 6;
		System.out.println("Площадь: " + area(a, b));

	}

	public static void hello(String somebody) {
		System.out.println("Hello," + somebody + "!");
	}

	public static double area(double l) {
		return l * l;
	}


	public static double area(double a, double b) {
		return a * b;
	}
}
