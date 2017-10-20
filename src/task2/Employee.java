package task2;

public class Employee {
    private String name;
    private String surname;
    private int yearOfBirth;
    private int seniority;
    private int salary;

    public Employee(String name, String surname, int yearOfBirth, int seniority, int salary) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.seniority = seniority;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", seniority=" + seniority +
                ", salary=" + salary +
                '}';
    }
}


