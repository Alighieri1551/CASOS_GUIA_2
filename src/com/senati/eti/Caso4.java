package com.senati.eti;

import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingresar primer n�mero :");
		int n1 = sc.nextInt();
		
		System.out.print("Ingresar segundo n�mero:");
		int n2 = sc.nextInt();
		
		System.out.print("Ingresar tercer n�mero.:");
		int n3 = sc.nextInt();
		
		System.out.print("Ingresar cuarto n�mero.:");
		int n4 = sc.nextInt();
		
		String mensaje = "";
		
		if (n1==n2 && n1==n3 && n1==n4)
		 mensaje ="Los cuatro n�meros son iguales";
		
		//Se le agrego esto si dos numeros eran iguales
	    else if (n1==n2|| n2==n3 || n3==n4) 
	      mensaje="Hay  n�meros que son iguales";
		
		
		else if (n1 < n2 && n1 < n3 && n1 < n4)
		 mensaje = "El primer n�mero"+ n1 + "es el menor de todos";
		
		else if (n2 < n1 && n2 < n3 && n2 < n4)
			 mensaje = "El segundo n�mero"+ n2 + "es el menor de todos";
		
		else if (n3 < n1 && n3 < n2 && n3 < n4)
			 mensaje = "El tercer n�mero"+ n3 + "es el menor de todos";
		else
			 mensaje = "El cuarto n�mero"+n4 + "es el menor de todos ";
		
		
		System.out.println("---RESULTADOS---");
		System.out.println("Mensaje : " +mensaje);		
		
	}

}