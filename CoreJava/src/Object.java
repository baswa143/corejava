//public class Object extends Shiva {
//}
 class Natha{
    void display() {
        System.out.println("Class A");
    }
}
class B extends Natha {
//    void display() {
//        System.out.println("Class B");
//    }
}
class shiva {
    public static void main(String[] args) {
        Natha obj = new B();
        obj.display();
    }
}



