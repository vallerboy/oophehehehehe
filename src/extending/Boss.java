package extending;

public class Boss extends Manager implements Board {
    public Boss(String name, String lastname, int seniority) {
        super(name, lastname, seniority);
        setHappiness(1000);
    }

    @Override
    protected void work() {
        System.out.println("NaN");
    }

    @Override
    protected void shout() {
        System.out.println("POPRAWIAJ WYKRESY MANAGER!!");
        System.out.println("A Ci podczas przerwy, to czemu nic nie robia?");
    }

    @Override
    protected void generateTasks() {
        System.out.println("Wszystkie");
    }

    @Override
    public void kickOut(String name) {
        System.out.println("Wyrzucam " + name + " z firmy");
    }

    @Override
    public void giveSalaryUp(int howMany) {
        System.out.println("Pieniazki leca z nieba, a dokladnie " + howMany);
    }


}
