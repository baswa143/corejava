package ExceptionHanding;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.*;

public class PropertiesHandling {
    public static void main(String[] args) throws IOException {
        File file=new File("propertiesFile");
        if(!file.exists())
        file.createNewFile();
        System.out.println(file.exists());
        Properties prop=new Properties();
        prop.setProperty("url", "localhost");
        prop.setProperty("name", "Tcs");
        prop.setProperty("password", "1234");

        FileOutputStream fos=new FileOutputStream(file);
        prop.store(fos,"Now prop file is created ");

        FileInputStream fis=new FileInputStream(file);
        prop.load(fis);

        Set<String> keys=prop.stringPropertyNames();
        System.out.println("keys: "+keys);
        for(String  key:keys){
            System.out.println(key+">>>>=="+prop.getProperty(key));
        }
        Collection<Object>values=prop.values();
        for(Object value:values)
        {
            System.out.println(value);
        }
        Set<Map.Entry<Object, Object>> entries=prop.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            System.out.println(entry.getKey()+">>>>=.."+entry.getValue());


        }




    }
}
