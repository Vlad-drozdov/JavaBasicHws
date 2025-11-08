package hw.hw14;
import static hw.hw14.ConsolePrinter.*;

public class App {
    static ConsolePrinter consolePrinter = new ConsolePrinter();

    public static void main(String[] args) {
        Message msg1 = new Message("123","fdd");
        Message msg2 = new Message("csshgc",null);
        Message msg3 = new Message(null,null);

        consolePrinter.print(msg1);
        consolePrinter.print(msg2);
        consolePrinter.print(msg3);
    }
}
