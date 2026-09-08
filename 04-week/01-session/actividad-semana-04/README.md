\# Actividad Semana 04 - Clase con constructores, toString e igualdad



\## Estudiante



Nombre: Kevin Arboleda



Programa: Ingeniería de Sistemas



Periodo: 2026-B



\## 1. Clase Producto



Se creó la clase `Producto` con los atributos privados:



\- `codigo`

\- `nombre`

\- `precio`

\- `stock`



El atributo `codigo` es `final`, por lo que solamente se asigna al crear el producto y no puede modificarse posteriormente.



\## 2. Constructores



Se implementaron dos constructores:



\- Un constructor completo que recibe codigo, nombre, precio y stock.

\- Un constructor que recibe solamente codigo y nombre.



El segundo constructor utiliza `this()` para delegar al constructor completo, estableciendo precio y stock en 0.



También se validan los valores de precio y stock para evitar valores negativos.



\## 3. toString()



Se sobrescribió el método `toString()` utilizando `@Override`.



Esto permite mostrar de forma clara la información de cada producto.



\## 4. equals() y hashCode()



Se sobrescribieron los métodos `equals()` y `hashCode()` utilizando el atributo `codigo`.



Dos productos con el mismo código son considerados iguales.



\## 5. Prueba con HashSet



Se agregaron tres productos a un `HashSet`.



Dos de ellos tienen el mismo código:



\- Producto 1: código 1001.

\- Producto 3: código 1001.



La comparación mediante `equals()` devuelve `true`.



El `HashSet` solamente contiene 2 productos, demostrando que no duplica productos que tienen el mismo código.



\## Conclusión



La actividad permitió practicar constructores, encapsulamiento, el uso de `final`, `this()`, validaciones, `toString()`, `equals()`, `hashCode()` y el uso de `HashSet` en Java.

