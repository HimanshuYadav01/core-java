import java.util.Scanner;
public class MarksCalc {
    public static void main(String[] args){
        float max_marks = 500;
        Scanner marks = new Scanner(System.in);
        System.out.println("Enter the marks in subject 1: ");
        float a = marks.nextFloat();
        System.out.println("Enter the marks in subject 2: ");
        float b = marks.nextFloat();
        System.out.println("Enter the marks in subject 3: ");
        float c = marks.nextFloat();
        System.out.println("Enter the marks in subject 4: ");
        float d = marks.nextFloat();
        System.out.println("Enter the marks in subject 5: ");
        float e = marks.nextFloat();
        float total_marks = a+b+c+d+e;
        System.out.println("The total obtained marks are: " +total_marks);
        System.out.println("The maximum marks are: 500");

        float result = ((total_marks)* 100/(max_marks));
        System.out.println("The percentage is: " +result +"%");


    }
}


