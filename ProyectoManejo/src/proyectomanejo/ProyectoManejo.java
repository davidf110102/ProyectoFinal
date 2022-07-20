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
public class ProyectoManejo {

    
    
    public static String grabacion;
    
    public static void main(String[] args) {
        // TODO code application logic here
         Boolean o = true, otr, ot = true;
        Scanner tecla = new Scanner(System.in);
        char op, otro;
        //MENU PRINCIPAL
        String grabar;
        //Control de ingreso de la opción (1 - 6)
        do {
            do {
                
                System.out.printf("%60s\n", "\u001B[44m H O S P I T A L");
                System.out.printf("%65s\n", "\u001B[32m 1.- Ingreso de datos Médicos");
                System.out.printf("%65s\n", "\u001B[32m 2.- Ingreso Pacientes       ");
                System.out.printf("%76s\n", "\u001B[32m 3.- Ver atributos de Objetos(consultas)");//buscar medicos o pacientes
                System.out.printf("%56s\n", "\u001B[32m 4.- Datos Generales");
                System.out.printf("%66s\n", "\u001B[32m 5.- Altas pacientes          ");
                System.out.printf("%46s\n", "\u001B[32m 6.- Salir");
                
                System.out.printf("%56s", "\033[35;1m Ingrese la Opción(1 a 6): ");

                op = tecla.next().trim().charAt(0);//Sigue siendo caracteres a pesar que sigue siendo numeros
                if (op < '1' || op > '6') {
                    System.out.printf("%30s\n", "\033[32;1m ERROR: valido de 1 a 6...");
                }
            } while (op < '1' || op > '6');

            if (op != '6') {
                switch (op) {
                    //MEDICOS
                    case '1':
                        ot = true;
                        while (ot = true) {
                            medicos med = new medicos();
                            med.personal_medico();
                            System.out.printf("%56s", "\033[35;1m Grabar Registro S/N: ");
                            grabar = tecla.next().toUpperCase();
                            if ("S".equals(grabar)) {
                                archivomedicos a = new archivomedicos();
                                a.escribirpersona(new Persona(med.cedula, med.nombre, med.apellido, med.direccion, med.telefono, med.especialidad));
                            }
                            System.out.printf("%56s", "\033[35;1m Otro ingreso S/N: ");
                            otro = tecla.next().toUpperCase().charAt(0);
                            if (otro == 'N') {
                                ot = false;
                                break;
                            }
                        }
                        break;

                    //PACIENTES
                    case '2':
                        ot = true;
                        grabacion = "N";
                        while (ot = true) {
                            IngresoAltas pac = new IngresoAltas();
                            pac.pacientes();
                            System.out.printf("%56s", "\033[35;1m Otro ingreso S/N: ");
                            otro = tecla.next().toUpperCase().charAt(0);
                            if (otro == 'N') {
                                ot = false;
                                break;
                            }
                        }
                        break;

                    //CONSULTAS
                    case '3':
                        consultaslistas lis = new consultaslistas();
                        lis.menu();
                        o = false;
                        break;

                    //ESTADISTICAS
                    case '4':
                        System.out.printf("\n");
                        System.out.printf("%65s\n", "\033[35;1m DATOS GENERALES - ESTADISTICAS");
                        o = true;
                        archivopacientes g = new archivopacientes();
                        g.estadicticaspacientes();
                        break;

                    //ALTAS PACIENTES
                    case '5':
                        o = true;
                        while (o = true) {
                            archivopacientes e = new archivopacientes();
                            e.modificarpacientes();
                            System.out.printf("%56s", "\033[35;1m Otro ingreso S/N: ");
                            otro = tecla.next().toUpperCase().charAt(0);
                            if (otro == 'N') {
                                o = false;
                                otr = true;
                                break;
                            }
                        }
                        break;

                    //SALIR
                }
            } else {
                System.out.printf("\n");
                System.out.printf("%56S\n", "\033[31;1m Sistema Cerrado");
            }
        } while (op != '6');
    }
        
    
}
