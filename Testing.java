interface bakchodi {
    void photokheechna();
//    default void hello(){
//        System.out.println("hello what do you do");
//    }
}

class DivyashGupta implements bakchodi{
    public void photokheechna(){
        System.out.println("Namshkar, Main Divyash Gupta hoon");
        System.out.println("Photo kheenchna mera janmsidh adhikaar hai");
    }
}




    public class Testing {
        public static void main(String[] args) {
            DivyashGupta d = new DivyashGupta();
            d.photokheechna();
        }
    }

