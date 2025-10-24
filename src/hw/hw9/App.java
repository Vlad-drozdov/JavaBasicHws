package hw.hw9;

import java.util.Random;

public class App {

    private static int[][] arr = new int[4][4];
    private static int sumEvenRows;
    private static int sumOddRows;
    private static long productEvenColumns = 1;
    private static long productOddColumns = 1;

    public static void main(String[] args) {
        fillArr();
        printArr();
        sumOfRows();
        sumOfColumns();
        printInfo();
        magicCubeExamination();

    }

    private static void magicCubeExamination() {
        int firstRowSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int currentRowSum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if(i == 0) firstRowSum+=arr[i][j];
                else {
                    currentRowSum +=arr[i][j];
                }
            }
            if (firstRowSum != currentRowSum){
                System.out.println("Матриця не є магічним квадратом.");
                return;
            }
        }

        int firstColumnSum = 0;
        for (int i = 0; i < arr[0].length ; i++) {
            if (i == 1) {
                if (firstRowSum != firstColumnSum){
                    System.out.println("Матриця не є магічним квадратом.");
                    return;
                }
            }
            int currentColumnSum = 0;
            for (int j = 0; j < arr.length ; j++) {
                if(i == 0) firstColumnSum+=arr[j][i];
                else {
                    currentColumnSum +=arr[j][i];
                }
            }
            if (firstColumnSum != currentColumnSum){
                System.out.println("Матриця не є магічним квадратом.");
                return;
            }
        }

        int firstDiagonalSum = 0;
        for (int i = 0; i < arr[0].length; i++) {
            firstDiagonalSum += arr[i][i];
        }
        if (firstColumnSum != firstDiagonalSum){
            System.out.println("Матриця не є магічним квадратом.");
            return;
        }

        int secondDiagonalSum = 0;
        for (int i = 0, j = arr[0].length-1; i < arr.length; i++,j--) {
            secondDiagonalSum += arr[i][j];
        }
        if (firstDiagonalSum != secondDiagonalSum){
            System.out.println("Матриця не є магічним квадратом.");
            return;
        }

        System.out.println("Матриця є магічним квадратом.");
    }

    private static void sumOfColumns() {
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i % 2 == 0) productEvenColumns *= arr[j][i];
                else productOddColumns *= arr[j][i];
            }
        }
    }

    private static void sumOfRows() {
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i % 2 == 0) sumEvenRows +=arr[i][j];
                else sumOddRows += arr[i][j];
            }
        }
    }

    private static void fillArr(){
        for (int[] row : arr) {
            for (int i = 0; i < row.length ; i++) {
                row[i] = new Random().nextInt(1,51);
            }
        }
    }

    private static void printArr(){
        for (int[] row : arr) {
            for (int el : row) {
                System.out.print(el+" ");
            }
            System.out.println();
        }
    }

    private static void printInfo(){
        System.out.println("Сума елементів у парних рядках :"+sumEvenRows);
        System.out.println("Сума елементів у непарних рядках :"+sumOddRows);
        System.out.println("Добуток елементів у парних стовпцях :"+productEvenColumns);
        System.out.println("Добуток елементів у непарних стовпцях :"+productOddColumns);
    }
}
