                         // Himanshu Yadav
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args){

        // 0 for rock
        // 1 for paper
        // 2 for scissors
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock, 1 for Paper and 2 for scissor");

        int userInput = sc.nextInt();
        Random random = new Random();
        int computerInput = random.nextInt(3);

        if (userInput == computerInput){
            System.out.println("It's a DRAW!");
        }

        else if(userInput == 0 && computerInput == 2  ||  userInput == 1 && computerInput == 0
                ||  userInput == 2 && computerInput == 1){
            System.out.println("You WIN!");
        }

        else if(userInput>2){
            System.out.println("Please enter 0,1 or 2");
        }
        else{
            System.out.println("Computer WINS!");
        }
        if(computerInput == 0){
            System.out.println("Computer's Choice: Rock");
        }

        else if(computerInput == 1){
            System.out.println("Computer's Choice: Paper");
        }

        else {
            System.out.println("Computer's Choice: Scissor");
        }
    }
}
