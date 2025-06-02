package practice.ternary;

public class TernaryOperatorStudy {

    public static void main(String[] args) {


        System.out.println("--- 1. Basic Ternary Operator ---");
        int score = 75;
        String result;


        if (score > 60) {
            result = "Pass";
        } else {
            result = "Fail";
        }
        System.out.println("Result (using if-else): " + result);

        // Using ternary operator
        result = (score > 60) ? "Pass" : "Fail";
        System.out.println("Result (using ternary): " + result);

        int age = 20;
        String category = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Age: " + age + ", Category: " + category);

        // 2. Ternary Operator in Expressions:
        // You can use the ternary operator directly within other expressions.

        System.out.println("\n--- 2. Ternary Operator in Expressions ---");
        int num1 = 10;
        int num2 = 20;

        // Directly in a print statement
        System.out.println("The larger number is: " + (num1 > num2 ? num1 : num2));

        boolean isEven = (num1 % 2 == 0) ? true : false;
        System.out.println(num1 + " is even? " + isEven);

        boolean isOdd = (num1 % 2 == 0) ? false : true;

        // Note: For boolean results, you can often simplify:
        boolean isEvenSimpler = (num1 % 2 == 0); // This is usually preferred
        System.out.println(num1 + " is even (simpler)? " + isEvenSimpler);
        // The ternary (isEven ? true : false) is redundant here.

        // 3. Nested Ternary Operators:
        // While possible, nested ternary operators can become hard to read.
        // Use them with caution.

        System.out.println("\n--- 3. Nested Ternary Operators ---");
        int marks = 85;
        String grade;

        // Equivalent if-else-if structure:
        // if (marks > 90) {
        //     grade = "A";
        // } else if (marks > 75) {
        //     grade = "B";
        // } else {
        //     grade = "C";
        // }

        grade = (marks > 90) ? "A" : (marks > 75) ? "B" : "C";
        System.out.println("Marks: " + marks + ", Grade (nested ternary): " + grade);


        // Example with more levels (can get very confusing):
        int level = 2;
        String access = (level == 1) ? "Full Access" :
                (level == 2) ? "Editor Access" :
                        (level == 3) ? "Viewer Access" : "No Access";
        System.out.println("Level: " + level + ", Access: " + access);


        // 4. Type Compatibility:


        System.out.println("\n--- 4. Type Compatibility ---");
        int number = -5;


        Number value; // Number is a superclass of Integer and Double

        value = (number > 0) ? 100 : 200.5; // Integer and Double, common supertype is Number
        System.out.println("Value (Number type): " + value + " (Type: " + value.getClass().getSimpleName() + ")");




        int intValue = (number < 0) ? -50 : (int) 25.5; // Explicit cast
        System.out.println("intValue (with cast): " + intValue);

        Object objValue = (number > 0) ? "Positive" : 0; // String and Integer, common supertype is Object
        System.out.println("objValue: " + objValue + " (Type: " + objValue.getClass().getSimpleName() + ")");


        System.out.println("\n--- How to Study with this Class ---");
        System.out.println("1. Read through each example and the comments.");
        System.out.println("2. Modify the values of variables (score, age, num1, num2, marks, level, number) and observe the output changes.");
        System.out.println("3. Try to rewrite some of the ternary operations using if-else statements and vice-versa.");
        System.out.println("4. Experiment with different data types for the expressions in the ternary operator.");
        System.out.println("5. Pay attention to the readability, especially with nested ternaries.");
        System.out.println("6. Uncomment the line that causes a compile error to see type compatibility issues in action.");
    }
}
