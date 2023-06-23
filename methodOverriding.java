class A{
    public int fun1(int x){
        System.out.println("I am a default constructor in A");
        return x;
    }

}

class B extends A{
    @Override
    public int fun1(int x){
        System.out.println("I am a default constructor in B");
        return x;
    }
}
public class methodOverriding {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        System.out.println(a.fun1(3));
        System.out.println(b.fun1(6));
    }
}
