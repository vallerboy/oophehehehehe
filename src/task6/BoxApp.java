package task6;

import java.util.Scanner;

public class BoxApp {
    public static void main(String[] args) {
        BoxApp app = new BoxApp();
        app.start();
        app.printBoxes();
        System.out.println(app.joinDiagonal());
        System.out.println(app.joinHorizontally());

    }

    private Scanner scanner;
    private Box[] boxes;

    public BoxApp() {
        scanner = new Scanner(System.in);
    }

    private void start() {
        System.out.print("Wpisz szerokosci po spacji: ");
        String[] words = scanner.nextLine().split(" ");

        if(words.length < 6) {
            System.out.println("Za malo tych rozmiarow");
            start();
        }else {
            boxes = new Box[words.length];
            for (int i = 0; i < words.length; i++) {
                int width = Integer.valueOf(words[i]);
                boxes[i] = new Box(width, width * 2);
            }
        }


    }

    private void printBoxes() {
        for (Box box : boxes) {
            System.out.println(box.toString());
        }
    }

    private Box joinDiagonal(){
        int width = 0, height = 0;
        for (Box box : boxes) {
            width += box.getWidth();
            height += box.getHeight();
        }
        return new Box(width, height);
    }

    private Box joinHorizontally(){
        int width = 0, maxHeight = 0;
        for (Box box : boxes) {
            width += box.getWidth();
            if(maxHeight < box.getHeight()){
                maxHeight = box.getHeight();
            }
        }
        return new Box(width, maxHeight);
    }


}
