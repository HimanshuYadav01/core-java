package PracticeSetChapter8;

class Employee {
        int salary;
        public int GetSalary(){
                return salary;
        }
        String name;
        public String GetName(){
            return name;
        }

        public void SetName(String n){
            name = n;
        }
}

public class ch_08_practice_set{
        public static void main(String[] args){
                Employee obj = new Employee();
                obj.name = "Roshan Laal";
                obj.salary = 34000;
                obj.SetName("Himanshu");
                System.out.println(obj.GetName());
                System.out.println(obj.GetSalary());


        }
}
