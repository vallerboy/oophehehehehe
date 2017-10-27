package files;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

public class MainNew {
    public static void main(String[] args) {
        File file = new File("C:\\asd\\testplik.txt");

        try {
            List<String> lines = Files.readAllLines(file.toPath(), Charset.forName("UTF-8"));
            for (String s : lines) {
                System.out.print(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
