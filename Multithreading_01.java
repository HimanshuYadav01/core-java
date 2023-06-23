class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("Hello MyThread1");
    }
}
class MyThread1 extends Thread{
    @Override
    public void run(){
        System.out.println("Hello MyThread2");
    }
}
public class Multithreading_01 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread1 t2 = new MyThread1();
        t1.start();
        t2.start();
    }
}