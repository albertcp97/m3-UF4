/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Albert
 */
public class Main {

     static ArrayList<Profesor> listaProfesores= new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona1 = new Persona("Juan",30,"12345678A");
        
        System.out.println(persona1);
        Scanner sc= new Scanner(System.in);
        boolean bander=true;
        while (bander){
            
               System.out.println("Elige una opcion");
            System.out.println("1. añadir profesor");
            System.out.println("2. listar profesores");
            System.out.println("3. borrar profesores");
            System.out.println("4. Añadir alumno a profesor");
            System.out.println("5. Añadir nota a un alumno de un profesor");
            System.out.println("0. Salir");
            int opc= sc.nextInt();
            sc.nextLine();
            switch(opc){
                case 1:
                    System.out.println("Introduce el nombre");
                    String nom= sc.nextLine();
                    System.out.println("Introduce el dni");
                    String dni= sc.nextLine();                    
                    System.out.println("Introduce la edat");
                    int edat = Integer.parseInt(sc.nextLine());
                    System.out.println("Introduce el curso");
                    int curso = Integer.parseInt(sc.nextLine());
                    añadirProfesor(nom, dni, edat, curso);
                    System.out.println("Hecho!");
                    break;
                case 2:
                    
                    for(Profesor p : listaProfesores){
                        
                        System.out.println("Lista profesores");
                        System.out.println(p);
                        System.out.println("Lista Alumnos:");
                        p.listaAlumnos();
                        
                    }
                    
                    break;
                case 3:
                    
                    System.out.println("Indica el profe a borrar");
                    String nomAux= sc.nextLine();
                    Profesor profeAux= null;
                     for(Profesor p : listaProfesores){
                      
                      //  if(p.getNom().toLowerCase().equalsIgnoreCase(nomAux.toLowerCase())
                        if(p.getNom().equalsIgnoreCase(nomAux))
                        {
                            System.out.println("Hecho!");
                           profeAux=p;
                           break;
                        }
                        
                    }
                     if(profeAux!=null){
                         listaProfesores.remove(profeAux);
                     }else
                         System.out.println("Profe no encontrado");
                    
                    break;
                 case 4:
                     System.out.println("Indique el profesor:");
                     String nomAux2= sc.nextLine();
                     
                     for(Profesor p : listaProfesores)
                     {
                         if(p.getNom().equalsIgnoreCase(nomAux2)){
                              System.out.println("Introduce el nombre");
                                String nomAl= sc.nextLine();
                                System.out.println("Introduce el dni");
                                String dniAl= sc.nextLine();                    
                                System.out.println("Introduce la edat");
                                int edatAl = Integer.parseInt(sc.nextLine());
                                
                                p.anadirAlumno(nomAl, dniAl, edatAl);
                         }
                     }
                     System.out.println("Hecho");
                    break;
                 case 5:
                          System.out.println("Indique el profesor:");
                     String nomAux3= sc.nextLine();
                     
                     for(Profesor p : listaProfesores)
                     {
                         if(p.getNom().equalsIgnoreCase(nomAux3)){
                              System.out.println("Indique el nombre del Alumno");
                                String nomAl= sc.nextLine();                               
                              System.out.println("Indique el nombre del asignatura");
                                String nomAsig= sc.nextLine();
                                                  
                              System.out.println("Indique la nota");
                                double nota= sc.nextInt();
                                sc.nextLine();
                                
                                p.anadirNotaAAlumno(nomAl, nomAsig, nota);
                         }
                     }
                     System.out.println("Hecho");
                    break;
                case 0:
                     bander=false;
                    break;
                default:
                    System.out.println("pon una opcion valida");
                    
            }
            
            
        }
                
        
        
        
        
    }

    private static void añadirProfesor(String nom, String dni, int edat, int curso) {
        listaProfesores.add(new Profesor(curso, nom, edat, dni));
    }
    
}
