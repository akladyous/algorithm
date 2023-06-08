package easy.thirteen_roman_to_integer;

public class RomanToInteger_Solution {
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
