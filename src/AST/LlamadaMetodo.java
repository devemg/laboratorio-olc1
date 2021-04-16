/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import interfaz.Principal;
import java.util.ArrayList;

/**
 *
 * @author gm_ye
 */
public class LlamadaMetodo extends Sentencia{
    ArrayList<Expresion> parametros;
    String nombre; 

    public LlamadaMetodo(ArrayList<Expresion> parametros, String nombre) {
        this.parametros = parametros;
        this.nombre = nombre;
    }

    @Override
    public void Ejecutar() {
        if("print".equals(nombre.toLowerCase())){
            int i; 
            for(i = 0; i < this.parametros.size(); i++){
                Principal.escribirMensajeEnConsola(this.parametros.get(i).getValor().toString());
            }
        }
    }
    
}
