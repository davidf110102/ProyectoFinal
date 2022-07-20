/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomanejo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import proyectomanejo.Habitaciones;
import proyectomanejo.IngresoAltas;


/**
 *
 * @author DELLWIN10
 */
public class archivohabitaciones {
    public String habitacion, habita;
    public String cama, cam;
    public String estado, est;
    Scanner tecla = new Scanner(System.in);
    public static Integer haycama;
    Habitaciones habitaciones = new Habitaciones();
    IngresoAltas Ingresosaltas = new IngresoAltas();

    public void escribirpersona(proyectomanejo.Habitaciones nueva) {
        try {
            File f = new File("habitaciones.txt");
            FileWriter fw;
            BufferedWriter bw;

            if (f.exists()) {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write(nueva.habitacion + "," + nueva.cama + "," + nueva.estado);
            } else {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.write(nueva.habitacion + "," + nueva.cama + "," + nueva.estado);
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

//BUSCAR HABITACIONES
    public void buscarhabitaciones() {
        try {
            haycama = 0;
            Integer x = 0;
            File f = new File("habitaciones.txt");
            if (f.exists()) {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                while ((linea = br.readLine()) != null) {
                    String[] contacto = linea.split(",");
                    Habitaciones p = new Habitaciones(contacto[0], contacto[1], contacto[2]);
                    if ("LIBRE".equals(contacto[2])) {
                        p.desplegar3();
                        x = 1;
                        haycama = 1;
                        break;
                    }

                }
                if (x == 0) {
                    //System.out.println("\u001B[31m Registro de Habitaciones no existe: ");
                    haycama = 0;
                }
            } else {
                System.out.println("\u001B[31m Agenda de Habitaciones vacía");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

//GRABAR HABITACIONES 
    public void grabarhabitaciones() {
        try {
            Integer x = 0;
            File f = new File("habitaciones.txt");
            if (f.exists()) {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                habitacion = Ingresosaltas.pasahabitacion;
                cama = Ingresosaltas.pasacama;
                while ((linea = br.readLine()) != null) {
                    String[] contacto = linea.split(",");
                    Habitaciones p = new Habitaciones(contacto[0], contacto[1], contacto[2]);
                    if (contacto[0].equals(habitacion) && contacto[1].equals(cama)) {
                        x++;
                        break;
                    }
                }
            } else {
                System.out.println("\u001B[31m Agenda de Habitaciones vacía");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    //MODIFICA HABITACIONES  CUANDO INGRESA NUEVO PACIENTE
    public void modificarhabitacion(Habitaciones nueva) {
        try {
            File ff = new File("habitaciones.txt");
            FileReader fr = new FileReader(ff);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            int numlineas = 0;
            while ((linea = br.readLine()) != null) {
                numlineas++;
            }
            String contactos[] = new String[numlineas];
            br = new BufferedReader(new FileReader(ff));
            Integer i = 0;
            while ((linea = br.readLine()) != null) {
                contactos[i] = linea;
                i++;
            }
            fr.close();
            br.close();
            FileWriter fw = new FileWriter(ff);
            BufferedWriter bw = new BufferedWriter(fw);

            Integer j;
            habitacion = Ingresosaltas.pasahabitacion;
            cama = Ingresosaltas.pasacama;
            estado = "OCUPADA";
            Boolean bandera = false;
            Boolean primeral = true;
            for (j = 0; j < contactos.length; j++) {
                if (j >= 1) {
                    bw.newLine();
                }
                String lin[] = contactos[j].split(",");

                if ((lin[0].equals(habitacion)) && (lin[1].equals(cama))) {
                    bandera = true;
                    contactos[j] = habitacion + "," + cama + "," + estado;
                    bw.write(contactos[j]);
                } else {
                    bw.write(contactos[j]);

                }

            }
            bw.close();
            fw.close();
            if (numlineas == 1 && bandera == true) {
                ff.delete();
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    //MODIFICA HABITACIONES PACIENTES CON ALTA
    public void modificarhabitacionaltas(Habitaciones nueva) {
        try {
            File ff = new File("habitaciones.txt");
            FileReader fr = new FileReader(ff);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            int numlineas = 0;
            while ((linea = br.readLine()) != null) {
                numlineas++;
            }
            String contactos[] = new String[numlineas];
            br = new BufferedReader(new FileReader(ff));
            Integer i = 0;
            while ((linea = br.readLine()) != null) {
                contactos[i] = linea;
                i++;
            }
            fr.close();
            br.close();
            FileWriter fw = new FileWriter(ff);
            BufferedWriter bw = new BufferedWriter(fw);

            Integer j;
            //habitacion = archivopacientes.pasahabitacion;
            //cama = archivopacientes.pasacama;
            estado = "LIBRE";
            Boolean bandera = false;
            Boolean primeral = true;
            for (j = 0; j < contactos.length; j++) {
                if (j > 0) {
                    bw.newLine();
                }

                String lin[] = contactos[j].split(",");
                if ((lin[0].equals(habitacion)) && (lin[1].equals(cama))) {
                    bandera = true;
                    contactos[j] = habitacion + "," + cama + "," + estado;
                    bw.write(contactos[j]);
                } else {
                    bw.write(contactos[j]);

                }

            }
            bw.close();
            fw.close();
            if (numlineas == 1 && bandera == true) {
                ff.delete();
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    //EDITAR HABITACIONES
    public void editarhabitaciones() {
        try {
            Integer x = 0;
            File f = new File("habitaciones.txt");
            if (f.exists()) {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                System.out.printf("%56s", "\033[35;1m Habitación: ");
                habitacion = tecla.next();
                System.out.printf("%56s", "\033[35;1m cama: ");
                cama = tecla.next();

                while ((linea = br.readLine()) != null) {
                    String[] contacto = linea.split(",");
                    Habitaciones p = new Habitaciones(contacto[0], contacto[1], contacto[2]);
                    if (contacto[0].equals(habitacion) && contacto[1].equals(cama)) {
                        x++;
                        System.out.println("Habitaciones y cama encontrada: ");
                        break;
                    }
                }

            } else {
                System.out.println("\u001B[31m Agenda de Habitaciones vacía");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void actualizarhabitaciones() {
        try {
            Integer x = 0;
            File f = new File("habitaciones.txt");
            if (f.exists()) {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                Integer numlineas = 0;
                habitacion = Ingresosaltas.pasahabitacion;
                cama = Ingresosaltas.pasacama;
                //System.out.println("Habitaciones =: "+habitacion);         
                //System.out.println("Cama: "+cama);         

                while ((linea = br.readLine()) != null) {
                    String[] contacto = linea.split(",");
                    Habitaciones p = new Habitaciones(contacto[0], contacto[1], contacto[2]);
                    if (contacto[0].equals(habitacion) && contacto[1].equals(cama)) {
                        //p.desplegar3();
                        x++;
                        System.out.println("Habitaciones y cama encontrada: ");
                        break;
                    }
                }

            } else {
                System.out.println("\u001B[31m Agenda de Habitaciones vacía");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
