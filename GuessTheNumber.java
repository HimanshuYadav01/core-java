import java.util.*;
class Game{
    int x;
    int number;
    int no_of_guesses;
    public int getNo_of_guesses() {
        return no_of_guesses;
    }

    public void setNo_of_guesses(int no_of_guesses) {
        this.no_of_guesses = no_of_guesses;
    }

    Game(){
        Random random = new Random();
        this.number = random.nextInt(100);
    }

    void TakeUserInput(){
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
    }

    boolean isCorrectNumber() {
        no_of_guesses++;
        if (x == number) {
            System.out.format("yay:) You've guessed the right number %d.\n You took %d attempts to guess it right\n" ,x,no_of_guesses);
            return true;
        }
        else if (x<number) {
            System.out.println("The number is low :(");
        }
        else if(x>number) {
            System.out.println("The number is high :(");
        }
        return false;
    }
}
public class GuessTheNumber {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("\t\t\t\t\t\tWelcome!\n\t\t\tThis game is made by Himanshu Yadav");
        System.out.println("\t\t\tGuess The Number from 0 to 100");
        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.TakeUserInput();
            b = g.isCorrectNumber();
            System.out.println(b);
        }
        System.out.println("\t\t\t\t\t\tHope you liked it.\n\t\t\t\t\tDo share your feedback");
        System.out.print("You have finished the game at ");
        System.out.println(c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
    }
}