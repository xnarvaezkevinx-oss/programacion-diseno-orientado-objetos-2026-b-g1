import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        System.out.println("===== CUENTAS BANCARIAS =====");

        // Constructor completo
        CuentaBancaria cuenta1 = new CuentaBancaria(1001, 100000);

        // Constructor reducido usando this()
        CuentaBancaria cuenta2 = new CuentaBancaria(1002);

        // Otra cuenta con el mismo ID
        CuentaBancaria cuenta3 = new CuentaBancaria(1001, 500000);

        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println(cuenta3);

        // Operaciones válidas
        System.out.println();
        System.out.println("===== OPERACIONES VÁLIDAS =====");

        boolean consignacion = cuenta1.consignar(50000);
        System.out.println("Consignación de $50000: " + consignacion);
        System.out.println("Saldo: $" + cuenta1.getSaldo());

        boolean retiro = cuenta1.retirar(30000);
        System.out.println("Retiro de $30000: " + retiro);
        System.out.println("Saldo: $" + cuenta1.getSaldo());

        // Caso límite: retirar exactamente todo el saldo
        System.out.println();
        System.out.println("===== CASO LÍMITE =====");

        boolean retiroTotal = cuenta1.retirar(cuenta1.getSaldo());
        System.out.println("Retiro de todo el saldo: " + retiroTotal);
        System.out.println("Saldo después del retiro: $" + cuenta1.getSaldo());

        // Operaciones inválidas
        System.out.println();
        System.out.println("===== OPERACIONES INVÁLIDAS =====");

        boolean consignacionInvalida = cuenta1.consignar(-10000);
        System.out.println("Consignación negativa: " + consignacionInvalida);
        System.out.println("Saldo: $" + cuenta1.getSaldo());

        boolean retiroNegativo = cuenta1.retirar(-5000);
        System.out.println("Retiro negativo: " + retiroNegativo);
        System.out.println("Saldo: $" + cuenta1.getSaldo());

        boolean retiroMayor = cuenta1.retirar(1);
        System.out.println("Retiro mayor al saldo disponible: " + retiroMayor);
        System.out.println("Saldo: $" + cuenta1.getSaldo());

        // Verificación de la invariante
        System.out.println();
        System.out.println("===== VERIFICACIÓN DE LA INVARIANTE =====");

        if (cuenta1.getSaldo() >= 0) {
            System.out.println("La invariante se mantiene: el saldo nunca es negativo.");
        } else {
            System.out.println("ERROR: la invariante fue violada.");
        }

        // Comparación mediante equals
        System.out.println();
        System.out.println("===== EQUALS =====");

        System.out.println("¿cuenta1 y cuenta3 son iguales?");
        System.out.println(cuenta1.equals(cuenta3));

        // Prueba con HashSet
        System.out.println();
        System.out.println("===== HASHSET =====");

        HashSet<CuentaBancaria> cuentas = new HashSet<>();

        cuentas.add(cuenta1);
        cuentas.add(cuenta2);
        cuentas.add(cuenta3);

        System.out.println("Cantidad de cuentas en el HashSet: " + cuentas.size());

        for (CuentaBancaria cuenta : cuentas) {
            System.out.println(cuenta);
        }

        if (cuentas.size() == 2) {
            System.out.println("HashSet no duplicó las cuentas con el mismo ID.");
        }
    }
}