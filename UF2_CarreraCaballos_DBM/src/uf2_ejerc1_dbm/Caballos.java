/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf2_ejerc1_dbm;


import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dealm
 */

//Declaración de la clase y sus propiedades
class Caballos implements Runnable {
    private String nombreCaballos;
    private long tiempo;
   
    //Constructores
    Caballos () { 
    }
    
    Caballos (String nombre){
        this.nombreCaballos = nombre;
    }
    
    //Ejecución método
    @Override
    public void run (){
        tiempo= Math.round(Math.random()*10)*5;
      
        try {
            if (nombreCaballos.equals(("caballo1"))){
                Thread.sleep(tiempo);
                System.out.println("El "+this.getNombreCaballos()+ " ha llegado en "+tiempo+" minutos");
            } 
            if (nombreCaballos.equals(("caballo2"))){
                    Thread.sleep(tiempo);
                    System.out.println("El "+this.getNombreCaballos()+ " ha llegado en "+tiempo+" minutos");
                }
            if (nombreCaballos.equals(("caballo3"))){
                    Thread.sleep(tiempo);
                    System.out.println("El "+this.getNombreCaballos()+ " ha llegado en "+tiempo+" minutos");
                }
                       
        } catch (InterruptedException ex) {
                Logger.getLogger(Caballos.class.getName()).log(Level.SEVERE, null, ex);
            } 
        
        }

    //Accesores para las propiedades
    public String getNombreCaballos() {
        return nombreCaballos;
    }

    public void setNombreCaballos(String nombreCaballos) {
        this.nombreCaballos = nombreCaballos;
    }

        
    }