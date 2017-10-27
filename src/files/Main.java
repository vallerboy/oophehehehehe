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

            InputStreamReader inputStreamReader =
                    new InputStreamReader(new FileInputStream(file));

            FileInputStream inputStreamReader1 = new FileInputStream(file);
            int i;
            int x;
            while ((i = inputStreamReader.read()) != -1){
                System.out.print(i + " ");
            }

            System.out.println("\n");
            System.out.println("-----------------------------------");

            while ((x = inputStreamReader1.read()) != -1){
                System.out.print(x + " ");
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
