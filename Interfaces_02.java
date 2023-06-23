interface musicPlayer{
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

interface Camera{
    void TakePicture();
    void ShootVideo();
}

interface mainButton{
    void PowerOff();
    void Unlock();
}

class cellPhone{
    void Calling(){
        System.out.println("I am calling...");
    }
}

class MyPhone extends cellPhone implements musicPlayer,Camera,mainButton{

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
public class Interfaces_02 {
    public static void main(String[] args) {
        MyPhone vivo = new MyPhone();
        vivo.PlaySong();
        vivo.ChangeSong();
        vivo.TakePicture();
        vivo.ShootVideo();
        vivo.PowerOff();
        vivo.Unlock();
        vivo.VolumeUp();
    }
}