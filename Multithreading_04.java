class MyThr extends Thread {
    public MyThr(String name) {
        super(name);
    }

    public void run() {
        int i = 50;
        while (true) {
            System.out.println("The name is: " + this.getName());
        }
    }

    public class Multithreading_04 {
        public static void main(String[] args) {
            MyThr t1 = new MyThr("Himanshu");
            MyThr t2 = new MyThr("Yash");
            MyThr t3 = new MyThr("Deepak");
            MyThr t4 = new MyThr("Abir");
            MyThr t5 = new MyThr("Priyansh");
            t1.start();
            t2.start();
            t3.start();
            t4.start();
            t5.start();
            t1.setPriority(Thread.MAX_PRIORITY);
            t2.setPriority(Thread.NORM_PRIORITY);
            t3.setPriority(Thread.MIN_PRIORITY);
            t4.setPriority(Thread.MIN_PRIORITY);
            t5.setPriority(Thread.MIN_PRIORITY);
        }
    }

}
