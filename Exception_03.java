import java.util.Scanner;

public class Exception_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = {45, 56, 78};
        boolean flag = true;
        while (flag) {
            System.out.println("Enter the value of index");
            int index = sc.nextInt();
            try {
                System.out.println("This is first try block");
                try {
                    System.out.println(marks[index]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("ArrayIndexOutOfBoundsException occurred");
                }
            } catch (Exception e) {
                System.out.println("some other exception occurred");
            }
        }
        System.out.println("The program has ended!");
    }
}
