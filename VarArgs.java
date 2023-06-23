public class VarArgs {
    static int sum(int ...arr){
        int result = 0;
        for(int a : arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println("The sum of 5 and 10 is: " +sum(5,10));
        System.out.println("The sum of 3, 5 and 10 is: " +sum(3,5,10));
        System.out.println("The sum of 33, 51 and 60 is: " +sum(33,51,60));
        System.out.println("The sum of 122,22,34,54 and 10 is: " +sum(122,22,34,54,10));
    }
}
