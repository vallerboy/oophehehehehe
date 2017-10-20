package extending;

public class Manager extends Worker {
    public Manager(String name, String lastname, int seniority) {
        super(name, lastname, seniority, 100);
    }

    @Override
    protected void shout() {
        System.out.println("WORKER PRACUJ BO CI JESZCZE OBETNE TA WYPLATE");
    }

    @Override
    protected void work() {
        System.out.println("*Przekladam jakies papierki z papierosem za uchem*");
    }

    protected void generateTasks() {
        System.out.println("Stworzylem zadania dla moich workerow");
    }
}
