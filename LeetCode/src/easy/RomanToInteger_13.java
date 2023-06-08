package easy;

import java.util.HashMap;

public class RomanToInteger_13 {
    public static void main(String[] args) {
        String romanNumeral1 = "XXIV";
        int result1 = romanToInteger(romanNumeral1);
        System.out.println(result1);

        String romanNumeral2 = "MCMLXXIV";
        int result2 = romanToInteger(romanNumeral2);
        System.out.println(result2);

    }

    public static int romanToInteger(String s) {
        int result = 0;
        int prevValue = 0;
        int currentValue = 0;

        for (int i = s.length() - 1; i >= 0; i --) {
            switch (s.charAt(i)) {
                case 'I' -> currentValue = 1;
                case 'V' -> currentValue = 5;
                case 'X' -> currentValue = 10;
                case 'L' -> currentValue = 50;
                case 'C' -> currentValue = 100;
                case 'D' -> currentValue = 500;
                case 'M' -> currentValue = 1000;
            }

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


class RomanToInteger_solution_2 {
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
