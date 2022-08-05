/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplopolimorfismo;

/**
 *
 * @author StudioOne
 */
public class Masajista extends SelecciondeFutbol {
    private String Titulacion;
    private int aniosExperiencia;

    public Masajista(String Titulacion) {
        this.Titulacion = Titulacion;
    }

    public Masajista (int id, String Nombre, String Apellidos, int Edad,String titulacion,int anioExperiencia) {
        super(id, Nombre, Apellidos, Edad);
        this.Titulacion = Titulacion;
    }
    

    public String getTitulacion() {
        return Titulacion;
    }

    public void setTitulacion(String Titulacion) {
        this.Titulacion = Titulacion;
    }
    
    public void darMasaje(){}
    
    public Masajista(){
    super();}
    
}
