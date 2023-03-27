package com.entornos.Garcia_Fernandez_Daniel.algoritmos;

public abstract class algoritmos {
	
	/**
	 * Método de fibonacci
	 * Recibe un número por teclado y calcula el fibonacci de dicho número
	 * 
	 * @param Es el número a calcular el fibonacci
	 *  
	 * @version 1.0
	 * 
	 * @author danie
	 * 
	 * @return devuelve el Fibonacci de dicho numero.
	 *
	 **/
	
	public static int fibonacci(long numero) {
		int x = 1, y = 0, z = 0;
		for (int i = 1; i <= numero; i++) {
			System.out.print(y + ", ");
			z = y;
			y = x;
			x = x + z;
		}
		return y;
	}
	
	/**
	 * Métodod para calcular el factorial de un número
	 * Recibe un numero por teclado y calcula el factorial de dicho número
	 * 
	 * @param Es el número con el que se calculará el factorial
	 * 
	 * @version 1.0
	 * 
	 * @author danie
	 * 
	 * @return devuelve el factorial de dicho numero.
	 **/
	
	
	public static double factorial(long numero) {
		double total = 1;
		for (int a = 1; a <= numero; a++) {
			total = total * a;
		}
		return total;
	}


}
