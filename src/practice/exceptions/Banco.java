package practice.exceptions;

public class Banco {
    public static void sacar(double saldo, double valor) {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente!"); // Lança unchecked
        }
        System.out.println("Saque realizado. Novo saldo: " + (saldo - valor));
    }

    public static void main(String[] args) {
        try {
            sacar(100.0, 150.0); // Lança SaldoInsuficienteException
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}