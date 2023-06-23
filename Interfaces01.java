interface Bicycle{
    int a = 50;
    void applyBrakes(int decrement);
    void speedup();
}

interface bike{
    int b = 120;
    void accelerate();
    void blowHorn();
}

class vehicle implements Bicycle, bike{
    public void applyBrakes(int decrement){
        System.out.println("Decreasing speed");
    }
    public void speedup(){
        System.out.println("Increasing speed");
    }

    public void accelerate(){
        System.out.println("The bike is accelerating");
    }
    public void blowHorn(){
        System.out.println("bonk bonk bonk");
    }
}
public class Interfaces01{
    public static void main(String[] args) {
        vehicle Two_wheeler = new vehicle();
        Two_wheeler.applyBrakes(6);
        Two_wheeler.speedup();
        Two_wheeler.accelerate();
        Two_wheeler.blowHorn();
    }
}