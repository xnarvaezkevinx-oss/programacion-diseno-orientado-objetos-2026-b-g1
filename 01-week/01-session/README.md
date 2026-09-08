\# Actividad Semana 01

\## Programación y Diseño Orientado a Objetos



\*\*Estudiante:\*\* Kevin Arboleda Narváez

\*\*Programa:\*\* Ingeniería de Sistemas

\*\*Periodo:\*\* 2026-B



\---



\## Parte A — Entorno y ejecución



Se verificó la instalación del JDK mediante los comandos:



java -version



javac -version



También se creó el programa HolaMundo.java, el cual fue compilado

y ejecutado desde la terminal.



Comandos utilizados:



javac HolaMundo.java



java HolaMundo



Resultado:



Hola Mundo



\---



\## Parte B — Primer objeto



Se creó la clase Estudiante con los siguientes atributos:



\- nombre

\- programa

\- semestre



También se creó el método presentarse(), encargado de mostrar

la información del estudiante.



\### Primer objeto



Nombre: Kevin



Programa: Ingeniería de Sistemas



Semestre: 2





\### Segundo objeto



Nombre: Carlos



Programa: Ingeniería de Sistemas



Semestre: 3



Los dos objetos pertenecen a la misma clase Estudiante, pero cada

uno tiene su propio estado.



\### Compilación



javac Estudiante.java Main.java



\### Ejecución



java Main



\### Resultado esperado



Hola, mi nombre es Kevin, estudio Ingeniería de Sistemas y estoy

en el semestre 2.



Hola, mi nombre es Carlos, estudio Ingeniería de Sistemas y estoy

en el semestre 3.



\---



\## Parte C — Modelado



\### Dominio seleccionado: Tienda



Para el ejercicio de modelado se seleccionó como dominio real

una tienda.



Se identificaron las siguientes tres clases:



1\. Producto

2\. Cliente

3\. Venta



\---



\### Clase Producto



\#### Atributos



\- nombre

\- precio

\- cantidad



\#### Métodos



\- mostrarInformacion()

\- actualizarCantidad()



\#### Abstracción



Se seleccionaron únicamente los datos necesarios para manejar un

producto dentro de una tienda.



Se dejaron fuera características como el color del empaque,

el diseño de la etiqueta, el peso y otros datos que no son

necesarios para el funcionamiento básico del sistema.



\---



\### Clase Cliente



\#### Atributos



\- nombre

\- documento

\- telefono



\#### Métodos



\- registrarCliente()

\- mostrarInformacion()



\#### Abstracción



Se seleccionaron los datos necesarios para identificar y

contactar al cliente.



Se dejaron fuera otros datos personales que no son necesarios

para el funcionamiento básico de la tienda.



\---



\### Clase Venta



\#### Atributos



\- numeroVenta

\- producto

\- cantidad

\- total



\#### Métodos



\- calcularTotal()

\- mostrarVenta()



\#### Abstracción



Se seleccionó la información necesaria para registrar una venta.



Se dejaron fuera elementos que no intervienen directamente en el

proceso de registro de una venta.



\---



\## Conclusión



En esta actividad se verificó la instalación del JDK y se practicó

la compilación y ejecución de programas Java desde la terminal.



También se creó una primera clase llamada Estudiante,

identificando sus atributos y comportamiento mediante el método

presentarse().



Se crearon dos objetos de la clase Estudiante, demostrando que

aunque pertenecen a una misma clase, cada objeto puede tener un

estado diferente.



Finalmente, se realizó un ejercicio de modelado utilizando el

dominio de una tienda. Se identificaron las clases Producto,

Cliente y Venta, junto con sus respectivos atributos, métodos y

la explicación de la abstracción realizada en cada clase.

