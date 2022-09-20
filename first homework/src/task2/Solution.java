package task2;

public class Solution {
    public static void main(String[] args) {
        double[] numbers = {1.5, 2.0, 3.5};
        System.out.println("Сумма массива: " + sum(numbers));
        System.out.println("Произведение массива: " + multiplication(numbers));
        System.out.println("Среднее в массиве: " + average(numbers));
    }

    private static double sum(double[] array) {
        double Total_number = 0;
        for (int i = 0; i < array.length; i++) {
            Total_number += array[i];
        }
        return Total_number;
    }

    private static double multiplication(double[] array) {
        double Total_number = 1;
        for (int i = 0; i < array.length; i++) {
            Total_number *= array[i];
        }
        return Total_number;
    }

    private static double average(double[] array) {
        return sum(array)/array.length;
    }


}
