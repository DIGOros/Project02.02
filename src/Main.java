import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for user's personal information
        System.out.println("Welcome! Let's collect your personal information.");

        // Asking for user's name
        System.out.print("What's your name? ");
        String name = scanner.nextLine();

        // Asking for user's favorite color
        System.out.print("What's your favorite color, " + name + "? ");
        String color = scanner.nextLine();

        // Asking for user's favorite animal
        System.out.print("What's your favorite animal? ");
        String animal = scanner.nextLine();

        // Asking for user's favorite country
        System.out.print("What's your favorite country? ");
        String country = scanner.nextLine();

        // Asking for user's favorite city
        System.out.print("What's your favorite city? ");
        String city = scanner.nextLine();

        // Asking for user's age
        System.out.print("How old are you, " + name + "? ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Asking for number of cups of tea/coffee
        System.out.print("How many cups of tea/coffee did you drink today? ");
        int cups = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Asking for a number between 1 and 10
        System.out.print("Choose a number between 1 and 10: ");
        int number = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Asking for the current year
        System.out.print("What year is it today? ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Asking for hours spent on the computer
        System.out.print("How many hours did you spend on the computer today? ");
        double hours = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        // Printing the summary
        System.out.println("Hi, " + name + "! Here's the summary of your information:");
        System.out.println("Favorite Color: " + color);
        System.out.println("Favorite Animal: " + animal);
        System.out.println("Favorite Country: " + country);
        System.out.println("Favorite City: " + city);
        System.out.println("Age: " + age + " years old");
        System.out.println("Cups of Tea/Coffee: " + cups);
        System.out.println("Chosen Number: " + number);
        System.out.println("Current Year: " + year);
        System.out.println("Hours Spent on Computer: " + hours + " hours");

        // Closing the scanner
        scanner.close();
    }
}
