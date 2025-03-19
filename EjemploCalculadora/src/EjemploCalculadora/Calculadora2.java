/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploCalculadora;

/**
 *
 * @author usuario
 */
public class Calculadora2 {
    
    private double num1;
    private double num2;
    private String marca;
    private String modelo;

    public Calculadora2(double num1, double num2, String marca, String modelo) {
        this.num1 = num1;
        this.num2 = num2;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Calculadora2(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Calculadora2() {
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
}
