package practice.exceptions;

public class UncheckedExceptionExample {
    public static void main(String[] args) {
        int a = 10; //stack
        int b = 0; //stack, those are also literals as I've been studying

        try {
            System.out.println("Resultado: " + (a / b)); // Lança ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Erro matemático: " + e.getMessage());
        }
    }
}
