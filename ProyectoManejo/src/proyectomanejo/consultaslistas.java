/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomanejo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lizard
 */
public class consultaslistas {

    Boolean repetir = true;
    Integer op;

    ArrayList<String> lmedicos = new ArrayList();
    ArrayList<String> opciones = new ArrayList();
    ArrayList<String> lpacientes = new ArrayList();
    ArrayList<String> lhabitaciones = new ArrayList();
    String[][] arraymedicos = new String[100][100];
    String[][] arraypacientes = new String[100][100];

    public void menu() {

        Scanner tecla = new Scanner(System.in);
        System.out.printf("%60s\n", "\033[35;1m C O N S U L T A S");
        opciones.add("\033[34;1m 1.- LISTA DE MÉDICOS");
        opciones.add("\033[34;1m 2.- LISTA DE PACIENTES");
        opciones.add("\033[34;1m 3.- LISTA DE HABITACIONES");
        opciones.add("\033[34;1m 4.- SALIR");
        while (repetir == true) {
            for (String i2 : opciones) {
                System.out.printf(i2 + " \n");
            }
            System.out.printf("%56s", "\033[35;1m INGRESE UNA OPCIÓN: ");
            //op=Integer.valueOf(tecla.nextInt());
            op = tecla.nextInt();
            switch (op) {
                case 1:
                    Llenarmedicos();
                    vermedicos();
                    break;
                case 2:
                    Llenarpacientes();
                    verpacientes();
                    break;
                case 3:
                    Llenarhabitaciones();
                    verhabitaciones();
                    break;
                case 4:
                    repetir = false;
                    break;
            }
        }
    }

