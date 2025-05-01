import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        comparatorsObjects();

    }

    public static void comparators(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(43);
        numbers.add(3);
        numbers.add(6);
        numbers.add(18);

        System.out.println("Original: " + numbers);

        Collections.sort(numbers);
        System.out.println("Natural ordem: " + numbers);

        Collections.sort(numbers, Comparator.naturalOrder());
        System.out.println("Usando Comparator explícito: " + numbers);

        Collections.sort(numbers, Comparator.reverseOrder());
        System.out.println("Usando ReverseOrder: " + numbers);

        numbers.sort((n1,n2) -> n1.compareTo(n2));
        System.out.println("Usando lambda: " + numbers);


        numbers.sort(Comparator.nullsFirst(Comparator.naturalOrder()));
        numbers.sort(Comparator.comparing(n -> Math.abs(n - 10)));
        System.out.println("Maior proximidade com 10: " + numbers);

        numbers.sort(Integer::compare);
        numbers.sort(Integer::compare);
        System.out.println("Integer compare: " + numbers);


        numbers.sort((n1, n2) -> {

            int paridade1 = n1 % 2;  // 0 se par, 1 se ímpar
            int paridade2 = n2 % 2;

            if (paridade1 != paridade2) {
                return paridade1 - paridade2;  //0 e 1 por exemplo, vai retornar -2
            }

            // Se ambos têm a mesma paridade, ordenamos normalmente
            return n1.compareTo(n2);
        });

        System.out.println("Pares primeiro: " + numbers);

        //create a new ordened list based on an unordered list

        List<Integer> orderedList = numbers.stream().sorted(Comparator.nullsFirst(Comparator.comparing(Integer::intValue))).toList();

        System.out.println("Ordered list, another variable created via toList: " + orderedList);

        String cat1 = "Z";
        String cat2 = "B";

        int resultado = cat1.compareTo(cat2);

        System.out.println("Resultado compareTo: " + resultado);


    }
    public static void comparatorsObjects(){
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Abe", 32, 1.78, "São Paulo"));
        pessoas.add(new Pessoa("Ana", 32, 1.65, "Rio de Janeiro"));
        pessoas.add(new Pessoa("Pedro", 18, 1.82, "Belo Horizonte"));
        pessoas.add(new Pessoa("Mariana", 29, 1.70, "Brasília"));
        pessoas.add(new Pessoa("Bruno", 22, 1.75, "São Paulo"));
        pessoas.add(new Pessoa("Lúcia", 35, 1.68, "Curitiba"));

        Checker checker = new Checker();

        // Sort the list using your comparator
        pessoas.sort(checker);
        System.out.println("Ordenado por classe checker: \n" + pessoas);

        //Ordenar por nome
        pessoas.sort(Comparator.comparing(Pessoa::getNome));
        System.out.println("Ordernar por nome: \n" + pessoas);

        System.out.println("===============");

        pessoas.sort(Comparator.comparingInt(Pessoa::getIdade));
        System.out.println("Ordernar por idade: \n" + pessoas);

        pessoas.sort(Comparator.comparingDouble(Pessoa::getAltura));
        System.out.println("Ordernar por altura: \n" + pessoas);

        //reverse order

        pessoas.sort(Comparator.comparingInt(Pessoa::getIdade).reversed());
        //basta adicionar o reverse no final
        System.out.println("Ordernar por idade reverso: \n" + pessoas);

        pessoas.sort(Comparator.comparing(Pessoa::getCidade));
        System.out.println("Ordernar cidade ordem alfabetica: \n" + pessoas);

        pessoas.sort(Comparator.comparing(Pessoa::getIdade).reversed());
        System.out.println("Idade reversed: \n" + pessoas);



    }
    public static void comparatorString(){
        List<String> strings = new ArrayList<>();

        strings.add("1001");
        strings.add("11");
        strings.add("10");
        strings.add("6");
        strings.add("3");
        strings.add("2");
        strings.add("1");
        strings.add("1002");

        System.out.println("Lista não ordenada: "+  strings);
        strings.sort((s1, s2 ) ->{
            //10
            //10
            //2 - 3

            if(s1.length() != s2.length()){
                return s1.length() - s2.length();
            }

            return s1.compareTo(s2);
            //1 - 1
            //0 - 2
        });

        System.out.println("Lista ordenada: "+  strings);



    }
}