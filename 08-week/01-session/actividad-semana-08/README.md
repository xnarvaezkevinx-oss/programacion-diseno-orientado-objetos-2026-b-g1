\# Actividad Semana 08 - Abstracción con clases abstractas e interfaces



\*\*Estudiante:\*\* Kevin Arboleda  

\*\*Programa:\*\* Ingeniería de Sistemas  

\*\*Periodo:\*\* 2026-B  



\## Descripción



En esta actividad se trabajó con abstracción, clases abstractas, interfaces y polimorfismo en Java.



Se creó la clase abstracta `Figura`, la interfaz `Dibujable` y las clases:



\- `Circulo`

\- `Rectangulo`

\- `Triangulo`



Las tres figuras heredan de `Figura` e implementan la interfaz `Dibujable`.



\## Clase abstracta Figura



La clase `Figura` fue declarada como abstracta.



Contiene el método abstracto:



`area()`



Cada subclase debe implementar este método de acuerdo con la fórmula correspondiente a su figura.



También contiene el método concreto:



`describir()`



Este método utiliza `area()` para mostrar el área de la figura.



\## Interfaz Dibujable



Se creó la interfaz `Dibujable` con el método:



`dibujar()`



Las clases `Circulo`, `Rectangulo` y `Triangulo` implementan esta interfaz y proporcionan su propia implementación del método `dibujar()`.



\## Clase abstracta vs interfaz



Una clase abstracta permite definir características comunes entre varias clases y puede contener tanto métodos abstractos como métodos concretos.



Una interfaz representa una capacidad que una clase puede implementar.



En esta actividad, `Figura` representa lo que las figuras tienen en común, mientras que `Dibujable` representa la capacidad de ser dibujadas.



\## Polimorfismo por superclase



Se creó un arreglo:



`Figura\[]`



Este arreglo contiene objetos de tipo `Circulo`, `Rectangulo` y `Triangulo`.



Mediante un único recorrido se llama al método `describir()` de cada figura.



Aunque los objetos son tratados como `Figura`, cada uno utiliza su propia implementación de `area()`.



\## Polimorfismo por interfaz



También se creó un arreglo:



`Dibujable\[]`



Este arreglo contiene objetos de las tres figuras.



Mediante un recorrido se llama al método `dibujar()` de cada objeto.



Esto demuestra que diferentes clases pueden ser tratadas de manera uniforme mediante una interfaz.



\## ¿Por qué no se puede hacer new Figura()?



No es posible escribir:



`Figura figura = new Figura();`



porque `Figura` es una clase abstracta.



Las clases abstractas sirven como base para otras clases y no pueden ser instanciadas directamente.



Por esta razón, en `Main.java` esta instrucción se dejó comentada para demostrar que produciría un error de compilación.



\## Conclusión



La actividad permitió diferenciar una clase abstracta de una interfaz y utilizar ambas dentro del mismo programa.



También se aplicó polimorfismo por superclase mediante `Figura\[]` y polimorfismo por interfaz mediante `Dibujable\[]`.

