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
}
