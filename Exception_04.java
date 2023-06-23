import java.util.Scanner;
class MyException extends Exception{
    @Override
    public String toString(){
        return "I am tostring() method";
    }
    @Override
    public String getMessage(){
        return "I am getMessage() method";
    }
}
public class Exception_04 extends MyException {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
//        int b = sc.nextInt();

        if(a<9){
            try{
//                throw new ArithmeticException("An exception has occurred");
                throw new MyException();
            }
            catch(Exception e){
                System.out.println(e.toString());
                System.out.println(e.getMessage());
            }
        }
    }
}
