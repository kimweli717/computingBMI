import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {
        int score = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int number1 = (int)(Math.random() * 10);
            int number2 = (int)(Math.random() * 10);

            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            System.out.println("What is " + number1 + " - " + number2 + " ? ");
            int answer = input.nextInt();

            if (number1 - number2 == answer) {
                System.out.println("Your answer is correct");
                score++;
            }
            else {
                System.out.println("Your answer is  wrong");
                System.out.println(number1 + " - " + number2 + " is " + (number1 - number2));
            }
            System.out.println("Your current score is " + score);
            System.out.println();

        }
        System.out.println("Final score: " + score + " out of 5");
    }
}


