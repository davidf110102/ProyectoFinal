/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomanejo;

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
        opciones.add("\033[34;1m 1.- Llenar Médicos");
        opciones.add("\033[34;1m 2.- Lista de médicos");
        opciones.add("\033[34;1m 3.- Llenar pacientes");
        opciones.add("\033[34;1m 4.- Lista de pacientes");
        opciones.add("\033[34;1m 5.- Llenar habitaciones");
        opciones.add("\033[34;1m 6.- Lista de habitaciones");
        opciones.add("\033[34;1m 7.- Salir");
        while (repetir == true) {
            for (String i2 : opciones) {
                System.out.printf(i2 + " \n");
            }
            System.out.printf("%56s", "\033[35;1m Ingrese la Opción: ");
            //op=Integer.valueOf(tecla.nextInt());
            op = tecla.nextInt();
            switch (op) {
                case 1:
                   
                    break;
                case 2:
                    
                    break;
                case 3:
                   
                    break;
                case 4:
                    
                    break;
                case 5:
                   
                    break;
                case 6:
                    
                    break;
                case 7:
                    repetir = false;
                    break;
            }
        }
    }
    
}
