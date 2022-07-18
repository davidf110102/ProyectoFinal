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
    
    public void desplegar() {
        System.out.println("Fecha Ingreso : " + fecha);
        System.out.println("Cédula        : " + cedula);
        System.out.println("Nombre        : " + nombre);
        System.out.println("Apellido      : " + apellido);
        System.out.println("Dirección     : " + direccion);
        System.out.println("Teléfono      : " + telefono);
        System.out.println("Pulso         : " + pulso);
        System.out.println("Presión       : " + presion);
        System.out.println("Temperatura   : " + temperatura);
        System.out.println("Razón Ingreso : " + razon);
        System.out.println("Cédula Médico : " + cedmedico);
        System.out.println("Médico        : " + medico);
        System.out.println("# Habitación  : " + habitacion);
        System.out.println("# de Cama     : " + cama);
        if ("OCUPADA".equals(observacion)) {
            observacion = "HOSPITALIZADO";
        }
        System.out.println("Observación   : " + observacion);
    }

    public void desplegar2() {
        if ("OCUPADA".equals(observacion)) {
            observacion = "HOSPITALIZADO";
        }
        System.out.println("Fecha Ingreso : " + fecha);
        System.out.println("Cédula        : " + cedula);
        System.out.println("Nombre        : " + nombre);
        System.out.println("Apellido      : " + apellido);
        System.out.println("Dirección     : " + direccion);
        System.out.println("Teléfono      : " + telefono);
        System.out.println("Pulso         : " + pulso);
        System.out.println("Presión       : " + presion);
        System.out.println("Temperatura   : " + temperatura);
        System.out.println("Razón Ingreso : " + razon);
        System.out.println("Cédula Médico : " + cedmedico);
        System.out.println("Médico        : " + medico);
        System.out.println("# Habitación  : " + habitacion);
        System.out.println("# de Cama     : " + cama);
        System.out.println("Observación   : " + observacion);
    }
}
