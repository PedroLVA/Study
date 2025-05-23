package practice.exceptions;

public class CadastroUsuario {
    public static void validarEmail(String email) throws EmailInvalidoException {
        if (!email.contains("@")) {
            throw new EmailInvalidoException("E-mail inválido!");
        }
        System.out.println("E-mail válido!");
    }

    public static void main(String[] args) {
        try {
            validarEmail("usuario.sem.arroba"); // Lança EmailInvalidoException
        } catch (EmailInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}