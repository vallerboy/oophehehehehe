package exception;

import javax.swing.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int[] someArray = {1,2,3,4,5};

        try {
            System.out.println(someArray[6]);
        }catch (ArrayIndexOutOfBoundsException e){
           // e.printStackTrace();
            System.out.println(someArray[2]);

        }finally {
            System.out.println("To sie wykona zawsze");
        }

        System.out.println("Działa dalej");
        try {
            openGUI();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void openGUI() throws  IOException{
        divide(5,0);
    }

    private static int divide(int a, int b) throws IOException {
        if(b == 0){
            throw new IOException("You cant divide by zero");
        }
        return a / b;
    }
}
