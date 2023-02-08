import java.util.Scanner;

public class Basics{
    public static void main(String[] args){
        int courseCount = 6;
        int studyMins = 60;

        System.out.println("The total number of minutes you need to study per week is: " + (courseCount * studyMins));

        Scanner userInput = new Scanner(System.in);
        System.out.println("How many minutes did you spend on your phone yesterday? \n");
        int screenTime = userInput.nextInt();

        System.out.println("In total you spend \n" + (screenTime * 7) + " minutes a week, \n" + (screenTime * 30) + " minutes a month, \n" + (screenTime * 365) + " minutes a year on your phone");

    

    }
}