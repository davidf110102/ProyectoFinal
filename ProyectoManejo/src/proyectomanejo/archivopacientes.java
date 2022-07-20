/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectomanejo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;





public class archivopacientes {
public static String ced;
public static String hospitalizado;
public static String pasahabitacion;
public static String pasacama;
String cont[] =new String[20];

public void escribirpersona(Personapacientes nueva)
     {
        try
        {
         File f=new File ("pacientes.txt");
         FileWriter fw;
         BufferedWriter bw;
                
            if (f.exists())
            {
                fw=new FileWriter(f,true);
                bw=new BufferedWriter (fw);
                bw.newLine();
                bw.write(nueva.fecha+","+nueva.cedula+","+nueva.nombre+","+nueva.apellido+","+nueva.direccion+","+nueva.telefono+","+nueva.pulso+","+nueva.presion+","+nueva.temperatura+","+nueva.razon+","+nueva.cedmedico+","+nueva.medico+","+nueva.habitacion+","+nueva.cama+","+nueva.observacion);
            }
            else
            {
                fw=new FileWriter(f,true);
                bw=new BufferedWriter (fw);
                bw.write(nueva.fecha+","+nueva.cedula+","+nueva.nombre+","+nueva.apellido+","+nueva.direccion+","+nueva.telefono+","+nueva.pulso+","+nueva.presion+","+nueva.temperatura+","+nueva.razon+","+nueva.cedmedico+","+nueva.medico+","+nueva.habitacion+","+nueva.cama+","+nueva.observacion);
            }
                bw.close();
                fw.close();
        }
         catch (Exception e)
         {
         System.out.println(e);       
         }
}    


public void imprimir()
    {
        try
        {
            File f=new File("pacientes.txt");
            if (f.exists())
            {
                FileReader fr=new FileReader(f);
                BufferedReader br=new BufferedReader(fr);
                String linea;
                while ((linea=br.readLine())!=null)
                    
                {
                    String [] contacto=linea.split(",");
                    Personapacientes p =new Personapacientes(contacto[0],contacto[1],contacto[2],contacto[3],contacto[4],contacto[5],contacto[6],contacto[7],contacto[8],contacto[9],contacto[10],contacto[11],contacto[12],contacto[13],contacto[14]);
                    p.desplegar2();
                    System.out.println("==================================");
                }
            }
            else
            {
                System.out.println("Agenda de Pacientes vacía");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }    
    }
}
