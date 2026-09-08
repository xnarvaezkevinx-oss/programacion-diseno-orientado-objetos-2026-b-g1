\# Actividad Semana 05 - Cuenta Bancaria



\## Descripción



En esta actividad se implementó una clase `CuentaBancaria` aplicando los conceptos de Programación Orientada a Objetos vistos durante el Corte 1.



La clase permite crear cuentas bancarias, realizar consignaciones y retiros, manteniendo siempre la integridad del saldo.



\## Invariante



La invariante principal de la clase es:



> El saldo de una cuenta bancaria nunca puede ser negativo.



Para proteger esta invariante, el atributo `saldo` se mantiene privado y no existe un setter que permita modificarlo directamente.



Las modificaciones del saldo solamente se realizan mediante los métodos:



\- `consignar()`

\- `retirar()`



Ambos métodos validan que las operaciones sean válidas antes de modificar el saldo.



\## Atributo de identidad



El atributo `id` identifica de manera única a la cuenta.



Se declaró como:



```java

private final int id;

