package method_8;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        numberChecker(0, 2, 1, 17);
    }

    public static boolean numberChecker(int... numbers) {
        boolean result = false;
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i] + numbers[i+1];
            if (num==numbers[i+2]) {
                result = true;
                break;
            } else continue;
        }
        return result;
    }
}
