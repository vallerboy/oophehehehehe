package task2;

import task1.Player;

import java.util.stream.Stream;

public class Company {
    private Employee[] workers;
    private Employee[] managers;

    public Company(int workersLength, int managersLength) {
        workers = new Employee[workersLength];
        managers = new Employee[managersLength];
    }

    public boolean addWorker(Employee worker){
        for (int i = 0; i < workers.length; i++) {
            if(workers[i] == null){
                workers[i] = worker;
                return true;
            }
        }
        return false;
    }

    public boolean addManager(Employee manager){
        for (int i = 0; i < managers.length; i++) {
            if(managers[i] == null){
                managers[i] = manager;
                return true;
            }
        }
        return false;
    }

    public void show() {
        for (Employee manager : managers) {
            if(manager != null) {
                System.out.println(manager.toString());
            }
        }
        for (Employee worker : workers) {
            if(worker != null) {
                System.out.println(worker.toString());
            }
        }
    }

    private int minSalary(){
        int minSalary = Integer.MAX_VALUE;
        for (Employee worker : workers) {
             if(worker.getSalary() < minSalary){
                 minSalary = worker.getSalary();
             }
        }
        for (Employee manager : managers) {
            if(manager.getSalary() < minSalary){
                minSalary = manager.getSalary();
            }
        }
        return minSalary;
    }
}
