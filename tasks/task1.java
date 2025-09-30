import java.util.Random;
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] words = {"жук", "капелла", "странница", "полость", "шёлк", "цитадель", "лес", "колокол", "бастион", "зверь", "топь", "фантом", "игла", "ведьма", "танцор"};
        String word = words[random.nextInt(words.length)];

        char[] guessedWord = new char[word.length()];
        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i] = '_';
        }

        int lives = 6;

        String[] hangmanPics = {
                // 0 жизней
                "  _________\n" +
                "  |/      |\n" +
                "  |      (_)\n" +
                "  |      \\|/\n" +
                "  |       |\n" +
                "  |      / \\\n" +
                "  |\n" +
                "__|___",
                // 1 жизнь
                "  _________\n" +
                "  |/      |\n" +
                "  |      (_)\n" +
                "  |      \\|/\n" +
                "  |       |\n" +
                "  |      / \n" +
                "  |\n" +
                "__|___",
                // 2 жизни
                "  _________\n" +
                "  |/      |\n" +
                "  |      (_)\n" +
                "  |      \\|/\n" +
                "  |       |\n" +
                "  |\n" +
                "  |\n" +
                "__|___",
                // 3 жизни
                "  _________\n" +
                "  |/      |\n" +
                "  |      (_)\n" +
                "  |      \\|\n" +
                "  |       |\n" +
                "  |\n" +
                "  |\n" +
                "__|___",
                // 4 жизни
                "  _________\n" +
                "  |/      |\n" +
                "  |      (_)\n" +
                "  |       |\n" +
                "  |       |\n" +
                "  |\n" +
                "  |\n" +
                "__|___",
                // 5 жизней
                "  _________\n" +
                "  |/      |\n" +
                "  |      (_)\n" +
                "  |\n" +
                "  |\n" +
                "  |\n" +
                "  |\n" +
                "__|___",
                // 6 жизней
                "  _________\n" +
                "  |/      |\n" +
                "  |\n" +
                "  |\n" +
                "  |\n" +
                "  |\n" +
                "  |\n" +
                "__|___"
        };

        System.out.println("Добро пожаловать в игру Виселица!");
        System.out.println("Угадайте слово по буквам.");

        while (lives > 0) {
            System.out.println("\nСлово: " + String.valueOf(guessedWord));
            System.out.println("Осталось жизней: " + lives);
            System.out.println(hangmanPics[lives]);
            System.out.print("Введите букву: ");
            char guess = scanner.nextLine().toLowerCase().charAt(0);

            boolean correct = false;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess && guessedWord[i] == '_') {
                    guessedWord[i] = guess;
                    correct = true;
                }
            }

            if (!correct) {
                lives--;
                System.out.println("Такой буквы нет!");
            }

            if (String.valueOf(guessedWord).equals(word)) {
                System.out.println("Поздравляю! Вы угадали слово: " + word);
                break;
            }
        }

        if (lives == 0) {
            System.out.println(hangmanPics[0]);
            System.out.println("Вы проиграли! Загаданное слово было: " + word);
        }

        scanner.close();
    }
}
