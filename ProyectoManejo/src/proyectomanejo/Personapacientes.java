/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectomanejo;

/**
 *
 * @author USUARIO
 */
public class Personapacientes {
    String fecha, cedula, nombre, apellido, direccion, telefono, pulso, presion,
            temperatura, razon, cedmedico, medico, habitacion, cama, observacion;

    public Personapacientes(String fecha, String cedula, String nombre, String apellido, String direccion,
            String telefono, String pulso, String presion, String temperatura, String razon,
            String cedmedico, String medico, String habitacion, String cama, String observacion) {
        this.fecha = fecha;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.pulso = pulso;
        this.presion = presion;
        this.temperatura = temperatura;
        this.razon = razon;
        this.cedmedico = cedmedico;
        this.medico = medico;
        this.habitacion = habitacion;
        this.cama = cama;
        this.observacion = observacion;
    }
    
    
}
