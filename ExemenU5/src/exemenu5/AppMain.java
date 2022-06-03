/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemenu5;

import javax.swing.JOptionPane;

/**
 *
 * @author 701
 */
class nomI extends Exception {

    public nomI(String message) {
        super(message);
    }

}

class numTI extends Exception {

    public numTI(String message) {
        super(message);
    }

}

class fechaI extends Exception {

    public fechaI(String message) {
        super(message);
    }

}

public class AppMain {

    public static void main(String[] args) {
        //public Tarjeta(String nombre, String numTarjeta, String dia, String mes, String anio)
        String nom="", numT="";
        int dia=0, mes=0, anio=0;
        boolean rep;
        do {
            rep = false;
            try {
                nom = JOptionPane.showInputDialog("Ingrese su nombre");
                if (nom.isEmpty() || nom.isBlank()) {
                    throw new nomI("No puede dejar el nombre en blanco");
                }
                numT = JOptionPane.showInputDialog("Ingrese el numero de su tarjeta (16 digitos)");
                if (numT.length() < 16 || numT.length() > 16) {
                    throw new numTI("El numero de la tarjeta debe contener 16 digitos");
                } else {
                    for (int i = 0; i < 16; i++) {
                        int x = Integer.parseInt(numT.substring(i, i + 1));
                    }
                }
                dia = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dia"));
                if (dia < 1 || dia > 31) {
                    throw new fechaI("Dia no valido");
                }
                mes = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el mes"));
                if (mes < 1 || mes > 12) {
                    throw new fechaI("Mes no valido");
                }
                anio = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el año"));
                if (anio < 2022) {
                    throw new fechaI("Año no valido");
                }

            } catch (nomI | numTI | fechaI e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                rep = true;
            } catch (NumberFormatException e2) {
                JOptionPane.showMessageDialog(null, "El numero de la tarjeta solo debe contener numeros");
                rep = true;
            } catch (NullPointerException e3) {

            }

        } while (rep);
        //public Tarjeta(String nombre, String numTarjeta, String dia, String mes, String anio)
        Tarjeta t001=new Tarjeta(nom,numT,dia,mes,anio);
        JOptionPane.showMessageDialog(null, t001);
    }

}
