\# Actividad Semana 06 - Herencia y super



\*\*Estudiante:\*\* Kevin Arboleda  

\*\*Programa:\*\* Ingeniería de Sistemas  

\*\*Periodo:\*\* 2026-B  



\## Descripción



En esta actividad se implementó una jerarquía de clases utilizando herencia en Java.



La clase principal es `Empleado` y de ella heredan las clases `Gerente` y `Desarrollador`.



\## Jerarquía de clases



Empleado

├── Gerente

└── Desarrollador



\## Justificación de la relación "es-un"



La herencia utilizada cumple con la relación "es-un":



\- Un `Gerente` es un `Empleado`, porque posee los datos y comportamientos generales de un empleado, pero agrega un bono.

\- Un `Desarrollador` es un `Empleado`, porque posee los datos y comportamientos generales de un empleado, pero agrega el lenguaje de programación que utiliza.



Por esta razón, ambas clases pueden heredar de `Empleado`.



\## Uso de super



En los constructores de `Gerente` y `Desarrollador` se utiliza `super(...)` para llamar al constructor de la clase `Empleado` e inicializar `nombre` y `salarioBase`.



También se utiliza `super.ficha()` en las clases hijas para reutilizar la información generada por el método `ficha()` de `Empleado` y agregar la información específica de cada clase.



\## Salario total



El método `salarioTotal()` funciona de la siguiente manera:



\- Para `Gerente`, el salario total corresponde al salario base más el bono.

\- Para `Desarrollador`, el salario total corresponde al salario base.



\## Traza de construcción



Al crear un objeto `Gerente`, la salida muestra:



Constructor Empleado

Constructor Gerente



Esto demuestra que primero se ejecuta el constructor de la clase padre y después el constructor de la clase hija.



Al crear un objeto `Desarrollador`, la salida muestra:



Constructor Empleado

Constructor Desarrollador



Nuevamente se observa que primero se construye la parte correspondiente a `Empleado` y luego la parte correspondiente a `Desarrollador`.



\## Resultado de ejecución



===== CREANDO GERENTE =====

Constructor Empleado

Constructor Gerente



===== DATOS DEL GERENTE =====

Nombre: Carlos, Salario base: $3000000.0, Bono: $500000.0

Salario total: $3500000.0



===== CREANDO DESARROLLADOR =====

Constructor Empleado

Constructor Desarrollador



===== DATOS DEL DESARROLLADOR =====

Nombre: Ana, Salario base: $2500000.0, Lenguaje: Java

Salario total: $2500000.0

