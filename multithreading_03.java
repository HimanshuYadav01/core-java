class MyThread2 extends Thread {
    public MyThread2(String name) {
        super(name);
    }

    public void run() {
            System.out.println("I am the run of myThread class");
    }
}
public class multithreading_03 {
    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2("Himanshu");
        MyThread2 t2 = new MyThread2("yadav");
        t1.start();
        t2.start();
        System.out.println("The First name is " + t1.getName());
        System.out.println("The Last name is " + t2.getName());
    }
}
