package task1;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4, 5};
        int first = numbers[0];
        numbers[0] = numbers[5];
        numbers[5] = first;
        System.out.println(Arrays.toString(numbers));
    }
}
