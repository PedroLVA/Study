import java.util.Comparator;

public class Checker implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa o1, Pessoa o2) {

        if(o1.getIdade() != o2.getIdade()){
            return o2.getIdade() - o1.getIdade();
        }

        return o1.getNome().compareTo(o2.getNome());
    }
}