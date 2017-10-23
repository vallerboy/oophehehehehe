package extending;

public abstract class Employee {
    private String name;
    private String lastname;
    private int seniority;

    public Employee(String name, String lastname, int seniority) {
        this.name = name;
        this.lastname = lastname;
        this.seniority = seniority;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    public abstract void askAboutSalary();
//    public  void askAboutSalary() {
//
//    }
}
