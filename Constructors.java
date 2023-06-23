class Employee1{
    private int id;
    private String name;

    public Employee1(){
        id = 46;
        name = "Himahu";
    }    public Employee1(int n){
        id = n;
        name = "Himanshu";
    }    public Employee1(String s){
        id = 7;
        name = s;
    }

//    public void Setid(int i){
//        id = i;
//    }
    public int Getid(){
        return id;
    }
//    public void SetName(String s){
//        name = s;
//    }
    public String GetName(){
        return name;
    }
}


public class Constructors {
    public static void main(String[] args){
        Employee1 obj1 = new Employee1();
        Employee1 obj2 = new Employee1(89);
        Employee1 obj3 = new Employee1("MY NAME IS HIMANSHU YADAV");
        System.out.println(obj3.Getid());
        System.out.println(obj3.GetName());
    }
}
