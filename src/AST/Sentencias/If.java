/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AST.Sentencias;

import AST.Expresiones.Condicion;
import AST.Simbolos.TablaSimbolos;
import java.util.ArrayList;

/**
 *
 * @author gm_ye
 */
public class If extends Sentencia{

    private final Condicion condicion; 
    private final ArrayList<Sentencia> listaVerdadero; 
    private final ArrayList<Sentencia> listaFalso; 

    public If(Condicion condicion, ArrayList<Sentencia> listaVerdadero, ArrayList<Sentencia> listaFalso, int linea, int columna) {
        super(linea, columna);
        this.condicion = condicion;
        this.listaVerdadero = listaVerdadero;
        this.listaFalso = listaFalso;
    }
    
    public If(Condicion condicion, ArrayList<Sentencia> listaVerdadero, int linea, int columna) {
        super(linea, columna);
        this.condicion = condicion;
        this.listaVerdadero = listaVerdadero;
        this.listaFalso = new ArrayList<>();
    }
    
    
    @Override
    public void Ejecutar(TablaSimbolos tabla) {
        boolean value = Boolean.parseBoolean(this.condicion.getValor(tabla).toString());
        if(value){
            this.listaVerdadero.forEach(sentencia -> {
                sentencia.Ejecutar(new TablaSimbolos(tabla));
            });
        }else {
            this.listaFalso.forEach(sentencia -> {
                sentencia.Ejecutar(new TablaSimbolos(tabla));
            });
        }
    }
    
        @Override
    public void getCodigoGraph(StringBuilder builder) {
      /*  builder.append(this).append("[label=\"OperacionAritmetica\"];");
        this.izq.getCodigoGraph(builder);
        builder.append(this).append(valor).append("[label=\"").append(this.tipo.toString()).append("\"];");
        this.der.getCodigoGraph(builder);
        builder.append(this).append("->").append(this.izq).append(";");
        builder.append(this).append("->").append(this).append(valor).append(";");
        builder.append(this).append("->").append(this.der).append(";");*/
    }
    
}
