package Paquete;

public class AlgoritmosyJava {
	public  static  void  main ( String args [])  { 
		int numeroInicio=5, numeroFinal=14;
		
		/*  System.out.print("Los numeros entre 5 y 14 son:");			    //ejercicio 1 consigna a
		    while(numeroInicio<=numeroFinal){                           
			System.out.print(numeroInicio+" "); 
			numeroInicio++;
			}
		*/
		
		/*
			System.out.println("Los numeros pares entre 5 y 14 son: ");		//ejercicio 1 consigna b
			while(numeroInicio<=numeroFinal){                            
			if(numeroInicio%2==0) {
			System.out.print(numeroInicio+" ");
			}
			numeroInicio++;
			}
		*/
		
		/*
			System.out.println("los numeros pares "							//ejercicio 1 consigna d
					+ "ordenados de forma invertida con la "
					+ "sentencia for son:");
			for(int i=numeroFinal; i>=numeroInicio; i--) {                 
	
			if (i%2==0) {
			System.out.print(i+" ");
	
			}
			}
		*/

			boolean imprimirPares = true;
		
			while (numeroInicio <= numeroFinal) {
		
			if (imprimirPares == true) {
		
			if (numeroInicio %2 == 0) {
				
			System.out.println("numero par "+numeroInicio);
		
			}
		
			}else {
			
			if (numeroInicio %2 != 0) {
		
			System.out.println("numero impar "+numeroInicio);
		
			}
		
			}
		
			numeroInicio++;
		
			}
		}



}
