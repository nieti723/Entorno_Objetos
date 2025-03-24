/**
 *
 * @author
 */
package examen;

public class MotoElectrica {

    //atributos
    private String marca;
    private String modelo;
    private String id;
    private double velocidad;
    private int direccion;

    //constructores
    public MotoElectrica(String marca, String modelo, String id, double velocidad, int direccion) {
        this.marca = marca;
        this.modelo = modelo;
        this.id = id;
        this.velocidad = velocidad;
        this.direccion = direccion;
    }

    public MotoElectrica() {
    }

    //Getters and Setters
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    //m�todos
    /**
     * Modifica la velocidad de la moto de forma que cada segundo aumenta en 2
     * Km/h
     *
     * @param segundos double que indica el n�mero de segundos
     */
    public void acelerar(double segundos) {
        double aceleracion = segundos * 2;

        this.velocidad += aceleracion;

        if (this.velocidad > 50) {
            this.velocidad = 50;
        }
    }

    /**
     * Modifica la velocidad de la moto disminuy�ndola 5 Km/h por cada segundo
     *
     * @param segundos double que indica el n�mero de segundos que se pisa el
     * freno
     */
    public void frenar(double segundos) {
        double freno = segundos * 5;

        this.velocidad -= freno;

        if (this.velocidad < 0) {
            this.velocidad = 0;
        }

    }

    /**
     * Modifica la direcci�n a izquierda o derecha dependiendo del par�metro
     * introducido y del l�mite
     *
     * @param direc char que indica hacia donde gira la moto
     */
    public void girar(char direc) {

        if (direc == 'i') {
            if (this.direccion > -2) {
                this.direccion--;
            } 
        }
        if (direc == 'd') {
            if (this.direccion < 2) {
                this.direccion++;
            }
        }
    }
}
