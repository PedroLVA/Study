package practice.casting;

public class CastingExample {

    public static void main(String[] args) {

        // --- Widening Casting (Automatic/Implicit) ---
        System.out.println("## Widening Casting (Safe) ##");

        // Casting an int to a double
        int myInt = 9;
        double myDouble = myInt; // Automatic casting from int to double

        System.out.println("Original int: " + myInt);
        System.out.println("Casted double: " + myDouble);
        System.out.println("---------------------------------");


        // --- Narrowing Casting (Manual/Explicit) ---
        System.out.println("## Narrowing Casting (Requires Manual Cast) ##");

        // Casting a double to an int
        double anotherDouble = 9.78;
        int anotherInt = (int) anotherDouble; // Manual casting from double to int

        System.out.println("Original double: " + anotherDouble);
        System.out.println("Casted int (data loss): " + anotherInt); // The .78 is lost

        // Another example of narrowing
        double highValue = 130.5;
        byte myByte = (byte) highValue; // byte can only hold up to 127

        System.out.println("\nOriginal double: " + highValue);
        // The value overflows and wraps around, resulting in an unexpected number.
        System.out.println("Casted byte (overflow and data loss): " + myByte);
        System.out.println("---------------------------------");
    }
}
