\# Actividad Semana 07 - Polimorfismo en acción



\*\*Estudiante:\*\* Kevin Arboleda  

\*\*Programa:\*\* Ingeniería de Sistemas  

\*\*Periodo:\*\* 2026-B  



\## Descripción



En esta actividad se implementó una jerarquía de clases para demostrar el uso del polimorfismo en Java.



Se creó la superclase abstracta `Figura` y las siguientes subclases:



\- `Circulo`

\- `Rectangulo`

\- `Triangulo`

\- `Cuadrado`



Cada subclase implementa sus propios métodos `area()` y `nombre()` utilizando `@Override`.



\## Jerarquía de clases



Figura

├── Circulo

├── Rectangulo

├── Triangulo

└── Cuadrado



\## Polimorfismo



Se creó un arreglo de tipo `Figura\[]` que contiene objetos de diferentes subclases:



\- Un círculo.

\- Un rectángulo.

\- Un triángulo.

\- Un cuadrado.



Todas las figuras son procesadas mediante un único bucle.



Aunque la variable utilizada en el bucle es de tipo `Figura`, Java ejecuta automáticamente el método `area()` correspondiente al tipo real de cada objeto.



Esto demuestra el enlace dinámico y el polimorfismo.



\## Uso de @Override



Las clases `Circulo`, `Rectangulo`, `Triangulo` y `Cuadrado` sobrescriben los métodos:



\- `area()`

\- `nombre()`



Para indicar que estos métodos sobrescriben los definidos en la superclase se utiliza la anotación `@Override`.



\## instanceof y downcasting



La clase `Circulo` posee un método propio llamado `diametro()`.



Como el arreglo es de tipo `Figura\[]`, antes de utilizar este método se comprueba si el objeto es realmente un `Circulo` mediante:



`figura instanceof Circulo`



Después se realiza el downcasting:



`Circulo circulo = (Circulo) figura;`



De esta manera se puede ejecutar `diametro()` de forma segura.



\## Extensibilidad



Inicialmente se tienen las figuras `Circulo`, `Rectangulo` y `Triangulo`.



Posteriormente se agregó una cuarta figura llamada `Cuadrado`.



El bucle utilizado para procesar las figuras no necesitó ser modificado.



Esto demuestra que el diseño permite agregar nuevas figuras sin cambiar el funcionamiento general del recorrido.



\## Conclusión



La actividad permitió aplicar polimorfismo, herencia, sobrescritura de métodos con `@Override`, enlace dinámico, `instanceof` y downcasting.



También se comprobó que una nueva subclase puede integrarse al arreglo de figuras y funcionar con el mismo bucle polimórfico.

