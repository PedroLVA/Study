class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private String cidade;

    // Construtor
    public Pessoa(String nome, int idade, double altura, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.cidade = cidade;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public String getCidade() {
        return cidade;
    }

    @Override
    public String toString() {
        return "Pessoa{nome='" + nome + "', idade=" + idade +
                ", altura=" + altura + ", cidade='" + cidade + "'}\n";
    }
}
