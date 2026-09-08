public class Main {
    public static void main(String[] args) {

        // Crear una cuenta con saldo inicial
        CuentaBancaria cuenta = new CuentaBancaria(1001, 100000);

        System.out.println("===== CUENTA BANCARIA =====");
        System.out.println("ID de la cuenta: " + cuenta.getId());
        System.out.println("Saldo inicial: $" + cuenta.getSaldo());

        // Consignación válida
        System.out.println();
        System.out.println("===== CONSIGNACIÓN VÁLIDA =====");
        cuenta.consignar(50000);
        System.out.println("Saldo actual: $" + cuenta.getSaldo());

        // Consignación inválida
        System.out.println();
        System.out.println("===== CONSIGNACIÓN INVÁLIDA =====");
        cuenta.consignar(-20000);
        System.out.println("Saldo después de consignación inválida: $" + cuenta.getSaldo());

        // Retiro válido
        System.out.println();
        System.out.println("===== RETIRO VÁLIDO =====");
        boolean retiro1 = cuenta.retirar(30000);
        System.out.println("¿Retiro realizado? " + retiro1);
        System.out.println("Saldo actual: $" + cuenta.getSaldo());

        // Retiro inválido por superar el saldo
        System.out.println();
        System.out.println("===== RETIRO MAYOR AL SALDO =====");
        boolean retiro2 = cuenta.retirar(200000);
        System.out.println("¿Retiro realizado? " + retiro2);
        System.out.println("Saldo actual: $" + cuenta.getSaldo());

        // Retiro inválido por monto negativo
        System.out.println();
        System.out.println("===== RETIRO INVÁLIDO =====");
        boolean retiro3 = cuenta.retirar(-5000);
        System.out.println("¿Retiro realizado? " + retiro3);
        System.out.println("Saldo actual: $" + cuenta.getSaldo());

        // Verificación final de la invariante
        System.out.println();
        System.out.println("===== VERIFICACIÓN DE LA INVARIANTE =====");

        if (cuenta.getSaldo() >= 0) {
            System.out.println("La invariante se mantiene: el saldo nunca es negativo.");
        } else {
            System.out.println("Error: el saldo es negativo.");
        }
    }
}