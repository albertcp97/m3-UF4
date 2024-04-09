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
public class Persona {

    @Override
    public String toString() {
        return "Persona: " + "nom" + nom + ", edad=" + edad + ", dni=" + dni ;
    }

    public  Persona(String nom, int edad, String dni) {
        this.nom = nom;
        this.edad = edad;
        this.dni = dni;
    }

    public Persona() {
    }
    
    
  private  String nom;
  private int edad;
  private  String dni;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }
  
  
    
}
