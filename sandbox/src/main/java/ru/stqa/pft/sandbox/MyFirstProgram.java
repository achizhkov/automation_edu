package ru.stqa.pft.sandbox;

import java.sql.SQLOutput;

public class MyFirstProgram {
	public static void main(String[] args) {
		hello("Viktor");
		area(5.0,6.0);
	}

	public static void hello(String name) {
		System.out.println("Hello, " + name +" !");
		}

	public static double area(double a, double b) {
		double sum = a * b;
		System.out.println(sum);
		return sum;
	}

	}