\# Actividad Semana 09 - Diseño con composición y paquetes



\*\*Estudiante:\*\* Kevin Arboleda  

\*\*Programa:\*\* Ingeniería de Sistemas  

\*\*Periodo:\*\* 2026-B  



\## Descripción



En esta actividad se desarrolló un programa en Java aplicando composición, delegación y organización por paquetes.



El programa representa un pedido que contiene varios productos y utiliza un servicio independiente para aplicar un descuento y calcular el total final.



\## Estructura del proyecto



actividad-semana-09/

├── modelo/

│   ├── Producto.java

│   └── Pedido.java

├── servicio/

│   └── PedidoService.java

├── app/

│   └── Main.java

└── README.md



\## Paquete modelo



El paquete `modelo` contiene las clases que representan los datos principales del programa.



\### Producto



La clase `Producto` contiene:



\- Nombre del producto.

\- Precio del producto.



También proporciona el método `getPrecio()`, que permite obtener el precio cuando el pedido necesita calcular su total.



\### Pedido



La clase `Pedido` contiene una lista de objetos `Producto`.



Tiene los métodos:



\- `agregar(Producto)`: permite agregar productos al pedido.

\- `total()`: recorre los productos y suma sus precios.

\- `getProductos()`: permite obtener la lista de productos.



\## Composición



Se utilizó composición porque un `Pedido` tiene productos.



La relación se puede expresar como:



`Pedido tiene Productos`



No se utilizó herencia porque un pedido no es un producto y un producto tampoco es un pedido.



Por lo tanto, no tendría sentido utilizar una relación "es-un".



La composición representa mejor la relación entre estas clases.



\## Delegación



El método `total()` de `Pedido` recorre la lista de productos y solicita a cada objeto su precio mediante:



`producto.getPrecio()`



De esta manera, cada `Producto` es responsable de proporcionar su propio precio y `Pedido` utiliza esos valores para calcular el total.



\## Paquete servicio



El paquete `servicio` contiene la clase `PedidoService`.



Esta clase representa la lógica de negocio y se encarga de:



\- Calcular el descuento.

\- Calcular el total final del pedido.



El descuento utilizado en el ejemplo es del 10%.



\## Paquete app



El paquete `app` contiene la clase `Main`.



En `Main` se crean tres productos:



\- Laptop

\- Mouse

\- Teclado



Después se agregan al pedido y se utiliza `PedidoService` para calcular el descuento y el total final.



\## Separación de responsabilidades



El programa divide las responsabilidades de la siguiente manera:



\- `modelo`: contiene los datos y comportamiento propio del pedido y los productos.

\- `servicio`: contiene la lógica relacionada con el descuento y el total final.

\- `app`: ejecuta y prueba el funcionamiento del programa.



\## Alta cohesión



Se logra alta cohesión porque cada clase y paquete se concentra en una responsabilidad específica.



Por ejemplo, `Producto` administra la información del producto, `Pedido` administra los productos que contiene y `PedidoService` se encarga de la lógica del descuento.



\## Bajo acoplamiento



Se busca un bajo acoplamiento separando la lógica del descuento de las clases del modelo.



`Pedido` no necesita conocer cómo se calcula un descuento.



Esa responsabilidad pertenece a `PedidoService`, lo que permite modificar la lógica de descuento sin tener que cambiar la estructura principal de `Pedido`.



\## Conclusión



Esta actividad permitió aplicar composición y delegación para representar correctamente la relación entre un pedido y sus productos.



También se organizaron las clases en los paquetes `modelo`, `servicio` y `app`, separando las responsabilidades y favoreciendo una mayor cohesión y un menor acoplamiento.

