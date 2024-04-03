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
    
   private String nom;
   private int edat;
   private double altura;
   private String dni;
   
public Persona(){     
      
        this.nom="asd";
        this.edat=-1;
        this.altura=-1;
        this.dni="asddas";
 }

   public Persona(String nom, int edat, double altura, String dni){
       this.nom=nom;
       this.edat=edat;
       this.altura=altura;
       this.dni=dni;
   }
  
    @Override
    public String toString() {
        return nom ;
    }
   
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

//   public String getNom(){
//       return this.nom;
//   }
//   
//   public String getDni(){
//       return this.dni;
//   }
//   
//   public int getEdat(){
//       return this.edat;
//   }
//   
//   public double getAltura(){
//       return this.altura;
//   }
//   
//   public void setNom(String nom){
//       this.nom=nom;
//   }
//   
//   public void setDni(String dni){
//       this.dni=dni;
//   }
//   
//   public void setEdat(int edat){
//       this.edat=edat;
//   }
//   
//   public void setAltura(double altura){
//       this.altura=altura;
//   }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public int getEdat() {
        return edat;
    }

    public double getAltura() {
        return altura;
    }

    public String getDni() {
        return dni;
    }
   
   
   
    
    
    
    
}
