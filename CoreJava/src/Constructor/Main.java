package Constructor;

public class Main {
     String modelName;
     int modelYear;

    public Main(String modelName){
        this.modelName=modelName;


    }

    public  Main(String modelName, int modelYear){
        this.modelName=modelName;
        this.modelYear=modelYear;
    }
    public void printInfo(){
        System.out.println( modelYear+" "+modelName);
    }
    

    public static void main(String[] args) {
        Main obj = new Main("James Bond",2020);
        Main obj2 = new Main("Bond",2020);
        obj.printInfo();
        obj2.printInfo();

    }
}
