class Dog{
    int weight, height;
    String  color;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

class cat extends Dog{

}
public class inheritance_01 {
    public static void main(String[] args){
        cat obj1 = new cat();
        obj1.setWeight(23);
        obj1.setHeight(3);
        obj1.setColor("brown");
        System.out.println(obj1.getWeight());
        System.out.println(obj1.getHeight());
        System.out.println(obj1.getColor());
    }
}
