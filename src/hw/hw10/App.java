package hw.hw10;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        numberSqured();
        cylinderV(2, 10);
        arrSum(10,20,30,40,50);
        flipString();
        power();
        printNTimes();

    }

    private static void numberSqured(){
        System.out.println("1. Введіть ціле число: ");
        int number = input.nextInt();
        System.out.println("Квадрат числа "+number+" дорівнює "+Math.pow(number,2));
    }

    private static void cylinderV(double radius, double height) {
        double V = Math.PI*Math.pow(radius,2)* height;
        System.out.println("2. Об'єм циліндра з радіусом "+ radius +" і висотою "+ height +" дорівнює "+V);
    }

    private static void arrSum(int... nums) {
        int sum = 0;
        if (nums == null || nums.length == 0) return;
        System.out.println("3. Масив чисел: "+ Arrays.toString(nums));
        for(int num : nums){
            sum+=num;
        }
        System.out.println("Сума всіх елементів масиву дорівнює "+sum);
    }

    private static void flipString(){
        System.out.println("4. Введіть рядок: ");
        char[] stringToChar = input.next().toCharArray();
        String flippedString = "";
        if (stringToChar == null || stringToChar.length == 0) return;
        for (int i = stringToChar.length-1; i >= 0; i--) {
            flippedString += stringToChar[i];
        }
        System.out.println("Рядок в зворотньому порядку: "+flippedString);
    }

    private static void power() {
        System.out.println("5. Введіть a: ");
        int a = input.nextInt();
        System.out.println("Введіть b: ");
        int b = input.nextInt();
        int power = (int) Math.pow(a,b);
        System.out.println("Результат "+a+"^"+b+" дорівнює "+power);
    }

    private static void printNTimes() {
        System.out.println("6. Введіть ціле число n: ");
        int n = input.nextInt();
        System.out.println("Введіть текстовий рядок: ");
        String s = input.next();
        for (int i = 0; i<n; i++) {
            System.out.print(s+System.lineSeparator());
        }
    }

}
