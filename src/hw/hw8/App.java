package hw.hw8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int[] arr = new int[15];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(1, 101);
        }

        System.out.println("Початковий вигляд масиву: " + Arrays.toString(arr));

        for (int i = 1; i < arr.length; i++) {
            int counter = 0;

            while (i - counter - 1 >= 0 && arr[i] < arr[i - counter - 1]) {
                counter++;
            }

            int temp = arr[i];
            for (int j = i; j > i - counter; j--) {
                arr[j] = arr[j - 1];
            }

            arr[i - counter] = temp;
        }

        System.out.println("Відсортований масив: "+Arrays.toString(arr));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число для прошуку: ");
        int searchNumber = scanner.nextInt();

        int indexOfSearchNumber = -1;

        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == searchNumber) {
               indexOfSearchNumber = mid;
               break;
            } else if (arr[mid] < searchNumber) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (indexOfSearchNumber == -1){
            System.out.println("Число "+searchNumber+" не знайдено");
        } else {
            System.out.println("Індекс числа "+searchNumber+" у відсортованому масиві: "+indexOfSearchNumber);
        }

    }
}
