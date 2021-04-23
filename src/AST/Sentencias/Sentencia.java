/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AST.Sentencias;

/**
 *
 * @author gm_ye
 */
public abstract class Sentencia {

    private int linea = 1; 
    private int columna = 1; 
    
    
    public abstract void Ejecutar();
    
    public void setLineaColumna(int linea, int columna){
        this.setLinea(linea); 
        this.setColumna(columna);
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

}
