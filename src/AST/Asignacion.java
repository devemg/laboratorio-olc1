/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AST.Sentencias;

import AST.Expresion;
import AST.Sentencia;

/**
 *
 * @author gm_ye
 */
public class Asignacion extends Sentencia {

    String nombre; 
    Expresion expresion;

    public Asignacion(String nombre, Expresion expresion) {
        this.nombre = nombre;
        this.expresion = expresion;
    }
   
    
    @Override
    public void Ejecutar() {
        System.out.println("ejecutando sentencia...");
        System.out.println(this.nombre);
        // ver si la variable existe 
        boolean existe = false;
        int i; 
        for(i = 0; i< Analizador.AnalizadorLenguaje.tablaSimbolos.size(); i++) {
            if(Analizador.AnalizadorLenguaje.tablaSimbolos.get(i).getNombre().equals(this.nombre)){
                  // ver si los tipos son compatibles (------)
                    //if() {
                        // asignar
                        Analizador.AnalizadorLenguaje.tablaSimbolos.get(i).setValor(this.expresion.getValor().toString());
                    //}
                    
                    existe = true; 
                   break;
              }
        }
        
        
        if(!existe){
            // ERROR 
            // NO EXISTE LA VARIABLE
        }
    }
    
    
    
}
