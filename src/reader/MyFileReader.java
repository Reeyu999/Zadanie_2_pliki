package reader;


import com.sun.jdi.Value;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;


public class MyFileReader {
/*
    public static List<String> readTextFile(String filename) throws IOException {
        List<String> lines = Files.readAllLines(Path.of(filename));

        return lines;
    }*/
/*
   public static List<String> readOnlyGoodStuff(List<String> list)throws IOException {
       List<String> lines = new ArrayList<>();
       for ( String line : list){
           int indexOfEqualitySign = line.indexOf('=');
           String propertyValue = line.substring(indexOfEqualitySign + 1);

           lines.add(propertyValue);

       }
       return lines;
   }*/

    public static List<String> readTextFile(String filename) throws IOException {
        return Files.readAllLines(Path.of(filename));


    }


    public static Map<String,String> readFile(List<String> filename)  {

        Map<String,String> result = new HashMap<>();
        for ( String line : filename){
            int indexOfEqualitySign = line.indexOf('=');
            String propertyKey = line.substring(0, indexOfEqualitySign);
            String propertyValue = line.substring(indexOfEqualitySign + 1);
            result.put(propertyKey,propertyValue);
        }


        return result;
        }



}