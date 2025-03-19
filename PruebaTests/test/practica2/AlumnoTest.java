/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package practica2;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author nieto
 */
@RunWith(value = Parameterized.class)
public class AlumnoTest {
    
    Alumno alumno = new Alumno();
    
    double notaPractica1;
    double notaPractica2;
    double notaPractica3;
    double notaExamen;
    double notaExp;
    String califExp;
    boolean entregaExp;

    public AlumnoTest(double notaPractica1, double notaPractica2, double notaPractica3, double notaExamen, double notaExp, String califExp, boolean entregaExp) {
        this.notaPractica1 = notaPractica1;
        this.notaPractica2 = notaPractica2;
        this.notaPractica3 = notaPractica3;
        this.notaExamen = notaExamen;
        this.notaExp = notaExp;
        this.califExp = califExp;
        this.entregaExp = entregaExp;
    }
    
    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
                {10, 10, 10, 10, 10, "Sobresaliente", true},
                {5, 2, 2, 10, 7.2, "Suspenso", true},
                {10, 0, 6, 5, 5.133333333, "Aprobado", false},
                {6, 6, 6, 6, 6, "Bien", true},
                {0, 2, 4, 3, 2.6, "Suspenso", false}
        };
        return Arrays.asList(data);
    }


    @Test
    public void testNotaModulo() {
        alumno.setNotaPractica1(this.notaPractica1);
        alumno.setNotaPractica2(this.notaPractica2);
        alumno.setNotaPractica3(this.notaPractica3);
        alumno.setNotaExamen(this.notaExamen);
        double expRes = this.notaExp;
        assertEquals(expRes, alumno.notaModulo(), 0.1);
    }

    @Test
    public void testCalificacionModulo() {
        alumno.setNotaPractica1(this.notaPractica1);
        alumno.setNotaPractica2(this.notaPractica2);
        alumno.setNotaPractica3(this.notaPractica3);
        alumno.setNotaExamen(this.notaExamen);
        String expRes = this.califExp;
        assertEquals(expRes, alumno.calificacionModulo());
    }

    @Test
    public void testEntregaPracticas() {
        alumno.setNotaPractica1(this.notaPractica1);
        alumno.setNotaPractica2(this.notaPractica2);
        alumno.setNotaPractica3(this.notaPractica3);
        boolean expRes = this.entregaExp;
        assertEquals(expRes, alumno.entregaPracticas());
    }
    
}
