public class Code_1_StringReversal {
    // without Recursion
    public static String without_recursion_reverseString(String input) {
        // Check for null or empty string
        if (input == null || input.isEmpty()) {
            return input;
        }

        char[] charArray = input.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // Swap characters at left and right indices
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move the pointers towards each other
            left++;
            right--;
        }

        return new String(charArray);
    }

    // With Recursion
    public static String with_recursion_reverseString(String input){
         // Base case: If the input string is empty or has only one character, return it.
         if (input == null || input.length() <= 1) {
            return input;
        }

        // Recursive step: Reverse the substring excluding the first character,
        // and then append the first character to the end of the reversed substring.
        return with_recursion_reverseString(input.substring(1)) + input.charAt(0);
    }

    public static void main(String[] args){
        String input1 = "Java Hello";
        String input2 = "Hello Java";
        String reversed1 = without_recursion_reverseString(input1);
        String reversed2 = with_recursion_reverseString(input2);
        System.out.println("without Reversed String: "+ reversed1);
        System.out.println("with recursion Reversed String: "+ reversed2);
    }
}
