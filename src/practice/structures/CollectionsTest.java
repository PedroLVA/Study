package practice.structures;

import java.util.*;

public class CollectionsTest {
    public static void main(String[] args) {

        System.out.println("----- LIST (ArrayList) -----");
        List<String> fruitList = new ArrayList<>();
        Collections.synchronizedCollection(new ArrayList<>(1));//Syncronized to prevent erros when concurrent access
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Orange");
        fruitList.add("Apple"); // Duplicates allowed
        System.out.println("List: " + fruitList); // [Apple, Banana, Orange, Apple]
        System.out.println("Element at index 1: " + fruitList.get(1)); // Banana
        fruitList.remove("Apple"); // Removes first occurrence
        System.out.println("After removal: " + fruitList); // [Banana, Orange, Apple]


        System.out.println("\n----- SET (HashSet) -----");
        Set<String> fruitSet = new HashSet<>();
        fruitSet.add("Apple");
        fruitSet.add("Banana");
        fruitSet.add("Orange");
        fruitSet.add("Apple"); // Duplicate ignored
        System.out.println("Set: " + fruitSet); // [Apple, Banana, Orange] (order may vary)
        System.out.println("Contains 'Banana'? " + fruitSet.contains("Banana")); // true
        fruitSet.remove("Orange");
        System.out.println("After removal: " + fruitSet); // [Apple, Banana]
        System.out.println("Contains 'Banana'? " + fruitSet.contains("Orange"));


        System.out.println("\n----- MAP (HashMap) -----");
        Map<String, Integer> fruitPrices = new HashMap<>();
        fruitPrices.put("Apple", 2);
        fruitPrices.put("Banana", 1);
        fruitPrices.put("Orange", 3);
        fruitPrices.put("Apple", 4); // Updates existing key
        System.out.println("Map: " + fruitPrices); // {Apple=4, Banana=1, Orange=3}
        System.out.println("Price of Banana: " + fruitPrices.get("Banana")); // 1
        fruitPrices.remove("Orange");
        System.out.println("After removal: " + fruitPrices); // {Apple=4, Banana=1}
    }
}
