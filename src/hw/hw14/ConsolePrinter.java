package hw.hw14;

import java.util.Objects;

public record ConsolePrinter() implements Printer {

    private static final String ANONYMOUS_MESSAGE_SAMPLE = "Анонімний користувач відправив повідомлення: %s";
    private static final String SIMPLE_MESSAGE_SAMPLE= "Користувач %s відправив повідомлення: %s";
    private static final String NULL_MESSAGE_SAMPLE = "Опрацьовується пусте повідомлення від анонімного користувача...";

    @Override
    public void print(Message msg) {
        String text = msg.getText();
        String sender = msg.getSender();
        boolean textIsNull = Objects.isNull(text) || text.isEmpty();
        boolean senderIsNull = Objects.isNull(sender) || sender.isEmpty();

        if (textIsNull && senderIsNull) {

            Printer anonymousPrinter = new Printer() {
                @Override
                public void print(Message msg) {
                    System.out.println(NULL_MESSAGE_SAMPLE);
                }
            };
            anonymousPrinter.print(msg);
            return;

        }

        if (senderIsNull) {
            System.out.printf((ANONYMOUS_MESSAGE_SAMPLE) + System.lineSeparator(),
                    text);
        }
        else {
            System.out.printf((SIMPLE_MESSAGE_SAMPLE) + System.lineSeparator(),
                    sender, text);
        }
    }

    public static class Message{
        private String text;
        private String sender;

        public Message(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }

        public String getText() { return text; }
        public void setText(String text) { this.text = text; }

        public String getSender() { return sender; }
        public void setSender(String sender) { this.sender = sender; }
    }
}
