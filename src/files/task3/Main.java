package files.task3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\asd\\plik.txt");

        System.out.println("Dane z pliku: ");

        try {
            FileInputStream inputStream = new FileInputStream(file);
            int myChar;
            while((myChar = inputStream.read()) != -1){
                System.out.print((char)myChar);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
