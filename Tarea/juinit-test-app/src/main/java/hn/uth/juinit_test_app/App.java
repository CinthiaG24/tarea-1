package hn.uth.juinit_test_app;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    }
    Scanner entrada=new Scanner(System.in);
    
    public static int menu(Scanner entrada) {
    	
		int opcion=-1;
		System.out.println("\n\n---------------------------");
		System.out.println("1-Area de un cuadrado");
		System.out.println("2-Area de un rectangulo");
		System.out.println("3-Area de un circulo");
		System.out.println("4-Area de un trinagulo");
		System.out.println("0-Salir");
		System.out.println("Selecciona una opción");
		while(opcion<0) {
			try {
				opcion=entrada.nextInt();
			}catch(InputMismatchException e) {
			
				System.out.println("El valor tiene que ser numerico...");
				entrada.nextLine();
				opcion=-1;
			}
		}
 
		return opcion;
	}
    
    
    public static double Calcular(double base, double altura){
    	return base*altura;
    	
    }
    
    
    public static double CalcularCirculo(double pi, double r ){
    	return pi*r;
    	
    }
    
    public static double CalcularTriangulo(double base, double altura ){
    	return base*altura/2;
    	
   
    
    }
    
    public static double CalcularRectangulo(double base, double altura){
    	return base*altura;
    	
    }
}

