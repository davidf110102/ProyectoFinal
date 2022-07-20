
package proyectomanejo;

/**
 *
 * @author Lizard
 */
import java.util.Scanner;

public class medicos {

    //atributos
    String cedula;
    String nombre;
    String apellido;
    String direccion;
    String telefono;
    String especialidad;
    String otro;
    Boolean ot;

    //cédula
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

    //especialidad
    public void setingresoespecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getingresoespecialidad() {
        return especialidad;
    }

    
}

