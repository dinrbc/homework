package task4;

public class Solution {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int sum = 0;
        for (int num: numbers) {
            sum+=num;
        }
        System.out.println(sum/numbers.length);
    }
}
