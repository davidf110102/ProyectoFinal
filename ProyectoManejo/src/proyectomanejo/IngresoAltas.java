/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomanejo;

import java.util.Scanner;

/**
 *
 * @author DELLWIN10
 */
public class IngresoAltas {
    
        String cedula;
    String nombre;
    String apellido;
    String direccion;
    String telefono;
    String observacion;
    String presion;
    String pulso;
    String temperatura;
    String fecha;
    String razon;
    String cedmedico;
    String medico;
    String habitacion;
    String cama;
    String otro;
    Boolean ot;
    Boolean ce = true;
    public static String pasahabitacion;
    public static String pasacama;

    //cedula
    public void setingresocedula(String cedula) {
        this.cedula = cedula;
    }

    public String getingresocedula() {
        return cedula;
    }

    //nombre
    public void setingresonombre(String nombre) {
        this.nombre = nombre;
    }

    public String getingresonombre() {
        return nombre;
    }

    //apellido
    public void setingresoapellido(String apellido) {
        this.apellido = apellido;
    }

    public String getingresoapellido() {
        return apellido;
    }

    //direccion
    public void setingresodireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getingresodireccion() {
        return direccion;
    }

    //telefono
    public void setingresotelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getingresotelefono() {
        return telefono;
    }

    //ingreso
    public void setingresoobservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getingresoobservacion() {
        return observacion;
    }

    //presion
    public void setingresopresion(String presion) {
        this.presion = presion;
    }

    public String getingresopresion() {
        return presion;
    }

    //pulso
    public void setingresopulso(String pulso) {
        this.pulso = pulso;
    }

    public String getingresopulso() {
        return pulso;
    }

    //temperatura
    public void setingresotemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getingresotemperatura() {
        return temperatura;
    }

    //fecha de ingreso
    public void setingresofecha(String fecha) {
        this.fecha = fecha;
    }

    public String getingresofecha() {
        return fecha;
    }

    //razón del ingreso
    public void setingresorazon(String razon) {
        this.razon = razon;
    }

    public String getingresorazon() {
        return razon;
    }
 
    
}
