package practice.generics;

public class NumberBox<T extends Number> {
    private T number;

    public void set(T number) {
        this.number = number;
    }

    public double doubleValue() {
        // We can call methods of Number because we know T is a Number!
        return number.doubleValue();
    }

    public static void main(String[] args) {
        NumberBox<Integer> intBox = new NumberBox<>();
        intBox.set(100);
        System.out.println("Double value is: " + intBox.doubleValue());

        NumberBox<Double> doubleBox = new NumberBox<>();
        doubleBox.set(3.14);
        System.out.println("Double value is: " + doubleBox.doubleValue());

        // The following line would cause a compile-time error!
        // NumberBox<String> stringBox = new NumberBox<>(); // Error: String is not a subclass of Number
    }
}
