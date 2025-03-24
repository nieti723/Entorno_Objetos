/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package testPractica1;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import practica1.Empleado;

/**
 *
 * @author nieto
 */

@RunWith (value=Parameterized.class)

public class EmpleadoTest {
    
    Empleado empleado = new Empleado();
    
    char categoria;
    int antiguedad;
    String catExp;
    double sueldoExp;
    
    public EmpleadoTest(char categoria, int antiguedad, String catExp, double sueldoExp) {
        this.categoria = categoria;
        this.antiguedad = antiguedad;
        this.catExp = catExp;
        this.sueldoExp = sueldoExp;
    }
    
    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
                {'A', 3, "Director", 2500},
                {'B', 7, "Técnico superior", 2200},
                {'C', 1, "Técnico medio", 1500}
        };
        return Arrays.asList(data);
    }

    @Test
    public void testCategoria() {
        empleado.setCategoria(this.categoria);
        String expRes = this.catExp;
        assertEquals(expRes, empleado.categoria());
    }

    @Test
    public void testSueldoBase() {
        empleado.setCategoria(this.categoria);
        empleado.setAntiguedad(this.antiguedad);
        double expRes = this.sueldoExp;
        assertEquals(expRes, empleado.sueldoBase(), 0);
    }
    
}
