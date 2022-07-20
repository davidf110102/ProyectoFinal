/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomanejo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author Lizard
 */
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

    
    
}
