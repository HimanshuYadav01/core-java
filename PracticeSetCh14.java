import java.util.Scanner;
class CustomException extends Exception{
    @Override
    public String getMessage(){
        return "an Exception has occurred";
    }
}
public class PracticeSetCh14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        marks[0] = 34;
        marks[1] = 56;
        marks[2] = 78;
        marks[3] = 98;
        marks[4] = 35;

        int index = sc.nextInt();
        int i = 0;
        boolean flag = true;
        while (flag && i < 5) {
            try {
                System.out.println("Enter the index value" + marks[index]);
            } catch (Exception e) {
                System.out.println(e);
                i++;
            }
        }
        try {
            if (i >= 5) {
                throw new CustomException();
            }
        }
        catch(Exception e){
            System.out.println("An exception has occurred");
        }
    }
}
