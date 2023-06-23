class Thr1 extends Thread{
    public void run(){

            System.out.println("good morning: ");

    }

    public void getPriority(int i) {
        int a;
        a = i;
    }
}

class Thr2 extends Thread {
    public void run() {
        try {
            Thread.sleep(200);
            System.out.println("Hello: ");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

public class PracticeSetCh_13 {
    public static void main(String[] args) {
        Thr1 t1 = new Thr1();
        Thr2 t2 = new Thr2();
//        t1.getPriority(-1);
//        t1.setPriority(Thread.MIN_PRIORITY);
//        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();

    }
}
