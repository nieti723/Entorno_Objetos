/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pruebatests;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nieto
 */
public class PersonaTest {
    
    Persona persona = new Persona("Juan", "Nieto Acosta", 20, "H", 100, 1.88);
    
    public PersonaTest() {
    }
    
    @Test
    public void testCalcularIMC() {
        System.out.println("calcularIMC");
        int expResult = 1;
        int result = persona.calcularIMC();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalcularIMC2() {
        System.out.println("calcularIMC");
        persona.setPeso(87.0);
        int expResult = 0;
        int result = persona.calcularIMC();
        assertEquals(expResult, result);
    }

    @Test
    public void testCalcularIMC3() {
        System.out.println("calcularIMC");
        persona.setPeso(70.40);
        int expResult = -1;
        int result = persona.calcularIMC();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEsMayorDeEdad() {
        System.out.println("esMayorDeEdad");
        boolean expResult = true;
        boolean result = persona.esMayorDeEdad();
        assertEquals(expResult, result);
    }

    @Test
    public void testComprobarSexo() {
        System.out.println("comprobarSexo");
        persona.setSexo("K");
        persona.comprobarSexo();
        String expResult = "H";
        String result = persona.getSexo();
        assertEquals(expResult, result);
    }  
    
    @Test
    public void testComprobarSexo2() {
        System.out.println("comprobarSexo");
        persona.setSexo("H");
        persona.comprobarSexo();
        String expResult = "H";
        String result = persona.getSexo();
        assertEquals(expResult, result);
    } 
    
    @Test
    public void testComprobarSexo3() {
        System.out.println("comprobarSexo");
        persona.setSexo("M");
        persona.comprobarSexo();
        String expResult = "M";
        String result = persona.getSexo();
        assertEquals(expResult, result);
    } 
}
