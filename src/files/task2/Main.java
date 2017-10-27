package files.task2;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\asd\\plik.txt");
        Scanner scanner = new Scanner(System.in);

        if(!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileOutputStream stream = null;
        try {
             stream = new FileOutputStream(file, true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        String response;
        do{
            System.out.print("Wpisz cos do pliku: ");
            response = scanner.nextLine();
            try {
                stream.write((response + "\r\n").getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }while (!response.equals("exit"));
    }
}
