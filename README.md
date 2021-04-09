# laboratorio-olc1
Interprete de ejemplo. Laboratorio OLC1 1s 2021

## Características 

### Tipado 
Este lenguaje es de tipado fuerte, es decir, se debe especificar el tipo de dato de una variable y este no puede cambiar en tiempo de ejecución. 

### Case 
Este lenguaje es case insensitive, es decir, no hace distinciones entre mayúsculas y minúsculas. 

### Finalización de Sentencias 
El caracter de finalización de sentencias es el punto y coma.

### Encapsulamiento de Sentencias 
Para encapsular sentencias dadas por los ciclos, métodos, funciones, etc, se utilizarán las llaves.

### Tipos de datos 
Los Tipos de datos primitivos soportados por el lenguaje son los siguientes: 

|Nombre   |Uso   |Valor por Defecto   |
|---      |---      |---              |
|Entero   |int      |0                |
|Decimal  |double   |0.0              |
|Booleano |boolean  |false            |
|Cadena   |string   |""               |
## Sentencias 

#### Declaraciones
Una variable debe de ser declarada antes de ser utilizada. Todas las variables tendrán un tipo de dato que se mantiene a lo largo de la ejecución.
Las variables podrán ser declaradas global y localmente.

##### Sintáxis
  < TIPO > identificador; 
  
#### Asignaciones 
Una variable puede cambiar su valor a lo largo de la ejecución, para esto se utilizan las asignaciones. Se puede asignar cualquier tipo de expresión siempre y cuando los 
tipos de datos sean compatibles.

##### Sintáxis
  identificador = < EXPRESION >;

#### Operaciones
El lenguaje provee un soporte para las siguientes operaciones: 
#### Aritmeticas
 Son operaciones entre valores cuantitativos. Cuentan con dos operadores y un signo que identifica la operación a realizar. Las operaciones soportadas son las siguientes. 
 
 - Suma 
 - Resta 
 - Multiplicación 
 - División
 
 ##### Sintáxis
 < EXPRESION > < SIGNO > < EXPRESION >
 
##### Relacionales
Son operaciones que se utilizan para comparar dos valores. Si el resultado de la comparación es correcto la expresión considerada es verdadera, en caso contrario es falsa. 

Las operaciones soportadas son las siguientes: 
- Igual
- Diferente
- Mayor
- Menor

#### Sentencias de control
Estas sentencias modifican el flujo del programa de acuerdo a ciertos criterios a evaluar. 
#### If else


Función de imprimir
Ciclos
For 
while
 Metodos (parametros)
Llamada a método 
**clases

## Diagrama de clases 
![image](https://github.com/devemg/laboratorio-olc1/blob/master/images/clases.png)
