/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AST.Expresiones;

import AST.Errores.MiError;
import AST.Errores.TipoError;
import AST.Expresion;

/**
 *
 * @author gm_ye
 */
public class Condicion extends Expresion {

    
    public Condicion(Expresion izq, Expresion der, TipoCondicion tipo, int linea, int columna) {
        super(linea, columna);
        this.izq = izq;
        this.der = der;
        this.tipo = tipo;
    }
        
    
    @Override
    public Object getValor() {
        double vizq = Double.parseDouble(this.izq.getValor().toString());
        double vder = Double.parseDouble(this.der.getValor().toString());
        switch(this.tipo){
            case DIFERENTE: 
                return vizq != vder;
            case IGUAL: 
                return vizq == vder;
            case MAYOR: 
                return vizq > vder;
           case MENOR: 
                return vizq < vder;
           default:
               Analizador.AnalizadorLenguaje.errores.add(
               new MiError(this.linea, this.columna, TipoError.SEMANTICO, "Tipo de operación relacional inválida"));
               return null;
        }
    }
    
    
    /**
     * @return the linea
     */
    public int getLinea() {
        return linea;
    }

    /**
     * @param linea the linea to set
     */
    public void setLinea(int linea) {
        this.linea = linea;
    }

    /**
     * @return the columna
     */
    public int getColumna() {
        return columna;
    }

    /**
     * @param columna the columna to set
     */
    public void setColumna(int columna) {
        this.columna = columna;
    }

    
    /**
     * @return the izq
     */ 
    public Expresion getIzq() {
        return izq;
    }

    /**
     * @param izq the izq to set
     */
    public void setIzq(Expresion izq) {
        this.izq = izq;
    }

    /**
     * @return the der
     */
    public Expresion getDer() {
        return der;
    }

    /**
     * @param der the der to set
     */
    public void setDer(Expresion der) {
        this.der = der;
    }

    /**
     * @return the tipo
     */
    public TipoCondicion getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(TipoCondicion tipo) {
        this.tipo = tipo;
    }

    private Expresion izq; 
    private Expresion der; 
    private TipoCondicion tipo; 
    private int linea; 
    private int columna; 

    
}
