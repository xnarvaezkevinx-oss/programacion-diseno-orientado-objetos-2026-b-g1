\# Actividad Semana 02 - Clases, objetos y modelo de referencias



\## Estudiante



Nombre: Kevin Arboleda



Programa: Ingeniería de Sistemas



Periodo: 2026-B



\## 1. Clase Libro



Se creó la clase `Libro` con los siguientes atributos:



\- `titulo`

\- `autor`

\- `paginas`



También se crearon los métodos:



\- `describir()`

\- `esLargo()`



El método `describir()` imprime los datos del libro.



El método `esLargo()` devuelve `true` cuando el número de páginas es mayor que 300.



En el constructor se utilizó `this` para hacer referencia a los atributos del objeto actual.



\## 2. Tres objetos con estado independiente



En la clase `Main` se crearon tres objetos de la clase `Libro`:



\- Cien años de soledad

\- El principito

\- Don Quijote de la Mancha



Cada objeto tiene su propio título, autor y cantidad de páginas.



Esto demuestra que los objetos de una misma clase pueden tener estados diferentes e independientes.



\## 3. Aliasing de referencias



Se realizó la siguiente asignación:



`Libro otro = libro1;`



En este caso, `otro` y `libro1` hacen referencia al mismo objeto.



Por esta razón, cuando se modifica el título utilizando la referencia `otro`, el cambio también se observa mediante `libro1`.



Se comprobó realizando el siguiente cambio:



`otro.titulo = "Cien años de soledad - Edición modificada";`



Después del cambio, tanto `otro` como `libro1` muestran el nuevo título.



\## 4. Manejo de null



Se creó una referencia con valor `null`:



`Libro libroNull = null;`



Al intentar acceder directamente al atributo:



`libroNull.titulo`



se produjo un `NullPointerException`, porque la referencia no apunta a ningún objeto.



Después se previno el error utilizando:



`if (libroNull != null)`



De esta forma se verifica primero si la referencia apunta a un objeto antes de acceder a sus atributos.



\## Conclusión



La actividad permitió practicar la creación de clases y objetos en Java, el uso de `this`, el estado independiente de diferentes objetos, el aliasing de referencias y el manejo de referencias `null`.

