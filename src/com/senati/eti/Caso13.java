package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingresar primer n�mero: ");
		float n1 =sc.nextFloat();
		
		System.out.print("Ingresar segundo n�mero: ");
		float n2 =sc.nextFloat();
		
		System.out.print("Ingresar Operaci�n [1-6] :...: ");
		int op = sc.nextInt();
		
		String operacion = "";
		String res = "";
		
		switch (op) {
		   case 1 :
		      operacion = "Suma";
		      res="La suma es: "+(n1 + n2);
		      break;
		      
		   case 2 :
			  operacion = "Resta";
			  res ="La resta es: "+(n1-n2);
			  break;
		   case 3 :
			   operacion = "Producto";
			   res="El producto es: "+(n1*n2);
			   break;
		   case 4 :
			   operacion = "Divisi�n";
			   if (n2==0)
				   res="No es posible dividir entre cero";
			   else
				   res="La divisi�n es: "+ df.format(n1/n2);
			   break;
		   case 5 :
			   operacion = "Resto";
			   if (n2==0)
				   res="No es posible hallar el resto entero";
			   else
				   res="El resto entero es: "+ df.format(n1%n2);
			  break;
		   case 6 :
			   operacion ="Promedio";
			   res = "El promedio es: "+((n1+n2)/2);
			   break;
			   
		   default:
		       operacion = "Incorrecto, solo elija una operaci�n del 1-6";
			   
	
		}
        System.out.println("---RESULTADOS---");
        System.out.println("N�mero 1: " + n1);
        System.out.println("N�mero 2: " + n2);
		System.out.println("La operaci�n elegida es: "+operacion);
		System.out.println("" + res);
	}

}