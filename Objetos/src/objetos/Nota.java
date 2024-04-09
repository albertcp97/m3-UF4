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
public class Nota {

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Nota de" + nom + " = " + notaAsig;
    }
    public double getNotaAsig() {
        return notaAsig;
    }

    public void setNotaAsig(double notaAsig) {
        this.notaAsig = notaAsig;
    }
    
    private String nom;
    private double notaAsig;

    public Nota(String nom, double notaAsig) {
        this.nom = nom;
        this.notaAsig = notaAsig;
    }
}
