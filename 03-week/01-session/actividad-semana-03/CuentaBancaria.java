public class CuentaBancaria {
    private final int id;
    private double saldo;

    public CuentaBancaria(int id, double saldoInicial) {
        this.id = id;

        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
        }
    }

    public int getId() {
        return this.id;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void consignar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
            System.out.println("Consignación realizada: $" + monto);
        } else {
            System.out.println("Monto inválido para consignar.");
        }
    }

    public boolean retirar(double monto) {
        if (monto > 0 && monto <= this.saldo) {
            this.saldo -= monto;
            System.out.println("Retiro realizado: $" + monto);
            return true;
        } else {
            System.out.println("Retiro inválido.");
            return false;
        }
    }
}