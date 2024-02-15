package hn.uth.juinit_test_app;

import static org.junit.Assert.assertTrue;

import java.util.InputMismatchException;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.*;
/**
 * Unit test for simple App.
 */
public class AppTest{
	
	
	@BeforeClass
    public static void menu() {
		
	
			System.out.println("\n\n---------------------------");
			System.out.println("1-Area de un cuadrado");
			System.out.println("2-Area de un rectangulo");
			System.out.println("3-Area de un circulo");
			System.out.println("4-Area de un trinagulo");
			System.out.println("0-Salir");
			System.out.println("Selecciona una opción");
		
			
			
					
				
					
		}
				
				
				
	
	
	
	
	@Test
	
public void CalcularAreaDeCuadrado() {
		
	assertTrue(App.Calcular(8, 8)==64);
	
	
}
	
	@Test
	
public void CalcularAreaDeCuadradonegativos() {
		
	assertTrue(App.Calcular(-8, -8)==64);
	
	
}
	
	
	
@Test
	
	public void CalcularAreaDeCuadradoEntero() {
			
		assertTrue(App.Calcular(8, 8)==64);
		
		
	}

	
	
	
	
	
	@Test
	
	public void CalcularAreaDeCirculo() {
		
		assertTrue(App. CalcularCirculo(3.14, 64)==200.96);
		
		
	}
	
	@Test
	
	public void CalcularAreaDeCirculoDecimal() {
		
		assertTrue(App. CalcularCirculo(3.14, 0.5)==1.57);
		
		
	}
	@Test
	
	public void CalcularAreaDeCirculoNegativos() {
		
		assertTrue(App. CalcularCirculo(-3.14, -12)==37.68);
		
		
	}
	
@Test
	
	public void CalcularAreaDeCirculoEntero() {
		
		assertTrue(App. CalcularCirculo(3.14, 12)==37.68);
		
		
	}
	
	
	@Test
	
	public void CalcularAreaDeTriangulo() {
		
		assertTrue(App.CalcularTriangulo(12, 6)==36);	
		
		
	}
	@Test
	
	
public void CalcularAreaDeTrianguloPositivos() {
		
		assertTrue(App.CalcularTriangulo(17, 8)==68);	
		
		
	}
@Test

public void CalcularAreaDeTrianguloEnteros() {
	
	assertTrue(App.CalcularTriangulo(12, 6)==36);	
	
	
}

@Test
public void CalcularAreaDeTrianguloDecimales() {
	
	assertTrue(App.CalcularTriangulo(1.7, 0.8)==0.68);	
	
	
}
	@Test
	
	public void CalcularAreaDeRectangulo() {
		assertTrue(App.CalcularRectangulo(12, 6)==72);
		
			
		
		
	}
	
@Test
	
	public void CalcularAreaDeRectanguloNegativo() {
		assertTrue(App.CalcularRectangulo(-12, -6)==72);
		
			
		
		
	}
@Test

public void CalcularAreaDeRectanguloEnteros() {
	assertTrue(App.CalcularRectangulo(12, 6)==72);
	
		
	
	
}
@Test

public void CalcularAreaDeRectanguloPositivos() {
	assertTrue(App.CalcularRectangulo(12, 6)==72);
	
		
	
	
}
	
	

	
}

  

