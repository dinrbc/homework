package method_10;

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(calculator("3 + 3"));
        System.out.println(calculator("3 * 3"));
        System.out.println(calculator("3 / 3"));
        System.out.println(calculator("3 - 3"));
        System.out.println(calculator("3 / 0"));
    }

    public static int calculator(String string) throws Exception {
        int result = 0;
        String[] stringArray = string.split(" ");
        switch (stringArray[1]) {
            case "+": result = Integer.parseInt(stringArray[0]) + Integer.parseInt(stringArray[2]);
            break;
            case "-": result = Integer.parseInt(stringArray[0]) - Integer.parseInt(stringArray[2]);
            break;
            case "*": result = Integer.parseInt(stringArray[0]) * Integer.parseInt(stringArray[2]);
            break;
            case "/": result = Integer.parseInt(stringArray[0]) / Integer.parseInt(stringArray[2]);
            break;
            default:
                Exception ArithmeticException = null;
                throw ArithmeticException;
        }
        return result;
    }
}
