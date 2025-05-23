package practice.heapAndStack;

public class Calculadora {
    public static void main(String[] args) {
        int a = 5; // Variável 'a' alocada na Stack
        int b = 10;
        int resultado = somar(a, b); // Chamada de método (vai pra Stack)
        System.out.println(resultado);
    }

    static int somar(int x, int y) { // Parâmetros x e y na Stack
        int temp = x + y; // Variável local 'temp' na Stack
        return temp;
    }
}