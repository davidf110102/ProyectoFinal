/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectomanejo;

/**
 *
 * @author USUARIO
 */
public class Persona {
    public static String cm;
    public static String nm;
    public static String am;
    public static String em;

    String cedula, nombre, apellido, direccion, telefono, especialidad;

    public Persona(String cedula, String nombre, String apellido, String direccion,
            String telefono, String especialidad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }
    
    public void desplegar() {
        System.out.println("Cédula      : " + cedula);
        System.out.println("Nombre      : " + nombre);
        System.out.println("Apellido    : " + apellido);
        System.out.println("Dirección   : " + direccion);
        System.out.println("Teléfono    : " + telefono);
        System.out.println("Especialidad: " + especialidad);
    }

    public void desplegar2() {

        System.out.println(cedula + "     " + nombre + "        " + apellido + "        " + direccion + "        " + telefono + "     " + especialidad);

    }

    public void desplegarmedico() {
        System.out.println("Nombre Médico:    " + nombre);
        System.out.println("Apellido Médico:  " + apellido);
        System.out.println("Especialidad:     " + especialidad);
        cm = cedula;
        nm = nombre;
        am = apellido;
        //em=especialidad;

    }
}
