package objetos;


import java.util.ArrayList;
import objetos.Persona;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Albert
 */
public class Alumno extends Persona{

    public Alumno(int curso, double notaMedia, String nom, int edat, double altura, String dni) {
        super(nom, edat, altura, dni);
        this.curso = curso;
        this.notaMedia = notaMedia;
        notas= new ArrayList<>();
    }
    
    private int curso;
    private double notaMedia;
    public ArrayList<Asignatura> notas;

    public int getCurso() {
        return curso;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    @Override
    public String toString() {
        return "Alumno{" +"Nom="+this.getNom()+ " curso=" + curso + ", notaMedia=" + notaMedia + '}';
    }


    
    
    
}
