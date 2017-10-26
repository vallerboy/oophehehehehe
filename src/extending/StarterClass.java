package extending;

import java.util.Collection;

public class StarterClass {
    public static void main(String[] args) {
        Worker worker =
                new Worker("Mieciu", "Kowalski", 1, 15);

        Manager manager =
                new Manager("Ula", "Kowalski", 10);

        Boss boss =
                new Boss("Damian", "Kowalski", 12);

//        worker.work();
//        manager.shout();
//        boss.shout();

        Worker boss1 = new Boss("test", "test", 1);
        boss1.work();



        shouldWork(manager);
        shouldWork(boss);
        shouldWork(worker);

        Worker[] workers = new Worker[3];
        workers[0] = boss;
        workers[1] = manager;



        Board[] boards = new Board[3];
        boards[0] = boss;


    }

    public static void shouldWork(Worker worker){
        worker.work();
    }
}
