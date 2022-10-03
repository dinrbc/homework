package task1;

import java.io.IOException;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3 ,4, 5};
        int temp = array[5];
        array[5] = array[0];
        array[0] = temp;
        System.out.println(Arrays.toString(array));
    }
}
