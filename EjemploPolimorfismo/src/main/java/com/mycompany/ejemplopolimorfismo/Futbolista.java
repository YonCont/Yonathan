/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplopolimorfismo;

/**
 *
 * @author StudioOne
 */
public class Futbolista extends SelecciondeFutbol  {

    public Futbolista(int dorsal, String demarcacion) {
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public Futbolista(int id, String Nombre,String Apellidos,int Edad,int dorsal,String demarcacion) {
        super(id, Nombre, Apellidos, Edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
   
    public Futbolista(){
    super();
    }

  

    
    
    private int dorsal;
    private String demarcacion;

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    
    
    public void jugarPartido(){}
    public void entrenar(){}
    
    
    
    
    
}
