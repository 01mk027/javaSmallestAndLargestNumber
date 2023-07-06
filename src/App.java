import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Declaring variables and creating instance of Scanner class
        int countOfEnteredNumbers = 0, enteredNumber = 0;
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY; 
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        //Assigning count of entered numbers to relevant variable
        countOfEnteredNumbers = input.nextInt();
        //Setting loop to get all the numbers
        for(int i=0; i< countOfEnteredNumbers; i++)
        {
            System.out.println("Enter a number as integer:");
            enteredNumber = input.nextInt();
            if(enteredNumber < min)
            {
                min = enteredNumber;
            }

            if(enteredNumber > max)
            {
                max = enteredNumber;
            }
        }

        System.out.println("Largest of numbers entered from the keyboard: " + max);
        System.out.println("Smallest of numbers entered from the keyboard: " + min);

    }
}
