/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;

/**
 *
 * @author nieto
 */
public class Empleado {

    private String nombre;
    private String apellidos;
    private String dni;
    private String direccion;
    private String cp;
    private String poblacion;
    private String provincia;
    private int edad;
    private char categoria;
    private int hijos;
    private int nivelIngles;
    private int antiguedad;

    public Empleado(String nombre, String apellidos, String dni, String direccion, String cp, String poblacion, String provincia, int edad, char categoria, int hijos, int nivelIngles, int antiguedad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.cp = cp;
        this.poblacion = poblacion;
        this.provincia = provincia;
        this.edad = edad;
        this.categoria = categoria;
        this.hijos = hijos;
        this.nivelIngles = nivelIngles;
        this.antiguedad = antiguedad;
    }

    public Empleado(String nombre, String apellidos, String dni, String direccion, String cp, String provincia, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.cp = cp;
        this.provincia = provincia;
        this.edad = edad;
    }

    public Empleado() {
    }

    //MÉTODOS
    public String categoria() {
        String cat = "";

        switch (categoria) {
            case 'A' ->
                cat = "Director";
            case 'B' ->
                cat = "Técnico superior";
            case 'C' ->
                cat = "Técnico medio";
            case 'D' ->
                cat = "Técnico auxiliar";
        }

        return cat;
    }

    public double sueldoBase() {
        double sueldoBase = 0;
        switch (categoria) {
            case 'A' ->
                sueldoBase = 2500;
            case 'B' ->
                sueldoBase = 2000;
            case 'C' ->
                sueldoBase = 1500;
            case 'D' ->
                sueldoBase = 1000;
        }
        if (antiguedad >= 5) {
            sueldoBase *= 1.10;
        }
        return sueldoBase;
    }

    public int retencionIRPF() {
        int retencion;

        if (hijos == 0) {
            retencion = 18;
        } else if (hijos == 1) {
            retencion = 16;
        } else {
            retencion = 14;
        }

        return retencion;
    }

    public String nivelIngles() {
        String nivel;

        switch (nivelIngles) {
            case 1 ->
                nivel = "Inicial";
            case 2 ->
                nivel = "Medio";
            case 3 ->
                nivel = "Avanzado";
            default ->
                nivel = "No registrado";
        }

        return nivel;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public int getHijos() {
        return hijos;
    }

    public void setHijos(int hijos) {
        this.hijos = hijos;
    }

    public int getNivelIngles() {
        return nivelIngles;
    }

    public void setNivelIngles(int nivelIngles) {
        this.nivelIngles = nivelIngles;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
}
