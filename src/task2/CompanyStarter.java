package task2;

public class CompanyStarter {
    public static void main(String[] args) {
        Company company = new Company( 2, 2);

        Employee employee =
                new Employee("Asd", "dsa", 2000, 5, 2300);
        Employee employee1 =
                new Employee("asd", "gasd", 1980, 2, 5000);
        Employee employee2 =
                new Employee("asda", "gafs", 1979, 1,1230);
        Employee employee3 =
                new Employee("asdad", "aad", 1959, 8, 11500);

        company.addWorker(employee2);
        company.addWorker(employee3);
        company.addManager(employee);
        company.addManager(employee1);

        company.show();
    }
}
