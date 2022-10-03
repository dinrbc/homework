package method_9;

public class Solution {
    public static void main(String[] args) {
        String result = wordChecker("Яблоко");
        System.out.println(result);
    }

    public static String wordChecker(String word) {
        word = word.toLowerCase();
        char[] vocal = new char[]{'a', 'e', 'i', 'o', 'u', 'y', 'а', 'е', 'ё', 'е', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я'};
        char[] letterSequence = word.toCharArray();
        int counter = 0;
        for (int i = 0; i < letterSequence.length; i++) {
            for (int i1 = 0; i1 < vocal.length; i1++) {
                if (letterSequence[i] == vocal[i1]) {
                    counter++;
                }
            }
        }
        if (counter > word.length() / 2) {
            return "Гласных больше";
        } else if (counter < word.length() / 2) {
            return "Согласных больше";
        } else return "Гласных и согласных одинаково";
    }
}
