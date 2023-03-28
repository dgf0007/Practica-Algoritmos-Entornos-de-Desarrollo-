package com.entornos.Garcia_Fernandez_Daniel.algoritmos;

public class Principal extends algoritmos {

	public static void main(String[] args) {

		// Apartado 1 - Crea mediante un bucle un array llamado “numeros” con 5 números aleatorios del al 20.
		
		int[] numeros = new int[5];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) ((Math.random() * (20 - 1 + 1)) + 1);
		}
		
		// Apartado 2 - Calcula mediante un bucle el número de fibonacci de los 5 números del array y almacena el resultado en otro array llamado “resultadoFibonacci”.
		
		int[] resultadoFibonacci = new int[5];
		for (int i = 0; i < numeros.length; i++) {
			resultadoFibonacci[i] = algoritmos.fibonacci(numeros[i]);
		}
		
		// Apartado 3 - Calcula mediante un bucle el factorial de los 5 números del array y almacena el resultado en otro array llamado “resultadoFactorial”
		
		int[] resultadoFactorial = new int[5];
		for (int i = 0; i < numeros.length; i++) {
			resultadoFactorial[i] = (int) algoritmos.factorial(numeros[i]);
		}

		// Apartado 4 - Comprueba mediante un bucle si los 5 números del array son primos o no y almacena el resultado en otro array llamado “resultadoPrimos”.
		
		boolean[] resultadoPrimos = new boolean[5];
		for (int i = 0; i < numeros.length; i++) {
			resultadoPrimos[i] = algoritmos.Primos(numeros[i]);
		}
	}

}
