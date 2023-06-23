import java.util.Scanner;

public class Exception_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            int c = a / b;
            System.out.println(c);
        }
        catch(Exception f){
            System.out.println("Sorry! We couldn't execute the program for you due to the following reason: \n" +f);
        }
    }
}