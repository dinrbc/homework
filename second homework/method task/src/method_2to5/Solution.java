package method_2to5;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arrayExample = {5, 9, 10, 17, -6, 12};
        System.out.println(maxFinder(arrayExample));
        System.out.println(minFinder(arrayExample));
        arraySorterAsc(arrayExample);
        arraySorterDesc(arrayExample);
        for (int i = 0; i < arrayExample.length; i++) {
            System.out.println(arrayExample[i]);
        }
    }

    public static int maxFinder(int[] array) {
        Arrays.sort(array);
        return array[array.length-1];
    }

    public static int minFinder(int[] array) {
        Arrays.sort(array);
        return array[0];
    }

    public static int[] arraySorterAsc(int[] array) {
        Arrays.sort(array);
        return array;
    }

    public static int[] arraySorterDesc(int[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[array.length-1-i]; // Временная переменная забирает посл. значение
            array[array.length-1-i] = array[i]; //
            array[i] = temp;
        }
        return array;
    }
}
