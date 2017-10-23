package extending;

public class Worker extends Employee {

    private int happiness;

    public Worker(String name, String lastname, int seniority, int happiness) {
        super(name, lastname, seniority);
        this.happiness = happiness;
    }

    protected void shout() {
        System.out.println("KRZYYYYYYYYYYYCZE ZE MAM MALA WYYPLATE");
    }

    protected void work() {
        System.out.println("ZBIERAM CZEKOLADE Z TASMY");
    }

    public int getHappiness() {

        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    @Override
    public void askAboutSalary() {
        System.out.println("Daj 5 zl");
    }
}
