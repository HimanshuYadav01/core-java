abstract class Parent{
    abstract void Discipline();
}

class Daughter extends Parent{
    void Discipline(){
        System.out.println("You should be disciplined like your parents");
    }
}

public class abstractClass {
    public static void main(String[] args) {
        Daughter d = new Daughter();
        d.Discipline();

        Parent p = new Daughter();
        p.Discipline();
    }
}
