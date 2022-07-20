/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomanejo;

import Archivos.archivoHabitaciones;
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
     //PACIENTES
    public void pacientes() {
        Scanner tecla = new Scanner(System.in);
        System.out.println("P A C I E N T E S");
        System.out.printf("Fecha :           ");
        setingresofecha(tecla.next().toUpperCase());
        //CONTROL DE LA CEDULA
        Integer num;
        while (ce = true) {
            System.out.printf("Cédula:           ");
            setingresocedula(tecla.next().toUpperCase());
            num = cedula.length();
            if (num == 10) {
                ce = false;
                break;
            } else {
                System.out.printf("%55s", "\033[31;1m CÉDULA INCORRECTA\n");
                System.out.printf("\n");
            }
        }
        //FIN CONTROL
        int v;
        System.out.printf("Nombre:           ");
        setingresonombre(tecla.next().toUpperCase());
        System.out.printf("Apellido:         ");
        setingresoapellido(tecla.next().toUpperCase());
        System.out.printf("Dirección:        ");
        setingresodireccion(tecla.next().toUpperCase());
        while (ce = true) {
            System.out.printf("%20s", "\033[34;1m Teléfono:     ");
            setingresotelefono(tecla.next().toUpperCase());
            num = telefono.length();
            if (num == 10) {
                ce = false;
                break;
            } else {
                System.out.printf("%55s", "\033[31;1m NUMERO INCORRECTA\n");
                System.out.printf("\n");
            }
        }
        System.out.printf("Pulso:            ");
        setingresopulso(tecla.next().toUpperCase());
        System.out.printf("Pres. Arterial:   ");
        setingresopresion(tecla.next().toUpperCase());
        int z;

        do {
            System.out.printf("Temperatura:      ");
            setingresotemperatura(tecla.next().toUpperCase());
            z = Integer.valueOf(temperatura);
            if (z < 36 || z > 37) {
                System.out.println("Mal dato");
            }
        } while (z < 36 || z > 37);

        System.out.printf("Enfermedad:       ");
        setingresorazon(tecla.next().toUpperCase());
        //busca medicos
        archivomedicos d = new archivomedicos();
        d.buscarmedicosingreso();
        cedmedico = Persona.cm;
        medico = Persona.nm + " " + Persona.am;

        ///AQUI
        System.out.printf("Ingreso o Alta :  ");
        setingresoobservacion(tecla.next().toUpperCase());
        if ("INGRESO".equals(observacion)) {
            //busca habitaciones y camas
            archivoHabitaciones e = new archivoHabitaciones();
            e.buscarhabitaciones();
            if (archivoHabitaciones.haycama == 0) {
                habitacion = "NO_HAY_HABITACIÓN";
                cama = "NO_HAY_CAMA";
                observacion = "ESPERA";
                System.out.println("Habitación:      " + habitacion);
                System.out.println("Cama:            " + cama);
                System.out.println("Estado:           " + observacion);
            } else {
                habitacion = Habitaciones.hab;
                cama = Habitaciones.cam;
                observacion = "OCUPADA";
                System.out.println("Estado:           " + "DISPONIBLE");
            }

            pasahabitacion = habitacion;
            pasacama = cama;

        }

        if ("ALTA".equals(observacion)) {
            habitacion = "NO_HABITACION";
            cama = "NO_CAMA";

        }
        //MODIFICAR CAMAS
        String grabar;
        //Ingresosaltas pac = new Ingresosaltas();
        System.out.printf("%56s", "\033[35;1m Grabar Registro S/N: ");
        grabar = tecla.next();
        grabar = grabar.toUpperCase();
        if ("S".equals(grabar)) {
             archivopacientes b = new archivopacientes();
            b.escribirpersona(new Personapacientes(fecha, cedula, nombre, apellido, direccion, telefono, pulso, presion, temperatura, razon, cedmedico, medico, habitacion, cama, observacion));
            archivoHabitaciones e = new archivoHabitaciones();
            e.modificarhabitacion(new Habitaciones(e.habitacion, e.cama, e.estado));

        }

    }
 
    
}
