package com.senati.eti;

import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingresar n�mero: ");
		int n = sc.nextInt();
		
		String estado = "N�mero es impar";
		
		if (n % 2 == 0)
			estado = "N�mero es par";
		
		System.out.println("---RESULTADOS---");
		System.out.println("Estado: " + estado);
				
	}

}