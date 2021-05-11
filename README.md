# laboratorio-olc1
Interprete de ejemplo. Laboratorio OLC1 1s 2021

# Ramas del Repósitorio 
- master: Contiene la implementación completa
- interfaz-grafica: Contiene solamente la interfaz gráfica en java
- gramatica: Contiene la implementación de la gramática. 
- ast: Contiene los avances de la construcción y ejecución del AST construído.

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
|Entero o Decimal   |number      |0                |
|Booleano |boolean  |false            |
|Cadena   |string   |""               |
## Sentencias 

#### Declaraciones
Una variable debe de ser declarada antes de ser utilizada. Todas las variables tendrán un tipo de dato que se mantiene a lo largo de la ejecución.
Las variables podrán ser declaradas global y localmente.

##### Sintáxis
```
  < TIPO > < identificador > ; 
  ```
#### Asignaciones 
Una variable puede cambiar su valor a lo largo de la ejecución, para esto se utilizan las asignaciones. Se puede asignar cualquier tipo de expresión siempre y cuando los 
tipos de datos sean compatibles.

##### Sintáxis
  ```
  < identificador > = < EXPRESION >;
  ```

#### Operaciones
El lenguaje provee un soporte para las siguientes operaciones: 
#### Aritmeticas
 Son operaciones entre valores cuantitativos. Cuentan con dos operadores y un signo que identifica la operación a realizar. 
 
 Las operaciones soportadas son las siguientes. 
 
 - Suma 
 - Resta 
 - Multiplicación 
 - División
  ##### Sintáxis
 ``` 
 < EXPRESION > < SIGNO > < EXPRESION >
 ```
 
##### Relacionales
Son operaciones que se utilizan para comparar dos valores. Si el resultado de la comparación es correcto la expresión considerada es verdadera, en caso contrario es falsa. 
 
Las operaciones soportadas son las siguientes: 
- Igual
- Diferente
- Mayor
- Menor
 ##### Sintáxis
``` 
< EXPRESION > < SIGNO > < EXPRESION >
```
 
#### Sentencias de control
Estas sentencias modifican el flujo del programa de acuerdo a ciertos criterios a evaluar. 
##### If else
  Evalúa una expresión y modifica el flujo con base en si se cumple o no la condición.
   ##### Sintáxis
   ```
  if ( <CONDICION>) {
    // lista de sentencias
  }
  
  if ( <CONDICION>) {
    // lista de sentencias
  } else {
    // lista de sentencias  
  }
  ```
  
#### Funciones Nativas
Son funciones y métodos que el lenguaje provee para facilitar el desarrollo.

##### Función de imprimir
Muestra en consola el valor de una lista de expresiones.
``` 
print ( < LISTA_EXPRESIONES > );
```

#### Ciclos
Son sentencias que ejecutan un bloque de sentencias de forma ciclica hasta que se cumpla una condición.
##### For 
 Sentencia que ejecuta el bloque de sentencias con respecto a una variable inicializada y aumentada en la misma sentencias. 
 Solo se pueden utilizar variables ya declaradas. 
 El incremento es de uso exclusivo para el for. 
 
 ```
 for( < ASIGNACION > ; < CONDICION > ; < INCREMENTO > ){
 
 }
 
 INCREMENTO -> < identificador > ++
 
 ```
##### while
 Sentencia que ejecuta el bloque de sentencias si y solo si la condición evaluada es verdadera. 
```
while (< CONDICION > ){
}
```

#### Metodos
Un método es una subrutina de código que se identifica con un nombre. No retorna ningún valor ni recibe nigun parámetro.
```
func < identificador > (){
// lista de sentencias
}
```


##### Llamada a método 
Es la sentencia que invoca la ejecución de una función. Por medio de esta se asignan valores a los parámetros si es que los hay.
```
< identificador > ( < LISTA_EXPRESIONES > );
```

## Diagrama de clases 
![image](https://github.com/devemg/laboratorio-olc1/blob/master/images/clases.png)
