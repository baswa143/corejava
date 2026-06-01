package ExceptionHanding;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class FileHandling {
    public static void main(String[] args) throws IOException {
//        File f=new File("D:\\test\\moango.txt");
        File f=new File("./resources/boom/");
        f.delete();
        System.out.println(f.mkdir());
        System.out.println("find the folder"+ Arrays.toString(f.listFiles()));

//        if(f.exists())
//            f.delete();
        //f.createNewFile();
        System.out.println("The file exists "+f.exists());
      //  System.out.println(f.createNewFile());
        System.out.println(f.getName());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getParent());
        System.out.println(new Date(f.lastModified()));
        //f.delete();


    }
}
