package comparable;

import javafx.scene.control.PasswordField;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Adam", "Polak", 72));
        personList.add(new Person("Wiktor", "Polak", 30));
        personList.add(new Person("Karolina", "Polak", 19));
        personList.add(new Person("Janko", "Auzykant", 25));


        Collections.sort(personList, new WtfAgeComparator());
        //Arrays.sort();

        for (Person person : personList) {
            System.out.println(person);
        }
    }

    public static class AgeComparator implements Comparator<Person>{
        @Override
        public int compare(Person o1, Person o2) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }

    public static class NameLastnameComparator implements Comparator<Person>{
        @Override
        public int compare(Person o1, Person o2) {
            if(o1.getLastname().compareTo(o2.getLastname()) != 0){
                return o1.getLastname().compareTo(o2.getLastname());
            }else{
                return o1.getName().compareTo(o2.getName());
            }
        }
    }

    public static class WtfAgeComparator implements Comparator<Person>{
        @Override
        public int compare(Person o1, Person o2) {
            if(o2.getAge() >= 50){
                System.out.println("Wygrywa " + o2.getName() +  "(" + o2.getAge() +"), a walczyl z " + o1.getName() +  "(" + o1.getAge() +")");
                return o1.getLastname().compareTo(o2.getLastname());
            }else{
                System.out.println("Wygrywa " + o2.getName() +  "(" + o2.getAge() +"), a walczyl z " + o1.getName() +  "(" + o1.getAge() +")");
                return o1.getName().compareTo(o2.getName());
            }
        }
    }

}
