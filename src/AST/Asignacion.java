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
        if(Analizador.AnalizadorLenguaje.tablaSimbolos.existeVariable(nombre)){
            Analizador.AnalizadorLenguaje.tablaSimbolos.asignarValor(nombre,this.expresion.getValor().toString());
        }else {
            // ERROR
        }
    }
    
    
    
}
