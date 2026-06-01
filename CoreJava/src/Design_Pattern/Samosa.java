package Design_Pattern;

public class Samosa {
    private static Samosa samosa;
    //private constructor
    private Samosa(){}
    // Lazy way of creating  singleton object
    public static Samosa getSamosa(){
        //object of this class
        if(samosa==null){
            samosa=new Samosa();
        }
        return samosa;
    }
}

class Jalebi{
    //Eager way of creating singleton object
    private static Jalebi jalebi=new Jalebi();

    public static Jalebi getJalebi() {
            return jalebi;
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Lazy way to creating singleton object");
        Samosa samosa =Samosa.getSamosa();
        System.out.println(samosa.hashCode());
        Samosa samosa1=Samosa.getSamosa();
        System.out.println(samosa1.hashCode());
        System.out.println("Eager way of creating singleton object");
        Jalebi jalebi =Jalebi.getJalebi();
        System.out.println(jalebi.hashCode());
        Jalebi jalebi2=Jalebi.getJalebi();
        System.out.println(jalebi2.hashCode());

    }
}