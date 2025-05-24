package practice.arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LerArquivo {
    public static void main(String[] args) {
        String caminho = "arquivo.txt";

        try {
            List<String> linhas = Files.readAllLines(Paths.get(caminho));
            for (String linha : linhas) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
