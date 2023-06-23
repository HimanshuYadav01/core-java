import java.util.Scanner;
class NegativeRadiusException extends Exception{
    @Override
    public String getMessage(){
        return "radius can't be negative";
    }
}

public class Exception_05 {
    public static double area(float radius) throws NegativeRadiusException{
        if (radius < 0) {
            throw new NegativeRadiusException();
        }
        return Math.PI * radius * radius;
    }

//    public static int divide(int a, int b) throws ArithmeticException {
//        int result = a / b;
//        return result;
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        try {
//            int a = divide(4, 0);
//            double a = area(-4);
            System.out.println(area(radius));
        }
        catch(Exception e){
            System.out.println("An exception has occurred: " +e);
        }
    }
}