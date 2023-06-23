class myThreadRunnable1 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 69) {
            System.out.println("I am first class");
        }
    }
}
class myThreadRunnable2 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 69) {
            System.out.println("I am Second class");
        }
    }
}
public class Multithreading_02 {
    public static void main(String[] args) {
        myThreadRunnable1 t1 = new myThreadRunnable1();
        Thread T1 = new Thread(t1);
        myThreadRunnable2 t2 = new myThreadRunnable2();
        Thread T2 = new Thread(t2);

        T1.start();
        T2.start();
    }
}
