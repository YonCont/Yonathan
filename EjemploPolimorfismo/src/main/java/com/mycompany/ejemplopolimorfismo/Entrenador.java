/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplopolimorfismo;

/**
 *
 * @author StudioOne
 */
public class Entrenador  extends SelecciondeFutbol{
   
    private String idFederecion;
    public Entrenador(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public Entrenador( int id, String Nombre, String Apellidos, int Edad,String idFederacion) {
        super(id, Nombre, Apellidos, Edad);
        this.idFederacion = idFederacion;
        
    }
    private String idFederacion;
 
    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public Entrenador() {
        super();
    }

    public void dirigirPartido() {
    }

    public void dirigirEntreno() {
    }

    
    
}
