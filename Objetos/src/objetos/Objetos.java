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
public class Objetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Instanciamos un nuevo objeto Persona
        Persona p = new Persona("Juan", 15,140,"12345678A");
        p= new Persona();
        System.out.println("Hola soy "+p);
        //Asignamos valores a sus variables
        Scanner sc= new Scanner(System.in);
        p.setNom("Juanito");
        //p.setNom(sc.nextLine());
        p.setAltura(1.59);
        p.setEdat(15);
        p.setDni("12345678A");
        //print del objeto persona
        System.out.println("Hola soy "+p);
        
        
        ArrayList<Persona> lPerson = new ArrayList<>();
        
        lPerson.add(p);
        
        for(int i=0; i<lPerson.size();i++)
            System.out.println(lPerson.get(i));
        
        for(Persona personaAux : lPerson){
            System.out.println(personaAux);
        }
        
        Alumno al1= new Alumno(1,0,"Alumno1",15,140,"12345678A");
        
        System.out.println(al1);
        
        
        Asignatura a1= new Asignatura("Programacion",5);
        Asignatura a2= new Asignatura("Base de datos",10);
        Asignatura a3= new Asignatura("FOL",2);
        
        
//        //Instanciamos otro objeto persona con valores distintos
//         Persona p2 = new Persona();
//                 
//        p2.nom= "Pepe";
//        p2.altura=1.59;
//        p2.edat=15;
//        p2.dni="12345678A";
//        //print del objeto persona
//        System.out.println("Hola soy "+p2.nom+" "+p2.dni+" "+p2.altura+" "+p2.edat);
    }
    
}
