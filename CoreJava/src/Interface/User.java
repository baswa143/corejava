package Interface;

public class User {
    public static void main(String[] args) {
        Lenovo lenovo = new Lenovo();
        lenovo.keyword();
        lenovo.cut();
        lenovo.copy();
        lenovo.paste();
        Laptop.security();
       // Dell dell = new Dell();
        System.out.println("************* dell details **************");
      //  dell.copy();
        //dell.paste();
        //dell.cut();
        //dell.keyword();
        //dell.audio();
    }
    SampleAC sampleAC = new SampleAC();

}
