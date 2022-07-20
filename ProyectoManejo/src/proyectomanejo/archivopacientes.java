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
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
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

//BUSCAR PACIENTES
 public void buscarpacientes()
    {
        try
        {
            Integer x=0;
            Scanner tecla = new Scanner(System.in);
            File f=new File("pacientes.txt");
            if (f.exists())
            {
                FileReader fr=new FileReader(f);
                BufferedReader br=new BufferedReader(fr);
                String linea,buscacedula;
                System.out.print("Ingrese la cédula: ");
                buscacedula=(tecla.next().toUpperCase());
                ced=buscacedula;
                while ((linea=br.readLine())!=null)
                {
                    String [] contacto=linea.split(",");
                    Personapacientes p =new Personapacientes(contacto[0],contacto[1],contacto[2],contacto[3],contacto[4],contacto[5],contacto[6],contacto[7],contacto[8],contacto[9],contacto[10],contacto[11],contacto[12],contacto[13],contacto[14]);
                    if (buscacedula.equals(contacto[1]))
                    {
                        p.desplegar();
                        x=1;
                        break;
                    }
                 }
                if (x==0)
                {
                    System.out.println("Registro de pacientes no existe: ");
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

 
 
  //MODIFICAR PACIENTES
 public void modificarpacientes()
    {
        try
        {
            Integer x=0;
            Scanner tecla = new Scanner(System.in);
            File f=new File("pacientes.txt");
            if (f.exists())
            {
                FileReader fr=new FileReader(f);
                BufferedReader br=new BufferedReader(fr);
                String linea,buscacedula;
                
                System.out.print("Ingrese la cédula: ");
                buscacedula=(tecla.next().toUpperCase());
                ced=buscacedula;
                while ((linea=br.readLine())!=null)
                {
                    String [] contacto=linea.split(",");
                    Personapacientes p =new Personapacientes(contacto[0],contacto[1],contacto[2],contacto[3],contacto[4],contacto[5],contacto[6],contacto[7],contacto[8],contacto[9],contacto[10],contacto[11],contacto[12],contacto[13],contacto[14]);
                    if (buscacedula.equals(contacto[1]))
                    {
                        p.desplegar();
                        x=1;
                        hospitalizado=contacto[14];
                        cont[0]=contacto[0];
                        cont[1]=contacto[1];
                        cont[2]=contacto[2];
                        cont[3]=contacto[3];
                        cont[4]=contacto[4];
                        cont[5]=contacto[5];
                        cont[6]=contacto[6];
                        cont[7]=contacto[7];
                        cont[8]=contacto[8];
                        cont[9]=contacto[9];
                        cont[10]=contacto[10];
                        cont[11]=contacto[11];
                        cont[12]=contacto[12];
                        cont[13]=contacto[13];
                        cont[14]=contacto[14];
                        break;
                    }
                 }
                if (x==0)
                {
                    System.out.println("Registro de paciente no existe: ");
                }
                else
                {
                    if ("OCUPADA".equals(hospitalizado))
                      {
                            String mo;
                            System.out.print("Dar de alta al paciente: (S/N).....");
                            mo=(tecla.next().toUpperCase());
                            if( "S".equals(mo))
                            {
                                archivohabitaciones e=new archivohabitaciones();
                                e.modificarhabitacion(new Habitaciones(e.habitacion,e.cama,e.estado)); 
                                altapacientes();
                            }
                        }
                        else
                        {
                            System.out.print("Paciente no está hospitalizado..");
                        }

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

 
 
 
 //MODIFICA CAMA PACIENTES DADOS DE ALTA  
 public void altapacientes()
     {
        
         try
        {
            
         File ff=new File("pacientes.txt");
         FileReader fr=new FileReader(ff);
         BufferedReader br=new BufferedReader(fr);
         String linea;
         int numlineas=0;
         while ((linea=br.readLine())!=null)
         {
             numlineas++;
         }   
            String contactos[] =new String[numlineas];
            br=new BufferedReader(new FileReader(ff));
         Integer i=0;
            while ((linea=br.readLine())!=null)
         {
             contactos[i]=linea;
             i++;
         }   
         fr.close();
         br.close();
         FileWriter fw =new FileWriter(ff);
         BufferedWriter bw=new BufferedWriter(fw);
        
        Integer j;
        Boolean bandera=false;
        Boolean primeral=true;
        String unir;
        
        for(j=0; j<contactos.length;j++)
        {
         String lin [] = contactos[j].split(",");
             if (j>0)
             {
                 bw.newLine();
             }
             if (lin[1].equals(ced)) 
         {
             bandera=true;
             cont[14]="ALTA";
             unir=cont[0]+","+cont[1]+","+cont[2]+","+cont[3]+","+cont[4]+","+cont[5]+","+cont[6]+","+cont[7]+","+cont[8]+","+cont[9]+","+cont[10]+","+cont[11]+","+cont[12]+","+cont[13]+","+cont[14];
             contactos[j]=unir;
             pasahabitacion=cont[12];
             pasacama=cont[13];
             bw.write(contactos[j]);
             archivohabitaciones e=new archivohabitaciones();
             e.modificarHabitacionAltas(new Habitaciones(e.habitacion,e.cama,e.estado));
         }
         else
         {
                  bw.write(contactos[j]);
         }
         
        }
        
        //HABITACIONES
        
        
        
        bw.close();
        fw.close();
        if (numlineas==1 && bandera==true)
        {
            ff.delete();
        }
         
                     
        }
         catch (Exception e)
         {
         System.out.println(e);       
         }
  }    
 
 //ESTADISTICAS PACIENTES
 public void estadicticaspacientes()
    {
        try
        {
            Integer x=0;
            Integer libres=0;
            Integer totcamas=50;
            Integer tothabitaciones=10;
            
            File f=new File("pacientes.txt");
            if (f.exists())
            {
                FileReader fr=new FileReader(f);
                BufferedReader br=new BufferedReader(fr);
                String linea;
                Integer alt=0;
                Integer esp=0;
                Integer ingr=0;
                while ((linea=br.readLine())!=null)
                {
                    String [] contacto=linea.split(",");
                    Personapacientes p =new Personapacientes(contacto[0],contacto[1],contacto[2],contacto[3],contacto[4],contacto[5],contacto[6],contacto[7],contacto[8],contacto[9],contacto[10],contacto[11],contacto[12],contacto[13],contacto[14]);
                    x++;
                    if ("ALTA".equals(contacto[14]))
                    {
                        alt++;
                    }
                    
                    if ("ESPERA".equals(contacto[14]))
                    {
                        esp++;
                    }
                    
                    if ("OCUPADA".equals(contacto[14]))
                    {
                        ingr++;
                    }
                    
                 }
                if (x==0)
                {
                    System.out.println("\n");
                    System.out.println("Registro de pacientes vacío: ");
                }
                libres=totcamas-x;
                System.out.printf("%60s\n","=================================");
                System.out.printf("%63s\n","\033[34;1m Total de habitaciones   = "+tothabitaciones);
                System.out.printf("%63s\n","\033[34;1m Camas por habitación    = 05");
                System.out.printf("%63s\n","\033[34;1m Total camas             = "+totcamas);
                System.out.printf("%63s\n","\033[34;1m Pacientes atendidos      = "+x);
                System.out.printf("%63s\n","\033[34;1m Pacientes hospitalizados = "+ingr);
                System.out.printf("%63s\n","\033[34;1m Pacientes con alta       = "+alt);
                System.out.printf("%63s\n","\033[34;1m Pacientes en espera cama = "+esp);
                System.out.printf("%63s\n","\033[34;1m Total Camas libres      = "+libres);
                System.out.printf("%60s\n","=================================");
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
