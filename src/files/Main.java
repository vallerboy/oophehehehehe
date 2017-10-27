package files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\asd\\obrazek.png");
        File file1 = new File("C:\\asd\\mojskopiowanyplik.png");

        InputStreamReader inputStreamReader = null;
        List<Integer> byteList = new ArrayList<>();
        try {
            inputStreamReader =
                    new InputStreamReader(new FileInputStream(file));
            int i;
            while ((i = inputStreamReader.read()) != -1){
                byteList.add(i);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(inputStreamReader != null)
                inputStreamReader.close();
        }


        try {
            if(!file1.exists()){
                file1.createNewFile();
            }
            FileOutputStream stream = new FileOutputStream(file1, false);

            for (Integer integer : byteList) {
                stream.write(integer);
            }

            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
