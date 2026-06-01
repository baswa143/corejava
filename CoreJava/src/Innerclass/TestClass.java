package Innerclass;

public class TestClass {
    private int id=101; //we cannot create a private in main method
    public static void main(String[] args) {
        int id=101;
        System.out.println("Main class1");
        TestClass t1 = new TestClass();
        TestClass1 tc=t1.new TestClass1();
        TestClass2 tc1= new TestClass().new TestClass2();
        TestClass3 tc3= new TestClass.TestClass3() ;
        tc3.chair();
     //  tc1.show();
        //tc.show();

    }

     class TestClass1 extends TC21{
         public void show() {
             System.out.println();
             System.out.println(marks());
            // System.out.println();

         }
         @Override
         public int marks(){
             return 100;
         }
     }
     class TestClass2 extends Student{
        private int id=102;
        public void show() {
            int id=103;
            System.out.println(id);
            System.out.println(this.id);
            System.out.println(TestClass.this.id);
            getExam();
            marks();
        }
        private void getExam(){
            System.out.println("Exam");
        }

         @Override
         public void marks() {
             System.out.println("marks");
         }
     }
     static class TestClass3 {
        public static void chair(){
            System.out.println("chair");

         }

     }
}
