package hw.hw7;

/*
Створіть Java програму, яка виконує наступні завдання:

Створіть масив цілих чисел з 20 елементами.
Заповніть масив випадковими цілими числами в діапазоні від -100 до 100. +
Знайдіть та виведіть суму всіх від'ємних чисел в масиві. +
Знайдіть та виведіть кількість парних і непарних чисел в масиві. +
Знайдіть найбільший та найменший елементи масиву та їхні індекси. +
Знайдіть і виведіть середнє арифметичне чисел, розташованих після першого від'ємного числа у масиві (або повідомте, якщо від'ємних чисел немає).
Залийте виконаний проект на свій GitHub репозиторій, посилання на який зазначте в LMS.
*/

import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) {

        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(-100,101);
        }

        int sumOfNegative = 0;
        int countOfEven = 0;
        int countOfOdd = 0;
        int maxValue = arr[0];
        int maxValueIndex = 0;
        int minValue = arr[0];
        int minValueIndex = 0;
        float averageOfValuesAfterFirstNegative = 0f;

        boolean beFirstNegative = false;
        int sumOfValuesAfterFirstNegative = 0;
        int countOfValuesAfterFirstNegative = 0;

        String template = """
                            Елементи масиву: %s
                            Сума від'ємних чисел: %d
                            Кількість парних чисел: %d
                            Кількість непарних чисел: %d
                            Найменший елемент: %d (з індексом %d)
                            Найбільший елемент: %d (з індексом %d)
                            Середнє арифметичне чисел після першого від'ємного числа: %.2f""";



        for (int i = 0; i < arr.length; i++) {
            int el = arr[i];

            if (beFirstNegative){
                sumOfValuesAfterFirstNegative+=el;
                countOfValuesAfterFirstNegative++;
            }

            if (el < 0){
                if (!beFirstNegative){
                    beFirstNegative = !beFirstNegative;
                }
                sumOfNegative+=el;
            }

            if (el%2==0){
                countOfEven++;
            }else{
                countOfOdd++;
            }

            if (el > maxValue){
                maxValue = el;
                maxValueIndex = i;
            }

            if (el < minValue){
                minValue = el;
                minValueIndex = i;
            }
        }

        if (countOfValuesAfterFirstNegative != 0) {
            averageOfValuesAfterFirstNegative = sumOfValuesAfterFirstNegative / countOfValuesAfterFirstNegative;
        }

        System.out.println(template.formatted(Arrays.toString(arr),sumOfNegative,countOfEven,countOfOdd,minValue,
                minValueIndex,maxValue,maxValueIndex,averageOfValuesAfterFirstNegative));
    }
}
