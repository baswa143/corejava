package String;

public class StringDemo {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc") ;

        boolean b1 = str1.equals(str2);
        boolean b2 = str1==str2;
        System.out.println(b1);
        System.out.println(b2);

//        switch (b1){
//            case true:
//                System.out.println("b1");
//                break;
//        }
    }
}
