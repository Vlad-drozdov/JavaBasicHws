package hw.hw14;

public class App {
    static ConsolePrinter consolePrinter = new ConsolePrinter();

    public static void main(String[] args) {
        ConsolePrinter.Message msg1 = new ConsolePrinter.Message("123","fdd");
        ConsolePrinter.Message msg2 = new ConsolePrinter.Message("csshgc",null);
        ConsolePrinter.Message msg3 = new ConsolePrinter.Message(null,null);

        consolePrinter.print(msg1);
        consolePrinter.print(msg2);
        consolePrinter.print(msg3);
    }
}
