import java.util.*;
import java.lang.System;
class Student {
    public void setter() {
        Scanner s1 = new Scanner(System.in);
        String str1 = new String();
        String str2 = new String();
        String str3 = new String();
        System.out.println("Enter the name of the student");
        str1 = s1.nextLine();
        System.out.println("Enter the Enrolment no. of the student");
        str2 = s1.nextLine();
        System.out.println("Enter the section of the student");
        str3 = s1.nextLine();

        System.out.println("Name" + str1);
        System.out.println("Enrolment no." + str2);
        System.out.println("section" + str3);

    }
}
class Scorecard extends Student {
    double mP , mC, mM , mPE, mE ;

    void getmarks() {
        super.setter();
        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter the marks in Physics");
        double mP = s2.nextDouble();
        System.out.println("Enter the marks in Chemistry");
        double mC = s2.nextDouble();
        System.out.println("Enter the marks in Maths");
        double mM = s2.nextDouble();
        System.out.println("Enter the marks in Physical Education");
        double mPE = s2.nextDouble();
        System.out.println("Enter the marks in English");
        double mE = s2.nextDouble();
    }

//    void display() {
//        Scorecard sc1 = new Scorecard();
//        sc1.setter();
//        sc1.getmarks();
//
//
//        System.out.println("Marks in Physics are: " + mP);
//        System.out.println("Marks in Physics are: " + mC);
//        System.out.println("Marks in Physics are: " + mM);
//        System.out.println("Marks in Physics are: " + mPE);
//        System.out.println("Marks in Physics are: " + mE);
//    }

}

class Result extends Scorecard{
    double result;
    void calc(){
        super.getmarks();
        super.setter();
        result = (mC + mP + mE + mM + mPE)/5;
    }
    void disp(){
        System.out.println(result);
    }

}


    public class lab_03_java extends Result {

    public static void main(String[] args) {
        int i;
        Result r1[] = new Result[3];

        for(i = 0; i<3; i++) {
            r1[i] = new Result();
            r1[i].calc();
            r1[i].disp();
        }
    lab_03_java obj = new lab_03_java();
    obj.calc();


       }
    }

//import java.util.Scanner;
////
//class student
//{
//    int enrollno;
//    String name;
//    String address;
//    public void get()
//    {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter name address and enrollment no");
//        name = s.nextLine();
//        enrollno = s.nextInt();
//        s.nextLine();
//        address = s.nextLine();
//    }
//}
//
//class scorecard extends student
//{
//    int mp,mc,mm,me,mh,total;
//    public void get()
//    {
//        super.get();
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter marks of hindi english phy che and maths");
//        mh = s.nextInt();
//        me = s.nextInt();
//        mp = s.nextInt();
//        mc = s.nextInt();
//        mm = s.nextInt();
//        total = me+mh+mp+mc+mm;
//    }
//}
//
//class result extends scorecard
//{
//    float per;
//    void perc()
//    {
//        get();
//        per = total/5;
//    }
//    void show()
//    {
//        System.out.println(name +" "+ per);
//    }
//}
//
//public class Main
//{
//    public static void main(String[] args) {
//        result s[] = new result[3];
//        for(int i = 0;i<3;i++)
//        {
//            s[i] = new result();
//            s[i].perc();
////s[i].show();
//        }
//        result temp = new result();
//        for(int i = 0;i<3;i++)
//        {
//            for(int j=0;j<3-i-1;j++)
//            {
//                if(s[j].per < s[j+i].per)
//                {
//                    temp = s[j];
//                    s[j] = s[j+1];
//                    s[j+1] = temp;
//                }
//            }
//        }
//        for(int i=0;i<3;i++)
//        {
//            s[i].show();
//        }
//        System.out.println("Hello World");
//    }
//}