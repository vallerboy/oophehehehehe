package enums;

public enum DayOfWeek {
    PONIEDZIALEK(1), WTOREK(2), SRODA(3), CZWARTEK(4), PIATEK(5),
    SOBOTA(6, true), NIEDZIELA(7, true);

    private int numberOfDay;
    private boolean isWeekend;

     DayOfWeek(int numberOfDay){
        this.numberOfDay = numberOfDay;
        this.isWeekend  = false;
    }

    DayOfWeek(int numberOfDay, boolean isWeekend){
        this.numberOfDay = numberOfDay;
        this.isWeekend = isWeekend;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public int getNumberOfDay() {
        return numberOfDay;
    }
}
