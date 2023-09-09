import java.util.Scanner;
public class CamelCaseProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(";");

            if (parts.length == 3) {
                char operation = parts[0].charAt(0);
                char type = parts[1].charAt(0);
                String words = parts[2];

                if (operation == 'S') {
                    String result = splitCamelCase(words);
                    System.out.println(result);
                } else if (operation == 'C') {
                    String result = combineCamelCase(words, type);
                    System.out.println(result);
                }
            }
        }

        scanner.close();
    }

    // Split camel case into space-delimited words
    private static String splitCamelCase(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                result.append(' ');
            }
            result.append(ch);
        }
        return result.toString().trim().toLowerCase();
    }

    // Combine space-delimited words into camel case
    private static String combineCamelCase(String input, char type) {
        StringBuilder result = new StringBuilder();
        String[] words = input.split(" ");
        for (String word : words) {
            if (result.length() == 0) {
                result.append(type == 'M' ? word : Character.toUpperCase(word.charAt(0)) + word.substring(1));
            } else {
                result.append(Character.toUpperCase(word.charAt(0)) + word.substring(1));
            }
        }
        if (type == 'M') {
            result.append("()");
        }
        return result.toString();
    }
}

