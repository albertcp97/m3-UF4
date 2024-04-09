/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.ArrayList;

/**
 *
 * @author Albert
 */
public class Profesor extends Persona{

    private int curso;
    public ArrayList<Alumno> lAlumnos;
    
    @Override
    public String toString() {
        return "Profesor" + this.getNom()+" "+this.getDni()+" "+this.getEdad()+" "+curso;
    }

    public  Profesor(int curso, String nom, int edad, String dni) {
        super(nom, edad, dni);
        this.curso = curso;
        lAlumnos= new ArrayList<>();
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public int getCurso() {
        return curso;
    }
      public void listaAlumnos(){
        for(Alumno n: lAlumnos)
        {    System.out.println(n);
            System.out.println("Notas:");
            n.listaNotaAlumno();
        }
    }
    
   public void anadirAlumno(String nom, String DNI, int edat){
       
       lAlumnos.add(new Alumno(nom, edat, DNI));
       System.out.println("Añadido");
   }
   
   public void anadirNotaAAlumno(String nom, String nAsig, double notaAsig){
        for(Alumno n: lAlumnos)
        {   
            if(nom.equalsIgnoreCase(n.getNom())){
                n.lNota.add(new Nota(nAsig, notaAsig));
                n.calcularNotaMedia();
                
            }
        }
   }
   
   
    
}
