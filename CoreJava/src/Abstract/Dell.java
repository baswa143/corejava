package Abstract;

public  class Dell extends Laptop {
    @Override
    public void copy() {
        System.out.println("dell.copy");

    }

    public void paste() {
        System.out.println("Dell paste");

    }

    @Override
    public void cut() {
        System.out.println("Dell cut");

    }

    @Override
    public void play() {
        System.out.println("Dell playing games");

    }


}
