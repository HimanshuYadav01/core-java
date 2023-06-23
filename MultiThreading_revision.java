//class ABC extends Thread{
//    @Override
//    public void run() {
//        int a  = 5;
//        while (a == 5) {
//        System.out.println("Hello this is Himanshu Yadav ");
//            a++;
//        }
//    }
//}
//public class MultiThreading_revision {
//    public static void main(String[] args) {
//        ABC t1 = new ABC();
//        ABC t2 = new ABC();
////        t1.run();
//        t1.start();
//        t2.start();
//
//        try {
//            t1.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        try {
//            t2.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//    }
//import java.lang.Thread;
//public class MultiThreading_revision {
//    public static void main(String[] args) {
//        try {
//            for (int i = 0; i < 5; i++) {
//                Thread.sleep(5000,10000);
//                System.out.println(i+1);
//            }
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }
//    }
//}