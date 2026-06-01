package lambdaexpressions;

public class Vehicle {
    public static void main(String[] args) {
        Audi a1 = new Audi();
        a1.driver(40);
        Car c1 = new Car() {
            @Override
            public int driver(int a) {
                return a;
                // System.out.println("BMW driver");
            }
        };
        c1.driver(30);
        //Lambda expression with anonymous function
        //3 components : arguments list, arrow token, function body
        //3 components: (arguments)->{function body}
        Car c2 = (a) -> {
            System.out.println("Audi driver..");
            if (a > 100)
                System.out.println("speed driving");
            else
                System.out.println("slow driving");

            return a;
        };
        c2.driver(80);

    }


}

class Audi implements Car{
    @Override
    public int driver(int a) {
        return a;
        // System.out.println("Audi driver..");
    }
}


interface Car{
    public int driver(int a);
}
