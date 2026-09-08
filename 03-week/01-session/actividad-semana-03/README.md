\# Actividad Semana 03 - Clase encapsulada que protege su invariante



\## Estudiante



Nombre: Kevin Arboleda



Programa: Ingeniería de Sistemas



Periodo: 2026-B



\## 1. Clase CuentaBancaria



Se creó la clase `CuentaBancaria` con los atributos privados `id` y `saldo`.



El atributo `id` es `final`, por lo que solamente se asigna al crear la cuenta y no puede modificarse posteriormente. Se utiliza únicamente el método `getId()` para consultarlo.



El atributo `saldo` es privado para evitar que pueda modificarse directamente desde otras clases.



\## 2. Operaciones de dominio



Se implementaron las siguientes operaciones:



\- `consignar(double monto)`

\- `retirar(double monto)`

\- `getSaldo()`

\- `getId()`



El método `consignar()` solamente permite montos mayores que cero.



El método `retirar()` solamente permite retirar un monto mayor que cero y menor o igual al saldo disponible.



\## 3. Protección de la invariante



La invariante de la clase es:



`saldo >= 0`



Las validaciones de `consignar()` y `retirar()` protegen esta condición.



Se probaron operaciones válidas e inválidas:



\- Consignación positiva.

\- Consignación negativa.

\- Retiro válido.

\- Retiro mayor al saldo.

\- Retiro negativo.



Los retiros inválidos no modifican el saldo, por lo que el saldo nunca queda negativo.



\## 4. ¿Por qué no existe setSaldo()?



No se creó un método `setSaldo()` porque permitiría modificar directamente el saldo desde fuera de la clase.



Un método `setSaldo()` podría permitir asignar un valor negativo y romper la invariante `saldo >= 0`.



En cambio, se utilizan operaciones de dominio como `consignar()` y `retirar()`, que validan los valores antes de modificar el saldo.



Esto permite proteger el estado interno de la cuenta mediante encapsulación.



\## Conclusión



La actividad permitió practicar la encapsulación en Java, el uso de atributos privados, el atributo `final`, las validaciones en métodos de dominio y la protección de una invariante.

