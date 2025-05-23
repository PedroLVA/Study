package practice.heapAndStack;

public class Pessoa {
    String nome; // Atributo (armazenado no Heap)

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public static void main(String[] args) {
        Pessoa p = new Pessoa("João"); // Objeto 'Pessoa' no Heap, referência 'p' na Stack
        System.out.println(p.nome);
    }
}
