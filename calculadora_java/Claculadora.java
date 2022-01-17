package calculadora;

import java.util.Scanner;

public class Claculadora {

	static Scanner teclado = new Scanner(System.in);

    static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    static double restar(double num1, double num2) {
        return num1 - num2;
    }

    static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    static double dividir(double num1, double num2) {
        double resultado = 0;
        
        if (num2 == 0) {
            System.out.println("Error, no se puede dividir entre 0");
        } else {
        	resultado = num1 / num2;
        }
        
        return resultado;
    }
    
    static public void menu() {
        System.out.println(
    		"Introduce una opcion: \n"
            + "1. Sumar\n"
            + "2. Restar\n"
            + "3. Multiplicar\n"
            + "4. Dividir\n"
            + "5. Salir"
        );

    }
	
	public static void main(String[] args) {
        System.out.print("Introduce el 1º numero: ");
        double num1 = teclado.nextDouble();

        System.out.print("Introduce el 2º numero: ");
        double num2 = teclado.nextDouble();

        System.out.println("");
        menu();

        int opcion = teclado.nextInt();
        
        while(opcion != 5) {
        	 switch (opcion) {
	             case 1:
	            	 System.out.print("Resultado: ");
	                 System.out.println(sumar(num1, num2));
	                 break;
	             case 2:
	            	 System.out.print("Resultado: ");
	                 System.out.println(restar(num1, num2));
	                 break;
	             case 3:
	            	 System.out.print("Resultado: ");
	                 System.out.println(multiplicar(num1, num2));
	                 break;
	             case 4:
	            	 System.out.print("Resultado: ");
	                 System.out.println(dividir(num1, num2));
	                 break;
	             default:
	                 System.err.println("Error, opcion no valida");
	                 break;
	         }
        	 
        	 System.out.println("");
	         menu();
	         opcion = teclado.nextInt();
        }

	}

}
