package hw.hw15;

public class CommonAdviser implements Adviser {
    @Override
    public void advise(Day day) {
        switch (day){
            case MONDAY,TUESDAY,WEDNESDAY,THURSDAY:
                System.out.println("Будь продуктивним! Працюй над цілями, але не перевтомлюйся.");
                break;
            case FRIDAY:
                System.out.println("Happy Friday!");
                break;
            case SATURDAY,SUNDAY:
                System.out.println("Вихідні! Відпочинь, зустрінься з друзями або прогуляйся.");
                break;
            default: System.out.println("Exception");
        }
    }
}
