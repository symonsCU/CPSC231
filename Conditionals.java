import java.util.Scanner;
import java.util.Random;
public class Conditionals {
    public static void main(String[] args) {
        String FAVORITE_DOG = "Golden Retriever";
        String guess = "Corgi";

        if (guess.equals(FAVORITE_DOG)) {
            System.out.println("You guessed it!");
        } else if (guess.equals("Border Collie")) {
            System.out.println("Nope, but close!");
        } else {
            System.out.println("No, you are wrong.");
        }

        /*
         * Switch Statement
         * - can only use it with bytes, chars, shorts, ints, or Strings
         * 
         */
        // switch (guess) {
        //     case "Border Collie":
        //         System.out.println("Nope, but close!");
        //         break;
        //     case FAVORITE_DOG:
        //         System.out.println("You guessed it!")
        //         break;
        //     default:
        //         System.out.println("Nope, you're wrong!")
        // }

        Scanner userInpu = new Scanner(System.in);
        Random randy = new Random();

        int generated = randy.nextInt(2);
        System.out.println("Randy generated " + generated);

        




        System.out.println("Enter 2 integers:\n");
        Scanner userInput = new Scanner(System.in);
        int num1 = userInput.nextInt();
        int num2 = userInput.nextInt();

        System.out.println("add or multiply the numbers?\n");
        Scanner userInputt = new Scanner(System.in);
        String prompt = userInputt.nextLine();

        if (prompt.equals("add")) {
            System.out.println(num1 + num2);
        }
        else if (prompt.equals("multiply")) {
            System.out.println(num1 * num2);
        }

    }
}