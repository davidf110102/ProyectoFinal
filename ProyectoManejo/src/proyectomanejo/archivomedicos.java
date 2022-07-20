


package proyectomanejo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import proyectomanejo.Persona;



public class archivomedicos {

    public void escribirpersona(Persona nueva) {
        try {
            File f = new File("medicos.txt");
            FileWriter fw;
            BufferedWriter bw;

            if (f.exists()) {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write(nueva.cedula + "," + nueva.nombre + "," + nueva.apellido + "," + nueva.direccion + "," + nueva.telefono + "," + nueva.especialidad);
            } else {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.write(nueva.cedula + "," + nueva.nombre + "," + nueva.apellido + "," + nueva.direccion + "," + nueva.telefono + "," + nueva.especialidad);
            }
            bw.close();
            fw.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }


//BUSCAR MEDICOS
    public void buscarmedicos() {
        try {
            Integer x = 0;
            Scanner tecla = new Scanner(System.in);
            File f = new File("medicos.txt");
            if (f.exists()) {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea, buscacedula;
                System.out.print("INGRESE LA CÉDULA: ");
                buscacedula = (tecla.next().toUpperCase());
                while ((linea = br.readLine()) != null) {
                    String[] contacto = linea.split(",");
                    Persona p = new Persona(contacto[0], contacto[1], contacto[2], contacto[3], contacto[4], contacto[5]);
                    if (buscacedula.equals(contacto[0])) {
                        p.desplegar();
                        x = 1;
                        break;
                    }

                }
                if (x == 0) {
                    System.out.println("\u001B[31m Registro Médico no existe: ");

                }
            } else {
                System.out.println("\u001B[31m Agenda de Médicos vacía");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    //BUSCAR MEDICOS PARA INGRESO
    public void buscarmedicosingreso() {
        Integer x = 0;

        try {
            x = 0;
            Scanner tecla = new Scanner(System.in);
            File f = new File("medicos.txt");
            if (f.exists()) {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea, buscacedula;
                System.out.printf("CÉDULA MEDICO:    ");
                buscacedula = (tecla.next().toUpperCase());
                while ((linea = br.readLine()) != null) {
                    String[] contacto = linea.split(",");
                    Persona p = new Persona(contacto[0], contacto[1], contacto[2], contacto[3], contacto[4], contacto[5]);
                    if (buscacedula.equals(contacto[0])) {
                        p.desplegarmedico();
                        x = 1;
                        break;
                    }

                }
                if (x == 0) {
                    System.out.println("\u001B[31m Registro Médico no existe: ");
                }

            } else {
                System.out.println("\u001B[31m Agenda de Médicos vacía");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}


