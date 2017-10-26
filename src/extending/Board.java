package extending;

public interface Board {
    void kickOut(String name);
    void giveSalaryUp(int howMany);

    default void test() {

    }
}