    public void Llenarmedicos() {
        try {
            Integer z = 0;
            z = lmedicos.size();
            if (z == 0) {
                Scanner tecla = new Scanner(System.in);
                File f = new File("medicos.txt");
                if (f.exists()) {
                    FileReader fr = new FileReader(f);
                    BufferedReader br = new BufferedReader(fr);
                    String linea;
                    Integer fil = 0;
                    while ((linea = br.readLine()) != null) {
                        String[] contacto = linea.split(",");

                        Persona p = new Persona(contacto[0], contacto[1], contacto[2], contacto[3], contacto[4], contacto[5]);
                        lmedicos.add(linea);
                        arraymedicos[fil][0] = contacto[0];
                        arraymedicos[fil][1] = contacto[1];
                        arraymedicos[fil][2] = contacto[2];
                        arraymedicos[fil][3] = contacto[3];
                        arraymedicos[fil][4] = contacto[4];
                        arraymedicos[fil][5] = contacto[5];
                        fil++;

                    }
                    System.out.printf("lista de médicos cargada.... \n");
                } else {
                    System.out.printf("lista de médicos cargada.... \n");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void vermedicos() {
        Integer n = 0;
        n = lmedicos.size();
        if (n == 0) {
            System.out.printf("Primero debe llenar la lista de médicos.... \n");
        } else {
            Integer fil = 0;
            System.out.println("====================================================="
                    + "==================================================");
            System.out.printf("%8S%14S%15S%19S%20S%27S\n",
                    "Cédula:", "Nombre:", "Apellido:", "Dirección:", "Telf:", "Especialidad:");
            System.out.println("====================================================="
                    + "==================================================");
            for (String i2 : lmedicos) {

                System.out.printf("%1s", arraymedicos[fil][0]);
                System.out.printf("%10s", arraymedicos[fil][1]);
                System.out.printf("%15s", arraymedicos[fil][2]);
                System.out.printf("%20s", arraymedicos[fil][3]);
                System.out.printf("%22s", arraymedicos[fil][4]);
                System.out.printf("%25s", arraymedicos[fil][5]);
                System.out.printf("\n");
                fil++;

            }
        }
    }

    public void Llenarpacientes() {
        try {
            Integer z = 0;
            z = lpacientes.size();
            if (z == 0) {
                Scanner tecla = new Scanner(System.in);
                File f = new File("pacientes.txt");
                if (f.exists()) {
                    FileReader fr = new FileReader(f);
                    BufferedReader br = new BufferedReader(fr);
                    String linea;
                    Integer fil = 0;
                    while ((linea = br.readLine()) != null) {
                        String[] contacto = linea.split(",");
                        Personapacientes p = new Personapacientes(contacto[0], contacto[1], contacto[2], contacto[3], contacto[4], contacto[5], contacto[6], contacto[7], contacto[8], contacto[9], contacto[10], contacto[11], contacto[12], contacto[13], contacto[14]);
                        lpacientes.add(linea);
                        arraypacientes[fil][0] = contacto[0];
                        arraypacientes[fil][1] = contacto[1];
                        arraypacientes[fil][2] = contacto[2];
                        arraypacientes[fil][3] = contacto[3];
                        arraypacientes[fil][4] = contacto[4];
                        arraypacientes[fil][5] = contacto[5];
                        arraypacientes[fil][6] = contacto[6];
                        arraypacientes[fil][7] = contacto[7];
                        arraypacientes[fil][8] = contacto[8];
                        arraypacientes[fil][9] = contacto[9];
                        arraypacientes[fil][10] = contacto[10];
                        arraypacientes[fil][11] = contacto[11];
                        arraypacientes[fil][12] = contacto[12];
                        arraypacientes[fil][13] = contacto[13];
                        arraypacientes[fil][14] = contacto[14];
                        fil++;
                    }
                    System.out.printf("lista de pacientes cargada.... \n");
                } else {
                    System.out.printf("lista de pacientes cargada.... \n");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void verpacientes() {
        Integer n = 0;
        n = lpacientes.size();
        if (n == 0) {
            System.out.printf("Primero debe llenar la lista de pacientes.... \n");
        } else {
            Integer fil = 0;
            System.out.println("========================================================================================================================"
                    + "===================================================================================================================");

            System.out.printf("%8S%16S%17S%15S%16S%13S%17S%16S%16S%14S%16S%19S%20S%16S%16S\n",
                    "Fecha:", "Cédula:", "Nombre:", "Apellido:", "Dirección:", "Télf:", "pulso:",
                    "Preción:", "Temperatura:", "Razón:", "Ced.Médico:", "Médico:", "Habitación:",
                    "Cama:", "Observación");
            System.out.println("========================================================================================================================"
                    + "===================================================================================================================");
            for (String i2 : lpacientes) {

                System.out.printf("%1s", arraypacientes[fil][0]);
                System.out.printf("%15s", arraypacientes[fil][1]);
                System.out.printf("%15s", arraypacientes[fil][2]);
                System.out.printf("%15s", arraypacientes[fil][3]);
                System.out.printf("%15s", arraypacientes[fil][4]);
                System.out.printf("%15s", arraypacientes[fil][5]);
                System.out.printf("%15s", arraypacientes[fil][6]);
                System.out.printf("%15s", arraypacientes[fil][7]);
                System.out.printf("%15s", arraypacientes[fil][8]);
                System.out.printf("%18s", arraypacientes[fil][9]);
                System.out.printf("%15s", arraypacientes[fil][10]);
                System.out.printf("%21s", arraypacientes[fil][11]);
                System.out.printf("%18s", arraypacientes[fil][12]);
                System.out.printf("%15s", arraypacientes[fil][13]);
                System.out.printf("%15s", arraypacientes[fil][14]);
                System.out.printf("\n");
                fil++;
            }
        }
    }

    public void Llenarhabitaciones() {
        try {
            Integer z = 0;
            z = lhabitaciones.size();
            if (z == 0) {
                Scanner tecla = new Scanner(System.in);
                File f = new File("habitaciones.txt");
                if (f.exists()) {
                    FileReader fr = new FileReader(f);
                    BufferedReader br = new BufferedReader(fr);
                    String linea;
                    Integer fil = 0;
                    while ((linea = br.readLine()) != null) {
                        String[] contacto = linea.split(",");
                        lhabitaciones.add(linea);
                        fil++;

                    }
                    System.out.printf("lista de habitaciones cargada.... \n");
                } else {
                    System.out.printf("lista de habitaciones cargada.... \n");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void verhabitaciones() {
        Integer n = 0;
        n = lhabitaciones.size();
        if (n == 0) {
            System.out.printf("Primero debe llenar la lista de habitaciones.... \n");
        } else {
            Integer fil = 0;
            Integer h = 1;
            System.out.println("=================");
            System.out.printf("%10s\n", "\033[35;1m HABITACION...." + h);
            System.out.println("=================");
            for (String i2 : lhabitaciones) {
                fil++;
                if (fil == 6) {
                    fil = 1;
                    h++;
                    System.out.println("=================");
                    System.out.printf("%10s\n", "\033[35;1mHABITACION...." + h);
                    System.out.println("=================");
                }
                System.out.println(i2);
            }
            System.out.println("=================");
        }
    }

}
