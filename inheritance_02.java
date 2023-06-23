class base{
    base(){
        System.out.println("I am the not parameterized constructor of base class");
    }
    base(int x){
        System.out.println("Value of x is: " +x);
    }
}

class derived extends base{
    derived(){
        System.out.println("I am not the parameterized constructor of derived class");
    }
    derived(int x, int y){
        super(x);
        System.out.println("The value of y is: " +y);
    }
}

class derived2 extends derived{
    derived2(){
        System.out.println("I am not the parameterized constructor of derived2 class");
    }
    derived2(int x, int y, int z){
        super(x,y);
        System.out.println("The value of z is: " +z);
    }
}

public class inheritance_02 {
    public static void main(String[] args) {
        base ob3 = new base(9);
        derived obj2 = new derived(7,3);
        derived2 obj1 = new derived2(5,2,2);
    }
}
