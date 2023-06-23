public class Exception_06 {
    public static int divide(){
        int a = 33;
        int b = 9;


        try{
            int c = a/b;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Finally is being tested");
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(divide());

        int a = 9;
        int b = 8;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("Finally for b" + b);
            }
            b--;
        }
        try{
            System.out.println(5/0);
        }
        finally{
            System.out.println("finally without catch");
        }
    }
}
