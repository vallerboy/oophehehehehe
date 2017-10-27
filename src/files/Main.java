package files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\asd\\obrazek.png");
        File file1 = new File("C:\\asd\\mojskopiowanyplik.png");

        List<Integer> byteList = new ArrayList<>();

        try {
            
            FileInputStream inputStreamReader = new FileInputStream(file);
            int i;
            while ((i = inputStreamReader.read()) != -1){
                byteList.add(i);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            if(!file1.exists()){
                file1.createNewFile();
            }
            FileOutputStream stream = new FileOutputStream(file1);
            for (Integer integer : byteList) {
                stream.write(integer);
            }

            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
