/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author gm_ye
 */
public class OperacionAritmeticas extends Expresion {

    Expresion izq;
    Expresion der;
    TipoOperacion tipo;
    String valor;

    public OperacionAritmeticas(Expresion izq, Expresion der, TipoOperacion tipo) {
        this.izq = izq;
        this.der = der;
        this.tipo = tipo;
        this.valor = null;
    }

    public OperacionAritmeticas(TipoOperacion tipo,String valor) {
        this.tipo = tipo;
        this.izq = null;
        this.der = null;
        this.valor = valor;
    }
    
    

    @Override
    public Object getValor() {
        switch (tipo) {
            case DIVISION:
                double resIzq = Double.parseDouble(izq.getValor().toString());
                double resDer = Double.parseDouble(der.getValor().toString());
                return resIzq / resDer;
            case MULTIPLICACION:
                resIzq = Double.parseDouble(izq.getValor().toString());
                resDer = Double.parseDouble(der.getValor().toString());
                return resIzq * resDer;
            case RESTA:
                resIzq = Double.parseDouble(izq.getValor().toString());
                resDer = Double.parseDouble(der.getValor().toString());
                return resIzq - resDer;
            case SUMA:
                resIzq = Double.parseDouble(izq.getValor().toString());
                resDer = Double.parseDouble(der.getValor().toString());
                return resIzq + resDer;
            case BOOLEANO: 
                return Boolean.parseBoolean(this.valor);
            case CADENA:
                return this.valor.replace("\"", "");
            case NUMERO: 
                return Double.parseDouble(this.valor);
            case  ID: 
                // consultar TS 
               if(Analizador.AnalizadorLenguaje.tablaSimbolos.existeVariable(valor)){
                return Analizador.AnalizadorLenguaje.tablaSimbolos.getValorVariable(valor);
               }else{
                   // ERROR
               }
        }
        return null;
    }

}
