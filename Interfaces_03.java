interface ParentInterface{
    void method1();
    void method2();
}

interface ChildInterface extends ParentInterface{
    void method3();
    void method4();
}

class DaughterClass implements ChildInterface{

    public void method1() {
        System.out.println("I am method 1");
    }
    public void method2() {
        System.out.println("I am method 2");
    }
    public void method3() {
        System.out.println("I am method 3");
    }
    public void method4() {
        System.out.println("I am method 4");
    }
}
public class Interfaces_03 {
    public static void main(String[] args) {
        DaughterClass d = new DaughterClass();
        d.method1();
        d.method2();
        d.method3();
        d.method4();
    }
}
