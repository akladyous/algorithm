public class IsIsoGram {
    public static  boolean solution_I(String str){
        // solution 1 with array of boolean's
        boolean[] charSet = new boolean[128]; //128 is the length of ascii table
        for (int i = 0; i < str.length(); i++) {
            int currentChar = str.charAt(i);// cast current char into Integer
            if (charSet[currentChar]){
                return false; // If the character has already been seen, return false
            }
            charSet[currentChar] = true; // Mark the character as seen in the array
        }
        return true; // If no duplicate characters were found, return false
    }

    public static Boolean solution_II(String str) {
        int[] charSet = new int[128];
        for (int i = 0; i < str.length() ; i++) {
            int currentChar = str.charAt(i);
            if ( charSet[currentChar] > 0) {
                return false;
            }
            charSet[currentChar] ++;
        }
        return true;
    }
}