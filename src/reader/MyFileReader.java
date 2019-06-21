package reader;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


public class MyFileReader {

   public  static List<String> readTextFile(String filename)throws IOException {
       List<String> lines = Files.readAllLines(Path.of(filename));

        return lines;
    }

   public static List<String> readOnlyGoodStuff(List<String> list)throws IOException {
       List<String> lines = new ArrayList<>();
       for ( String line : list){
           int indexOfEqualitySign = line.indexOf('=');
           String propertyValue = line.substring(indexOfEqualitySign + 1);

           lines.add(propertyValue);

       }
       return lines;
   }
}

