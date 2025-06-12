package lab5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {
                "What is the capital of France?",
                "What is 2 + 2?",
                "Which planet is known as the Red Planet?"
        };

        String[] option1 = {"a) Paris", "a) 3", "a) Earth"};
        String[] option2 = {"b) London", "b) 4", "b) Mars"};
        String[] option3 = {"c) Rome", "c) 5", "c) Jupiter"};

        char[] answers = {'a', 'b', 'b'};

        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println((i + 1) + ". " + questions[i]);
            System.out.println(option1[i]);
            System.out.println(option2[i]);
            System.out.println(option3[i]);

            System.out.print("Your answer: ");
            String input = scanner.next();

            if (input.equals("a") || input.equals("b") || input.equals("c")) {
                if (input.charAt(0) == answers[i]) {
                    System.out.println("Correct!\n");
                    score = score + 1;
                } else {
                    System.out.println("Wrong!\n");
                }
            } else {
                System.out.println("Invalid input.\n");
            }
        }

        System.out.println("Your final score: " + score + "/" + questions.length);
        scanner.close();
    }
}
