package hw.hw15;

public class App {
    private final static Adviser adviser = new Adviser();
    public static void main(String[] args) {
        adviser.advise(Day.MONDAY);
        adviser.advise(Day.FRIDAY);
        adviser.advise(Day.SATURDAY);
    }
}
