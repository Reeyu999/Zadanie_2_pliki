import reader.MyFileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {


        List<String> list = MyFileReader.readTextFile("Data.properties");
        Map<String,String> map = MyFileReader.readFile(list);


        System.out.println(map.keySet() + "" + map.values());

    }
}
