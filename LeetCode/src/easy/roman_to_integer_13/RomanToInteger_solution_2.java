package easy.roman_to_integer_13;
import java.util.HashMap;

public class RomanToInteger_solution_2 {
    public static void main(String[] args) {
        String romanNumeral = "XXIV";
        int number = romanToInteger(romanNumeral);
        System.out.println(number);
    }

    public static int romanToInteger(String romanNumeral) {
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            char currentChar = romanNumeral.charAt(i);
            int currentValue = romanValues.get(currentChar);

            if (currentValue >= prevValue) {
                result += currentValue;
            } else {
                result -= currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    }


}
