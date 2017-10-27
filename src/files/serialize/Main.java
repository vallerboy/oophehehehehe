package files.serialize;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\asd\\cos.bin");
        Person person = new Person("Ktosiek", "Ktosiowaty", 14);


        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            ObjectOutputStream objectOutputStream =
                    new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(person);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream objectInputStream =
                    new ObjectInputStream(new FileInputStream(file));

            Person personRead = (Person) objectInputStream.readObject();
            System.out.println("Imie: " + personRead.getName());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
