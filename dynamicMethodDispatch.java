class Phone{
    public void FlashOn(){
        System.out.println("Flash is ON!!!");
    }

    public void Unlock(){
        System.out.println("The phone has been unlocked.");
    }
}

class smartPhone extends Phone{
    public void Camera(){
        System.out.println("The image has been captured !!!");
    }

    public void Unlock(){
        System.out.println("The smartphone has been unlocked.");
    }
}

public class dynamicMethodDispatch {
    public static void main(String[] args) {
        Phone obj =  new smartPhone();
        obj.FlashOn();
        obj.Unlock();
//        obj.Camera();  Not Allowed
    }
}