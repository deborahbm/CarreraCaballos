/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf2_ejerc1_dbm;

/**
 *
 * @author dealm
 */
public class UF2_Ejerc1_DBM {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println ("EMPIEZA LA CARRERA");
        //Construcción objetos
        Caballos c1=new Caballos ("caballo1");
        Caballos c2=new Caballos ("caballo2");
        Caballos c3=new Caballos ("caballo3");
        
        //Construcción hilos de los objetos
        Thread carrera1= new Thread (c1);
        Thread carrera2= new Thread (c2);
        Thread carrera3= new Thread (c3);
        
        //Ejecución hilos
        carrera1.start();
        System.out.println ("Caballo1 comienza la carrera");
        carrera2.start();
        System.out.println ("Caballo2 comienza la carrera");
        carrera3.start();
        System.out.println ("Caballo3 comienza la carrera");
        
        System.out.println ("LA CARRERA HA TERMINADO");
    }
    
}
