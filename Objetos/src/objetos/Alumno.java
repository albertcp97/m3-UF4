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
public class Alumno extends Persona{
    public ArrayList<Nota> lNota;
    private double notaMedia;

    public Alumno(String nom, int edad, String dni) {
        super(nom, edad, dni);
        lNota= new ArrayList();
        notaMedia=0;
    }
    
    public void listaNotaAlumno(){
        for(Nota n: lNota)
            System.out.println(n);
    }

    public void calcularNotaMedia(){
       double suma=0;
         for(Nota n: lNota)
             suma+=n.getNotaAsig();
         
         notaMedia=suma/lNota.size();
           
    }
    @Override
    public String toString() {
        return "Alumno "+ this.getNom()+" "+this.getDni()+" "+this.getEdad()+" nota media:"+notaMedia;
    }

  
    
}
