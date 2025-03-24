/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testPractica2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import practica2.Alumno;

/**
 *
 * @author nieto
 */
public class AlumnoTest {
    
    Alumno alumno = new Alumno();
    
    @Test
    public void testNotaModulo(){
        alumno.setNotaPractica1(5);
        alumno.setNotaPractica2(2);
        alumno.setNotaPractica3(2);
        alumno.setNotaExamen(10);
        double expRes = 7.2;
        assertEquals(expRes, alumno.notaModulo(), 0.1);
    }
    
    @Test
    public void testCalificacionModulo() {
        alumno.setNotaPractica1(6);
        alumno.setNotaPractica2(6);
        alumno.setNotaPractica3(6);
        alumno.setNotaExamen(6);
        String expRes = "Bien";
        assertEquals(expRes, alumno.calificacionModulo());
    }

    @Test
    public void testEntregaPracticas() {
        alumno.setNotaPractica1(0);
        alumno.setNotaPractica2(2);
        alumno.setNotaPractica3(4);
        boolean expRes = false;
        assertEquals(expRes, alumno.entregaPracticas());
    }
}
