/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author Albert
 */
public class Asignatura {

    public Asignatura(String nom, double nota) {
        this.nom = nom;
        this.nota = nota;
    }
    
    private String nom;
    private double nota;

    public String getNom() {
        return nom;
    }

    public double getNota() {
        return nota;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
