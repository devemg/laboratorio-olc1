/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import Analizador.Simbolo;
import java.util.ArrayList;

/**
 *
 * @author gm_ye
 */
public class TablaSimbolos extends ArrayList<Simbolo>{

    public TablaSimbolos() {
        super();
    }
    
    
    public boolean existeVariable(String nombre){
        int i; 
        for(i = 0; i< Analizador.AnalizadorLenguaje.tablaSimbolos.size(); i++) {
            if(Analizador.AnalizadorLenguaje.tablaSimbolos.get(i).getNombre().equals(nombre)){
                    return true;
              }
        }
        return false;
    }
    
    public void agregarVariable(Simbolo var){
        this.add(var);
    }
    
    public String getValorVariable(String nombre){
        int i; 
        for(i = 0; i< Analizador.AnalizadorLenguaje.tablaSimbolos.size(); i++) {
            if(Analizador.AnalizadorLenguaje.tablaSimbolos.get(i).getNombre().equals(nombre)){
                    return Analizador.AnalizadorLenguaje.tablaSimbolos.get(i).getValor();
              }
        }
        return null;
    }
    
    public void asignarValor(String nombre,String valor){
        int i; 
        for(i = 0; i< Analizador.AnalizadorLenguaje.tablaSimbolos.size(); i++) {
            if(Analizador.AnalizadorLenguaje.tablaSimbolos.get(i).getNombre().equals(nombre)){
                    Analizador.AnalizadorLenguaje.tablaSimbolos.get(i).setValor(valor);
              }
        }
    }
    
}
