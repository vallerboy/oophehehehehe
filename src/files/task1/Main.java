package files.task1;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\asd\\pasta.mojeRoz");
        File file1 = new File("C:\\asd\\test.txt");
        File file2 = new File("C:\\asd\\akademia.kodu");

        if(!file.exists() || !file1.exists() || !file2.exists()){
            System.out.println("Ktorys z plikow nie istnieje");
        }else{
            System.out.println("Sa wszystkie");
        }
    }
}
