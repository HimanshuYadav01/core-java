package PracticeSetCh9;
class Cylinder {
    private double radius, height;

//    public void setRadius(double r) {
//        radius = r;
//    }
    public double getRadius(){
        return radius;
    }
//    public void setHeight(double h) {
//        height = h;
//    }
    public double getHeight(){
        return height;
    }
//    public double area(double r, double h){
//        return 2 * 22.7 * r *(h + r) ;
//    }
    public Cylinder(){
        double r = radius = 44;
        double h = height = 67;
    }
}

public class Ques_01{
    public static void main(String[] args){
        Cylinder obj = new Cylinder();

        System.out.println(obj.getRadius());
        System.out.println(obj.getHeight());
//        System.out.println(obj.area(5.6,9.8 ));
    }
}
