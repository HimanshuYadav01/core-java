class first{
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    int a;
    first(){
        System.out.println("I am the default constructor of first class");
    }
    first(int x){
        System.out.println("The value of x is: " +x);
    }
}

class second extends first{
    second(){
        System.out.println("I am the default constructor of second class");
    }
    second(int x, int y){
        super(x);
        System.out.println("The value of y is: ");
    }
}

public class ThisAndSuper {
    public static void main(String[] args) {
        second obj = new second();
        obj.setA(5);
        System.out.println(obj.getA());
    }
}
