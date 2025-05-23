package practice.exceptions;

import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("arquivo_inexistente.txt"); // Lança FileNotFoundException
            System.out.println("Arquivo aberto com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
