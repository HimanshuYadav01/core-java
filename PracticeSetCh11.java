//        problem 1

//abstract class Pen{
//    abstract void write();
//    abstract void refill();
//}
//
//class FountainPen extends Pen{
//    void write(){
//        System.out.println("I am writing");
//    }
//    void refill(){
//        System.out.println("Refill done");
//    }
//    void ChangeNib(){
//        System.out.println("Nib is being changed");
//    }
//}
//        FountainPen classmate = new FountainPen();
//        classmate.write();
//        classmate.refill();
//        classmate.ChangeNib();

class Monkey{
    void jump(){
        System.out.println("The monkey is jumping");
    }
    void bite(){
        System.out.println("The monkey will bite you");
    }
}

interface BasicHuman{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicHuman{
    public void eat(){
        System.out.println("Humans eat");
    }
    public void sleep(){
        System.out.println("Humans sleep");
    }
}
public class PracticeSetCh11 {
    public static void main(String[] args) {
        Human h = new Human();
        h.jump();
        h.bite();
        h.eat();
        h.sleep();
    }
}
