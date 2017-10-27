package files.task4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file;
        Scanner scanner = new Scanner(System.in);

        String answer;
        do{
            System.out.println("1. Stworz katalog");
            System.out.println("2. Stworz plik");
            System.out.print("Wpisz odpowiedz: ");
            answer = scanner.nextLine();
            System.out.print("Wpisz sciezke: ");
            file = new File(scanner.nextLine());
            switch (answer){
                case "1": {
                    file.mkdirs();
                    break;
                }
                case "2": {
                    try {
                        file.createNewFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                }
            }


        }while (!answer.equals("exit"));
    }
}
