package calculadora;

import java.util.Scanner;

/**
 * 
 * @author z3r0x
 * 
 */
public class Calculadora {

	static Scanner teclado = new Scanner(System.in);

	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return Devuelve la suma de 2 numeros
	 */
    static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * 
     * @param num1
     * @param num2
     * @return Devuelve la resta de 2 numeros
     */
    static double restar(double num1, double num2) {
        return num1 - num2;
    }

    /**
     * 
     * @param num1
     * @param num2
     * @return Devuelve la multiplicacion de 2 numeros
     */
    static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    /**
     * 
     * @param num1
     * @param num2
     * @return Devuelve la division de 2 numeros
     */
    static double dividir(double num1, double num2) {
        double resultado = 0;
        
        if (num2 == 0) {
            System.out.println("Error, no se puede dividir entre 0");
        } else {
        	resultado = num1 / num2;
        }
        
        return resultado;
    }
    
    /**
     * Funcion que muestra un menu con 5 opciones
     */
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
	
    /**
     * 
     * @param args Argumentos de la funcion principal
     * 
     */
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
