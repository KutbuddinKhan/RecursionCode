public class code_2_Palindrome {
    public static boolean isPalindrom(String input){
        // Define the base case / Stopping condition
        if(input.length() == 0 || input.length() == 1){
            return true;
        }
        //  Do some work to shrink the problem space
        if(input.charAt(0) == input.charAt(input.length() - 1)) {
            return isPalindrom(input.substring(1, input.length() - 1));
        }

        // Additional base-case to handle non-palindrome
        return false;
    }
    
    public static String findBianry(int decimal, String result){
        if (decimal == 0){
            return result;
        }
        result = decimal % 2 + result;
        return findBianry( decimal / 2, result);

    }

    public static void main(String[] args) {
        String input = "KayalK";
        boolean result1 = isPalindrom(input);
        String result2 = findBianry(233, "");
        System.out.println("Result: "+ result1);
        System.out.println("Result binary: "+ result2);
    }
}
