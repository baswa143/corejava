package ExceptionHanding;

import java.io.*;

public class Files {
    public static void main(String[] args) throws IOException {
//        File f=new File("D:\\test\\moango.txt");
//        File f1=new File("./simple.txt");
//        System.out.println(f1.exists());
//        System.out.println(f1.toPath());
       // System.out.println(f.createNewFile());
       // System.out.println(f.exists());
       // System.out.println(f.getAbsolutePath());
        //System.out.println(f.delete());
        //FileInputStream fis = new FileInputStream(f);
        //System.out.println((char)fis.read());
       // String string = new String();


        try(FileReader fr=new FileReader("D:\\test")){
            int letters=fr.read();
            while(letters!=-1)
            {
                System.out.println((char) letters);
                letters=fr.read();
            }
            System.out.println();
        }
        catch (IOException e){
            System.out.println(e.toString());
        }
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
        {
            System.out.println("you got:"+br.read());
            System.out.println("you typed:"+br.readLine());
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
