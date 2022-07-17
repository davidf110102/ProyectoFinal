/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomanejo;

/**
 *
 * @author DELLWIN10
 */
public class Habitaciones {
     public static String hab;
    public static String cam;
    String habitacion;
    String cama;
    String estado;

    public Habitaciones(String habitacion, String cama, String estado) {
        this.habitacion = habitacion;
        this.cama = cama;
        this.estado = estado;

    }

    public void desplegar() {
        System.out.println("Habitación  : " + habitacion);
        System.out.println("Cama        : " + cama);
        System.out.println("Estado      : " + estado);

    }

    public void desplegar2() {
        System.out.println("Cama:" + cama + "         Estado:" + estado);

    }

    public void desplegar3() {
        System.out.println("Habitación:       " + habitacion);
        System.out.println("Cama:             " + cama);
        hab = habitacion;
        cam = cama;

    }

    public void editarhabitaciones() {
        habitacion = IngresoAltas.pasahabitacion;
        cama = IngresoAltas.pasacama;
        estado = "OCUPADA";
        System.out.printf("%51s", "\033[34;1m habitación: " + habitacion);
        System.out.printf("%51s", "\033[34;1m Cama:       " + cama);
        System.out.printf("%51s", "\033[34;1m Estado:     " + estado);

    }
    
}
