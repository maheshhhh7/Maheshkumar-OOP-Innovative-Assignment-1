import java.util.InputMismatchException;
import java.util.Scanner;

public class ProblemC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rollNo = -1;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter roll number: ");
                rollNo = scanner.nextInt();
                validInput = true;

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a numeric roll number.");
                scanner.next(); // discard the invalid token
            }
        }

        System.out.println("Roll number accepted: " + rollNo);
        scanner.close();
    }
}