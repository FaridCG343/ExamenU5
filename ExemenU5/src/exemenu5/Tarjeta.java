/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemenu5;

/**
 *
 * @author 701
 */
public class Tarjeta {

    private String nombre, numTarjeta;
    private int dia, mes, anio;

    public Tarjeta(String nombre, String numTarjeta, int dia, int mes, int anio) {
        this.nombre = nombre;
        this.numTarjeta = numTarjeta;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Tarjeta:\nNombre: " + nombre + "\nnumTarjeta: " + numTarjeta
                + "\nDia: " + dia + "\nMes=" + mes + "\nAño: " + anio;
    }

}
