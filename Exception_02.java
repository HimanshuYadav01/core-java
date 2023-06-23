import java.util.Scanner;

public class Exception_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] marks = new int[3];
        marks[0] = 23;
        marks[1] = 45;
        marks[2] = 78;

        System.out.println("Enter the array index number: ");
        int index = sc.nextInt();

        System.out.println("Enter the number you want to divide with");
        int number = sc.nextInt();

        try{
            System.out.println("The required result is: " + marks[index]/ number);
        }
        catch(ArithmeticException e){
            System.out.println("An arithmetic exception has occurred" +e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("An ArrayIndexOutOfBoundsException has occurred" +e);
        }
        catch(Exception e){
            System.out.println("Some other exception has occurred" +e);
        }
    }
}
