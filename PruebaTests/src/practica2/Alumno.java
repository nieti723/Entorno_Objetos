/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

/**
 *
 * @author nieto
 */
public class Alumno {

    private String nombre;
    private String apellidos;
    private String dni;
    private String modulo;
    private double notaPractica1;
    private double notaPractica2;
    private double notaPractica3;
    private double notaExamen;

    public Alumno() {
    }

    public Alumno(String nombre, String apellidos, String dni, String modulo, double notaPractica1, double notaPractica2, double notaPractica3, double notaExamen) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.modulo = modulo;
        this.notaPractica1 = notaPractica1;
        this.notaPractica2 = notaPractica2;
        this.notaPractica3 = notaPractica3;
        this.notaExamen = notaExamen;
    }

    //MÉTODOS
    public double mediaModulos() {
        return (notaPractica1 + notaPractica2 + notaPractica3) / 3;
    }

    public double notaModulo() {

        double notaModulo;

        notaModulo = (mediaModulos() * 0.4) + (notaExamen * 0.6);

        return notaModulo;
    }

    public String calificacionModulo() {
        
        String calif;
        if (this.notaExamen <= 3 || mediaModulos() <= 3) {
            calif = "Suspenso";
        } else {
            if (notaModulo() < 5) {
                calif = "Suspenso";
            } else if (notaModulo() < 6) {
                calif = "Aprobado";
            } else if (notaModulo()<7){
                calif = "Bien";
            } else if (notaModulo() < 9) {
                calif = "Notable";
            } else {
                calif = "Sobresaliente";
            }
        }

        return calif;
    }
    
    public boolean entregaPracticas(){
        boolean entregadas = true;
        if (notaPractica1 == 0 || notaPractica2 == 0 || notaPractica3 == 0 ) {
            entregadas = false;
        }
        return entregadas;
    }
    
    //SETTERS Y GETTERS

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

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public double getNotaPractica1() {
        return notaPractica1;
    }

    public void setNotaPractica1(double notaPractica1) {
        this.notaPractica1 = notaPractica1;
    }

    public double getNotaPractica2() {
        return notaPractica2;
    }

    public void setNotaPractica2(double notaPractica2) {
        this.notaPractica2 = notaPractica2;
    }

    public double getNotaPractica3() {
        return notaPractica3;
    }

    public void setNotaPractica3(double notaPractica3) {
        this.notaPractica3 = notaPractica3;
    }

    public double getNotaExamen() {
        return notaExamen;
    }

    public void setNotaExamen(double notaExamen) {
        this.notaExamen = notaExamen;
    }
    
}
