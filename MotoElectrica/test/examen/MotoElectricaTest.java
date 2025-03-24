/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package examen;

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
public class MotoElectricaTest {
    
    MotoElectrica moto = new MotoElectrica();
    double velocidad;
    int segundos;
    int direccion;
    char dir;
    double expVelAcel;
    double expVelFren;
    int expDir;

    public MotoElectricaTest(double velocidad, int segundos, int direccion, char dir, double expVelAcel, double expVelFren, int expDir) {
        this.velocidad = velocidad;
        this.segundos = segundos;
        this.direccion = direccion;
        this.dir = dir;
        this.expVelAcel = expVelAcel;
        this.expVelFren = expVelFren;
        this.expDir = expDir;
    }
    
    @Parameters
    public static Collection<Object[]> data(){
        Object[][] data = new Object[][]{
                {10, 10, 0, 'i', 30, 0, -1},
                {45, 20, -2, 'd', 50, 0, -1},
                {30, 5, 1, 'd', 40, 5, 2}
        };
        return Arrays.asList(data);
    }
    
    
    @Test
    public void testAcelerar() {
        moto.setVelocidad(this.velocidad);
        double exptRes = this.expVelAcel;
        moto.acelerar(this.segundos);
        assertEquals(exptRes, moto.getVelocidad(), 0);
    }

    @Test
    public void testFrenar() {
        moto.setVelocidad(this.velocidad);
        double exptRes = this.expVelFren;
        moto.frenar(this.segundos);
        assertEquals(exptRes, moto.getVelocidad(), 0);
    }

    @Test
    public void testGirar() {
        moto.setDireccion(this.direccion);
        int expRes = this.expDir;
        moto.girar(this.dir);
        assertEquals(expRes, moto.getDireccion());
    }
    
}
