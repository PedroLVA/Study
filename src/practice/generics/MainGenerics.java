package practice.generics;

public class MainGenerics {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.put(10);
        // No cast needed, and it's type-safe
        Integer myInt = integerBox.get();
        System.out.println("Integer value: " + myInt);

        // Create a Box for Strings
        Box<String> stringBox = new Box<>();
        stringBox.put("Hello Generics");
        String myString = stringBox.get();
        System.out.println("String value: " + myString);



        // The following line would cause a compile-time error!
        // integerBox.put("some string"); // Error: Incompatible types
    }
}
