package com.entornos.Garcia_Fernandez_Daniel.algoritmos;

public abstract class algoritmos {
	
	/**
	 * Metodo de fibonacci
	 * Recibe un número por teclado y calcula el fibonacci de dicho número
	 * 
	 * @param Es el numero a calcular el fibonacci
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
	 * Metodo para calcular el factorial de un numero
	 * Recibe un numero por teclado y calcula el factorial de dicho número
	 * 
	 * @param Es el numero con el que se calculara el factorial
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
	
	/**
	 * Metodo para calcular el factorial de un numero
	 * Recibe un numero por teclado y calcula el factorial de dicho número
	 * 
	 * @param Es el numero con el que se calculara el primo del mismo
	 * 
	 * @version 1.0
	 * 
	 * @author daniel
	 * 
	 * @return devuelve el primo de dicho numero.
	 **/

	public static boolean Primos(int num) {
		if (num == 4 || num == 1 || num == 0) {
			return false;
		}
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}


}
