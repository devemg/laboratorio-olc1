/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizador;

import AST.Sentencia;
import AST.TablaSimbolos;
import java.io.BufferedReader;
import java.io.StringReader;
import java.util.ArrayList;

/**
 *
 * @author Emely
 */
public class AnalizadorLenguaje {
    private static AnalizadorLenguaje analizador;
    public static TablaSimbolos tablaSimbolos; 
    public static ArrayList<Sentencia> sentencias;
    
 public static boolean AnalizarCodigo(String entrada, String ubicacion) {
        try {
            Sintactico sin = new Sintactico(
                    new Lexico(new BufferedReader(new StringReader(entrada))));
            //analizando
            sin.parse();
            
            int i; 
            for(i = 0; i< AnalizadorLenguaje.sentencias.size(); i++){
                AnalizadorLenguaje.sentencias.get(i).Ejecutar();
            }
            
            System.out.println("Sin errores");
        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
        }
        
        
        
       return true;
    }

 
    public static AnalizadorLenguaje getInstancia() {
        if (analizador == null) {
            analizador = new AnalizadorLenguaje();
            tablaSimbolos = new TablaSimbolos();
        }
        return analizador;
    }

    public static void LimpiarInstancia() {
        if (analizador != null) {
            tablaSimbolos.clear();
            //AnalizadorLenguaje.setErrores(new ArrayList<>());
           } else {
            System.out.println("No existe un analizador");
        }
    }

}
