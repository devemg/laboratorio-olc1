
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Fri Apr 09 11:44:44 CST 2021
//----------------------------------------------------

package Analizador;

import java_cup.runtime.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Fri Apr 09 11:44:44 CST 2021
  */
public class Sintactico extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Sintactico() {super();}

  /** Constructor which sets the default scanner. */
  public Sintactico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintactico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\036\000\002\002\004\000\002\002\003\000\002\006" +
    "\005\000\002\006\004\000\002\007\003\000\002\007\003" +
    "\000\002\007\003\000\002\013\006\000\002\014\005\000" +
    "\002\014\003\000\002\014\002\000\002\011\005\000\002" +
    "\010\004\000\002\012\003\000\002\012\003\000\002\012" +
    "\003\000\002\003\005\000\002\003\005\000\002\003\005" +
    "\000\002\003\005\000\002\003\003\000\002\005\005\000" +
    "\002\005\005\000\002\005\006\000\002\005\006\000\002" +
    "\005\003\000\002\004\003\000\002\004\003\000\002\004" +
    "\003\000\002\004\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\046\000\012\030\015\031\016\032\005\036\014\001" +
    "\002\000\014\002\000\030\015\031\016\032\005\036\014" +
    "\001\002\000\004\036\ufff3\001\002\000\004\016\ufffd\001" +
    "\002\000\004\002\046\001\002\000\004\016\045\001\002" +
    "\000\004\016\ufffc\001\002\000\004\036\044\001\002\000" +
    "\004\016\ufffb\001\002\000\006\010\020\014\017\001\002" +
    "\000\004\036\ufff4\001\002\000\004\036\ufff2\001\002\000" +
    "\012\033\023\034\021\035\022\036\024\001\002\000\016" +
    "\011\ufff7\021\ufff7\033\023\034\021\035\022\036\024\001" +
    "\002\000\020\004\uffe5\005\uffe5\006\uffe5\007\uffe5\011\uffe5" +
    "\016\uffe5\021\uffe5\001\002\000\020\004\uffe7\005\uffe7\006" +
    "\uffe7\007\uffe7\011\uffe7\016\uffe7\021\uffe7\001\002\000\020" +
    "\004\uffe6\005\uffe6\006\uffe6\007\uffe6\011\uffe6\016\uffe6\021" +
    "\uffe6\001\002\000\020\004\uffe4\005\uffe4\006\uffe4\007\uffe4" +
    "\011\uffe4\016\uffe4\021\uffe4\001\002\000\020\004\uffed\005" +
    "\uffed\006\uffed\007\uffed\011\uffed\016\uffed\021\uffed\001\002" +
    "\000\016\004\034\005\035\006\036\007\033\011\ufff8\021" +
    "\ufff8\001\002\000\006\011\030\021\031\001\002\000\004" +
    "\016\ufffa\001\002\000\012\033\023\034\021\035\022\036" +
    "\024\001\002\000\016\004\034\005\035\006\036\007\033" +
    "\011\ufff9\021\ufff9\001\002\000\012\033\023\034\021\035" +
    "\022\036\024\001\002\000\012\033\023\034\021\035\022" +
    "\036\024\001\002\000\012\033\023\034\021\035\022\036" +
    "\024\001\002\000\012\033\023\034\021\035\022\036\024" +
    "\001\002\000\020\004\uffef\005\uffef\006\uffef\007\uffef\011" +
    "\uffef\016\uffef\021\uffef\001\002\000\020\004\ufff0\005\ufff0" +
    "\006\036\007\033\011\ufff0\016\ufff0\021\ufff0\001\002\000" +
    "\020\004\ufff1\005\ufff1\006\036\007\033\011\ufff1\016\ufff1" +
    "\021\ufff1\001\002\000\020\004\uffee\005\uffee\006\uffee\007" +
    "\uffee\011\uffee\016\uffee\021\uffee\001\002\000\014\004\034" +
    "\005\035\006\036\007\033\016\ufff6\001\002\000\004\016" +
    "\ufff5\001\002\000\014\002\ufffe\030\ufffe\031\ufffe\032\ufffe" +
    "\036\ufffe\001\002\000\004\002\001\001\002\000\004\016" +
    "\050\001\002\000\014\002\uffff\030\uffff\031\uffff\032\uffff" +
    "\036\uffff\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\046\000\020\002\006\006\003\007\007\010\005\011" +
    "\010\012\011\013\012\001\001\000\014\007\046\010\005" +
    "\011\010\012\011\013\012\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\003\042" +
    "\004\024\001\001\000\010\003\025\004\024\014\026\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\003\031\004\024" +
    "\001\001\000\002\001\001\000\006\003\041\004\024\001" +
    "\001\000\006\003\040\004\024\001\001\000\006\003\037" +
    "\004\024\001\001\000\006\003\036\004\024\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintactico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintactico$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintactico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    /**
     * Método al que se llama automáticamente ante algún error sintactico.
     **/ 
    public void syntax_error(Symbol s){ 
        System.out.println("Error Sintáctico en la Línea " + (s.left) +
        " Columna "+s.right+ ". No se esperaba este componente: " +s.value+"."); 
        
    } 

    /**
     * Método al que se llama automáticamente ante algún error sintáctico 
     * en el que ya no es posible una recuperación de errores.
     **/ 
    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{ 
        System.out.println("Error síntactico irrecuperable en la Línea " + 
        (s.left)+ " Columna "+s.right+". Componente " + s.value + 
        " no reconocido."); 
    }  

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Sintactico$actions {
  private final Sintactico parser;

  /** Constructor */
  CUP$Sintactico$actions(Sintactico parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Sintactico$do_action(
    int                        CUP$Sintactico$act_num,
    java_cup.runtime.lr_parser CUP$Sintactico$parser,
    java.util.Stack            CUP$Sintactico$stack,
    int                        CUP$Sintactico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintactico$result;

      /* select the action based on the action number */
      switch (CUP$Sintactico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // VALOR ::= identificador 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("VALOR",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // VALOR ::= decimal 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("VALOR",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // VALOR ::= entero 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("VALOR",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // VALOR ::= cadena 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("VALOR",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // CONDICION ::= VALOR 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("CONDICION",3, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // CONDICION ::= EXPRESION not igual EXPRESION 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("CONDICION",3, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // CONDICION ::= EXPRESION igual igual EXPRESION 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("CONDICION",3, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // CONDICION ::= EXPRESION menor EXPRESION 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("CONDICION",3, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // CONDICION ::= EXPRESION mayor EXPRESION 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("CONDICION",3, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // EXPRESION ::= VALOR 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("EXPRESION",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // EXPRESION ::= EXPRESION por EXPRESION 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("EXPRESION",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // EXPRESION ::= EXPRESION div EXPRESION 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("EXPRESION",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // EXPRESION ::= EXPRESION menos EXPRESION 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("EXPRESION",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // EXPRESION ::= EXPRESION mas EXPRESION 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("EXPRESION",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // TIPODATO ::= pr_boolean 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("TIPODATO",8, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // TIPODATO ::= pr_string 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("TIPODATO",8, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // TIPODATO ::= pr_number 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("TIPODATO",8, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // DECLARACION ::= TIPODATO identificador 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("DECLARACION",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // ASIGNACION ::= identificador igual EXPRESION 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("ASIGNACION",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // LISTAPARAMS ::= 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("LISTAPARAMS",10, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // LISTAPARAMS ::= EXPRESION 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("LISTAPARAMS",10, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // LISTAPARAMS ::= LISTAPARAMS coma EXPRESION 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("LISTAPARAMS",10, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // LLAMADAMF ::= identificador par1 LISTAPARAMS par2 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("LLAMADAMF",9, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // SENTENCIA ::= LLAMADAMF 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("SENTENCIA",5, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // SENTENCIA ::= ASIGNACION 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("SENTENCIA",5, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // SENTENCIA ::= DECLARACION 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("SENTENCIA",5, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // SENTENCIAS ::= SENTENCIA puntoycoma 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("SENTENCIAS",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // SENTENCIAS ::= SENTENCIAS SENTENCIA puntoycoma 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("SENTENCIAS",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= SENTENCIAS 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		RESULT = start_val;
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintactico$parser.done_parsing();
          return CUP$Sintactico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

