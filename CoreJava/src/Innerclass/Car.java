package Innerclass;

 class Car  {
     public static void main(String[] args) {
         Car car=new Car();
         Bike bike=new Car().new Bike();
         bike.engine();
         bike.vehicleName();
     }
    class Bike implements Vehicle{

        @Override
        public  void engine() {
            System.out.println("Bike is a Bike");
        }

        @Override
        public void vehicleName() {
            System.out.println("bullet bike");

        }
    }

}
