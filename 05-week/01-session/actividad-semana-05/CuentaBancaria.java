import java.util.Objects;

public class CuentaBancaria {
    private final int id;
    private double saldo;

    // Constructor completo con validación
    public CuentaBancaria(int id, double saldoInicial) {
        this.id = id;

        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
        }
    }

    // Constructor reducido que delega con this()
    public CuentaBancaria(int id) {
        this(id, 0);
    }

    public int getId() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }

    // Operación de dominio: consignar
    public boolean consignar(double monto) {
        if (monto > 0) {
            saldo += monto;
            return true;
        }

        return false;
    }

    // Operación de dominio: retirar
    public boolean retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "id=" + id +
                ", saldo=" + saldo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof CuentaBancaria)) {
            return false;
        }

        CuentaBancaria cuenta = (CuentaBancaria) o;
        return id == cuenta.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}