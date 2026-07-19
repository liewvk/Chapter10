import java.util.Scanner;

public class LoginChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final String CORRECT_USERNAME = "admin";
        final String CORRECT_PASSWORD = "java@2026";

        System.out.print("Enter username: ");
        String username = input.nextLine().trim();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        if (username.equalsIgnoreCase(CORRECT_USERNAME)
                && password.equals(CORRECT_PASSWORD)) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Invalid username or password.");
        }

        input.close();
    }
}
