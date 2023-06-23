interface musicPlayer1{
    void PlaySong();
    void ChangeSong();
    private void Favorite(){
        System.out.println("The song is added to favourites");
    }
    default void VolumeUp(){
        Favorite();
        System.out.println("The volume has been increased");
    }
}

interface Camera1{
    void TakePicture();
    void ShootVideo();
}

interface mainButton1{
    void PowerOff();
    void Unlock();
}

class cellPhone1{
    void Calling(){
        System.out.println("I am calling...");
    }
}

class MyPhone1 extends cellPhone1 implements musicPlayer1,Camera1,mainButton1{

    public void PlaySong(){
        System.out.println("The song is playing...");
    }
    public void ChangeSong() {
        System.out.println("The song is changing...");
    }
    public void TakePicture() {
        System.out.println("The picture is being taken...");
    }
    public void ShootVideo() {
        System.out.println("The video is being shot...");
    }
    public void PowerOff() {
        System.out.println("Power off");
    }
    public void Unlock() {
        System.out.println("The phone is unlocked");
    }
}


public class Polymorphism {
    public static void main(String[] args) {
        MyPhone1 vivo = new MyPhone1();
        musicPlayer1 mp = new MyPhone1();
        mp.PlaySong();
        mp.ChangeSong();
        mp.VolumeUp();

        vivo.ChangeSong();
        vivo.PowerOff();
    }
}
