import reader.MyFileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        MyFileReader reader = new MyFileReader();
        List<String> list = reader.readTextFile("Data.properties");


        System.out.println(MyFileReader.readOnlyGoodStuff(list));

    }
}
