package task3;

import java.time.LocalDate;
import java.time.Period;

public class Starter {
    public static void main(String[] args) {
        Product product = new Product("Test", "test1");
        Product product1 = new Product("Cos", "test");



        Guarantee guarantee =
                new Guarantee(product, LocalDate.of(2017, 10, 19));
        Guarantee guarantee1 =
                new Guarantee(product1, LocalDate.of(2017, 11, 19));

        System.out.println(guarantee.isValid());
        System.out.println(guarantee1.isValid());
    }
}
