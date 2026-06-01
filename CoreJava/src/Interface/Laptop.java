package Interface;

public interface Laptop {
    public void copy();

    public void paste();

    public void cut();

    public void keyword();

    default void audio()
    {
        commoncode();
        copy();
        System.out.println("audio code");
    }
    static void security(){
        commoncode();
        System.out.println("secure the file");
    }
    private static void commoncode(){
        System.out.println("commoncode");
    }

}
