import java.util.Random;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String lower = "abcdefghijklmnopqrstuvwxyz";
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digits = "0123456789";
        String special = "!@#$%^&*()-_=+[]{};:,.<>?/";

        String allChars = lower + upper + digits + special;

        System.out.print("Введите длину пароля (от 8 до 12): ");
        int length = scanner.nextInt();

        if (length < 8 || length > 12) {
            System.out.println("Ошибка: длина должна быть от 8 до 12 символов.");
        } else {
            String password;
            do {
                password = "";
                for (int i = 0; i < length; i++) {
                    int index = random.nextInt(allChars.length());
                    password = password + allChars.charAt(index);
                }
            } while (!isValid(password));

            System.out.println("Сгенерированный пароль: " + password);
        }

        scanner.close();
    }

    public static boolean isValid(String password) {
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) hasLower = true;
            else if (Character.isUpperCase(c)) hasUpper = true;
            else if (Character.isDigit(c)) hasDigit = true;
            else hasSpecial = true;
        }

        return hasLower && hasUpper && hasDigit && hasSpecial;
    }
}
