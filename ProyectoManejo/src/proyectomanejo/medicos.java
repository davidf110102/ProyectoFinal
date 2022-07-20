
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

    public void personal_medico() {
        Scanner tecla = new Scanner(System.in);
        System.out.printf("\n");
        System.out.printf("%53s\n", "\033[35;1m M E D I C O S");
        Boolean ce = true;
        //CONTROL DE LA CEDULA
        Integer num;
        while (ce = true) {
            System.out.printf("%51s", "\033[34;1m Cédula:       ");
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
         //FIN CONTROL CEDULA
        
        
       //CONTROL DE DATOS PARA MEDICOS
        System.out.printf("%51s", "\033[34;1m Nombre:       ");
        setingresonombre(tecla.next().toUpperCase());
        System.out.printf("%51s", "\033[34;1m Apellido:     ");
        setingresoapellido(tecla.next().toUpperCase());
        System.out.printf("%51s", "\033[34;1m Dirección:    ");
        setingresodireccion(tecla.next().toUpperCase());
        while (ce = true) {
            System.out.printf("%51s", "\033[34;1m Teléfono:     ");
            setingresotelefono(tecla.next().toUpperCase());
            num = telefono.length();
            if (num == 10) {
                ce = false;
                break;
            } else {
                System.out.printf("%55s", "\033[31;1m NÚMERO INCORRECTA\n");
                System.out.printf("\n");
            }
        }

        System.out.printf("%51s", "\033[34;1m Especialidad: ");
        setingresoespecialidad(tecla.next().toUpperCase());
    }

}

