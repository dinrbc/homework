package method_1;

public class Solution {
    public static void main(String[] args) {
        int[] checker =  arrayReturner(20);
        for (int i = 0; i < checker.length; i++) {
            System.out.println(checker[i]);
        }
    }

    public static int[] arrayReturner(int number) {
        int[] result = new int[number];
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) (Math.random() * 1000);
        }
        return result;
    }
}
