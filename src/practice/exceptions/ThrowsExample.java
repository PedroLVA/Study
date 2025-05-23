package practice.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowsExample {
    public static void main(String[] args) {

        try{
            lerArquivo("dados.txt");
        }
        catch (FileNotFoundException ex){
            System.out.println("Arquivo não encontrado " + ex.getMessage());
        }
    }

    // Metodo que delega a exceção (throws)
    public static void lerArquivo(String caminho) throws FileNotFoundException { //throws, significa que quem chamar esse metodo tem q tratar
        File file = new File(caminho);
        Scanner scanner = new Scanner(file); // Pode lançar FileNotFoundException
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
