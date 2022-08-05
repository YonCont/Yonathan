/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemplopolimorfismo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author StudioOne
 */
public class EjemploPolimorfismo {

    public static ArrayList<SelecciondeFutbol>integrantes = new ArrayList<SelecciondeFutbol>();
            public static void main(String[] args) {
                Scanner entrada = new Scanner(System.in);
        System.out.println("Hello World!");
        // futbolista
        // entrenador
        // masajista
        // seleccion de futbol
        
                System.out.println("Ingrese el id del entrenador");
                int id = entrada.nextInt();
                System.out.println("Ingrse el nombre del entrenador");
                String nombre = entrada.next();
                System.out.println("Ingrse el nombre del entrenador");
                String apellido = entrada.next();
                
                 //entrenador delBosque= new Entrenador(id,nombre,apellido):
        
        Entrenador delBosque = new Entrenador(1,"Vicente","Del bosque",60,"45fgdd");
        Futbolista iniesta = new Futbolista(2,"ANDRES","iNISESTA",30,6,"INterior Derecho");
       Masajista raulMartinez= new Masajista(3,"RAÚL","Martinez",43,"Licenciado en fisioterapia",18);
        
       integrantes.add(delBosque);
       integrantes.add(iniesta);
       integrantes.add(raulMartinez);
        
       // concentracion
                System.out.println("Todos los integrantes se concentran");
                for (SelecciondeFutbol integrante : integrantes) {
                    System.out.println(integrante.getNombre() + " " + integrante.getApellidos() + " --");
                    integrante.Concentrarse();
                }
       
        // viajar
        
          System.out.println("Todos los integrantes viajan");
                for (SelecciondeFutbol integrante : integrantes) {
                    System.out.println(integrante.getNombre() + " " + integrante.getApellidos() + " --");
                    integrante.Viajar();
                }
       
        
    }
}
