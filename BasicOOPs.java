class Employee{
    private int id;
    private String name;

    public void Setid(int i){
        id = i;
    }
    public int Getid(){
        return id;
    }
    public void SetName(String s){
        name = s;
    }
    public String GetName(){
        return name;
    }
}
public class BasicOOPs {
    public static void main(String[] args){
        Employee obj = new Employee();
        obj.Setid(989);
        System.out.println(obj.Getid());
        obj.SetName("Himanshu Yadav");
        System.out.println(obj.GetName());
    }
}
