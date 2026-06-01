package MultiThreading.ThreadGroupDemo;

public class GroupDemo {
    public static void main(String[] args) {
        ThreadGroup g= new ThreadGroup("First Group");
        System.out.println(g.getParent().getName());
        ThreadGroup t1= new ThreadGroup(g,"Second Group");
        System.out.println(t1.getParent().getName());
    }
}
