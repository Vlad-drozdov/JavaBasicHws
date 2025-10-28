package hw.hw11;

public class App {
    public static void main(String[] args) {
        Person p1 = new Person("John", (byte)30, "Інженер");
        Person p2 = new Person("Mary", (byte)25, "Вчитель");
        Person p3 = new Person("Bob", (byte)35, "Лікар");

        System.out.print("1. ");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println();

        System.out.print("2. ");
        System.out.println(p1);
        p1.setProfession("Архітектор");
        System.out.println("(Після оновлення професії)");
        System.out.println(p1);
    }
}
