/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebatests;

/**
 *
 * @author nieto
 */
public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, String apellidos, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    
    /**
     * Método que calcula el Índice de Masa Corporarl del sujeto
     * @return -1: por debajo del peso ideal, 0: en su peso ideal, 1: por encima del peso ideal
     */
    
    public int calcularIMC(){
        double value = peso/Math.pow(altura, 2);
        if (value < 20) {
            return -1;
        } else if (value<=25){
            return 0;
        } else{
            return 1;
        }
    }
    
    public boolean esMayorDeEdad(){
        return edad>=18;
    }
    
    public void comprobarSexo(){
        if (!sexo.equals("H") && !sexo.equals("M")) {
            this.setSexo("H");
        }
    }
    
    //GETTERS Y SETTERS
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
