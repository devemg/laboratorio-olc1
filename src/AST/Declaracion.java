/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import Analizador.Simbolo;
import Analizador.TipoDatoSimbolo;

/**
 *
 * @author gm_ye
 */
public class Declaracion extends Sentencia {

    TipoDatoSimbolo tipo; 
    String nombre; 

    int linea = 0;
    int columna = 0; 
    
    public Declaracion(TipoDatoSimbolo tipo, String nombre, int linea, int columna) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.linea = linea; 
        this.columna = columna;
    }
    
    
    @Override
    public void Ejecutar() {
        

        int i; 
        for(i = 0; i< Analizador.AnalizadorLenguaje.tablaSimbolos.size(); i++) {
            if(Analizador.AnalizadorLenguaje.tablaSimbolos.get(i).getNombre().equals(this.nombre)){
                    // es un error 
                    //Analizador.AnalizadorLenguaje.
                    
                   return;
              }
        }
        
        // agregar a TS 
        
        Simbolo sim = null;
        String determinado = this.getValorDeterminado(this.tipo);
        if(determinado != null){
           sim = new Simbolo(this.nombre,this.tipo,this.linea,this.columna,determinado);
        }
        if(sim != null){
            Analizador.AnalizadorLenguaje.tablaSimbolos.add(sim);
        }
    }
    
    public String getValorDeterminado(TipoDatoSimbolo tipo){
        switch(tipo){
            case BOOLEANO: 
                return "true";
            case CADENA: 
                return "";
            case NUMERO: 
                return "0";
                default:
                    //error
                    // el tipo de variable no existe
                    return null;
        }
    }
    
    
    
}
