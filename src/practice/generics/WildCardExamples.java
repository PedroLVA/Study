package practice.generics;

import java.util.Arrays;
import java.util.List;

public class WildCardExamples {
    // This method can accept List<Integer>, List<Double>, etc.
    public static double sumOfList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        // list.add(10); // COMPILE ERROR! You can't add to a ? extends list.
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4);
        System.out.println("Sum of integers: " + sumOfList(intList));

        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3);
        System.out.println("Sum of doubles: " + sumOfList(doubleList));
    }
}