package practice.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchFinallyDemo {

    public static void main(String[] args) {
        System.out.println("--- Scenario 1: No Exception ---");
        demonstrateTryCatchFinally(10, 2, "existingFile.txt");

        System.out.println("\n--- Scenario 2: ArithmeticException Caught ---");
        demonstrateTryCatchFinally(10, 0, "existingFile.txt");

        System.out.println("\n--- Scenario 3: IOException Caught (File Not Found) ---");
        demonstrateTryCatchFinally(10, 2, "nonExistentFile.txt");

        System.out.println("\n--- Scenario 4: Exception in Catch (and Finally still runs) ---");
        demonstrateExceptionInCatch();

        System.out.println("\n--- Scenario 5: No Catch, Only Finally ---");
        demonstrateTryFinally(5);
        try {
            demonstrateTryFinally(0); // This will throw an exception
        } catch (ArithmeticException e) {
            System.out.println("Main caught: " + e.getMessage());
        }

        System.out.println("\n--- Scenario 6: Return statement in try ---");
        System.out.println("Method returned: " + demonstrateReturnInTry());
    }

    public static void demonstrateTryCatchFinally(int a, int b, String filePath) {
        BufferedReader reader = null; // Declare outside try to be accessible in finally
        System.out.println("Starting demonstration...");
        try {
            System.out.println("Inside TRY block: Attempting operations.");
            int result = a / b; // Potential ArithmeticException
            System.out.println("Result of division: " + result);

            reader = new BufferedReader(new FileReader(filePath)); // Potential FileNotFoundException (subtype of IOException)
            System.out.println("Successfully opened file: " + filePath);
            String line = reader.readLine();
            System.out.println("First line of file: " + line);

        } catch (ArithmeticException e) {
            System.out.println("Inside CATCH block (ArithmeticException): " + e.getMessage());
            // e.printStackTrace(); // Useful for debugging
        } catch (IOException e) {
            System.out.println("Inside CATCH block (IOException): Could not read file - " + e.getMessage());
        } catch (Exception e) { // A more general catch block (catches any other unexpected exceptions)
            System.out.println("Inside CATCH block (General Exception): An unexpected error occurred - " + e.getMessage());
        } finally {
            System.out.println("Inside FINALLY block: This always executes.");
            if (reader != null) {
                try {
                    reader.close();
                    System.out.println("File reader closed.");
                } catch (IOException e) {
                    System.out.println("Inside FINALLY block: Error closing reader - " + e.getMessage());
                }
            }
        }
        System.out.println("Finished demonstration.");
    }

    public static void demonstrateExceptionInCatch() {
        System.out.println("Starting exception-in-catch demonstration...");
        try {
            System.out.println("Inside TRY: Forcing an ArithmeticException.");
            int x = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Inside CATCH: Caught ArithmeticException. Now causing a NullPointerException.");
            String nullStr = null;
            System.out.println(nullStr.length());
        } finally {
            System.out.println("Inside FINALLY (exception-in-catch): This executes even if catch had an error.");
        }
        System.out.println("Finished exception-in-catch demonstration (this might not be reached if catch's exception wasn't handled).");
    }

    public static void demonstrateTryFinally(int num) {
        System.out.println("Starting try-finally demonstration...");
        try {
            System.out.println("Inside TRY: Performing operation.");
            int result = 100 / num; // Potential ArithmeticException
            System.out.println("Try-Finally result: " + result);
            // No catch block here
        } finally {
            System.out.println("Inside FINALLY (try-finally): This always executes, even if an unhandled exception occurs in try.");
        }
        System.out.println("Finished try-finally demonstration (this won't be reached if an unhandled exception occurred in try).");
    }

    public static String demonstrateReturnInTry() {
        System.out.println("Starting return-in-try demonstration...");
        try {
            System.out.println("Inside TRY: About to return 'Value from TRY'");
            return "Value from TRY";
        } catch (Exception e) {
            System.out.println("Inside CATCH: This won't be hit in this specific scenario.");
            return "Value from CATCH";
        } finally {
            System.out.println("Inside FINALLY (return-in-try): This executes BEFORE the method actually returns!");
            // You can have code here, but be careful:
            // - If you put a return statement in finally, it will override any return from try/catch.
            // - Modifying a return value here can be confusing (e.g., if returning a mutable object).
        }
    }
}