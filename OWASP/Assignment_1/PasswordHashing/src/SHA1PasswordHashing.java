import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class SHA1PasswordHashing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a password
        System.out.print("Enter the password: ");
        String password = scanner.nextLine();

        // Calculate SHA-1 hash of the password
        try {
            String sha1Hash = calculateSHA1(password);
            System.out.println("SHA-1 Hash: " + sha1Hash);
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Error: SHA-1 algorithm not available.");
        }

        scanner.close();
    }

    private static String calculateSHA1(String input) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        byte[] hashedBytes = md.digest(input.getBytes());

        // Convert the byte array to a hexadecimal string
        StringBuilder hexString = new StringBuilder();
        for (byte hashedByte : hashedBytes) {
            hexString.append(String.format("%02x", hashedByte));
        }

        return hexString.toString();
    }
}
