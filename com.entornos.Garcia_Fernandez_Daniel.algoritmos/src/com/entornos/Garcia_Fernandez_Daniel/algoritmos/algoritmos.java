package com.entornos.Garcia_Fernandez_Daniel.algoritmos;

public abstract class algoritmos {
	
	/**
	 * Método de fibonacci
	 * Recibe un número por teclado y calcula el fibonacci de dicho número
	 * 
	 * @param es el número a calcular el fibonacci
	 *  
	 * @version 1.0
	 * 
	 * @author Daniel
	 *
	 */
	
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

}
