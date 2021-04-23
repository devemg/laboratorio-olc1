/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizador;

import AST.Errores.ListaErrores;
import AST.Sentencias.Sentencia;
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
    public static ListaErrores errores; 
    
 public static boolean AnalizarCodigo(String entrada, String ubicacion) {
        try {
            Sintactico sin = new Sintactico(
                    new Lexico(new BufferedReader(new StringReader(entrada))));
            //analizando
            sin.parse();
            
            if(AnalizadorLenguaje.sentencias != null){
                int i; 
            for(i = 0; i< AnalizadorLenguaje.sentencias.size(); i++){
                AnalizadorLenguaje.sentencias.get(i).Ejecutar();
            }
            
            System.out.println("Sin errores");
            }else {
                throw  new Exception("No hay sentencias reconocidas");
            }
        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
        }
        
        if(AnalizadorLenguaje.errores.size() > 0){
            return false;
        }
       return true;
    }

 
    public static AnalizadorLenguaje getInstancia() {
        if (analizador == null) {
            analizador = new AnalizadorLenguaje();
            tablaSimbolos = new TablaSimbolos();
            errores = new ListaErrores();
        }
        return analizador;
    }

    public static void LimpiarInstancia() {
        if (analizador != null) {
            tablaSimbolos.clear();
            errores.clear();
           } else {
            System.out.println("No existe un analizador");
        }
    }

}
