public class code_3_SumOfNaturalNumber {
    public static int recursiveSummation(int inputNumber){
        if (inputNumber <= 1){
            return inputNumber;
        }
        return inputNumber + recursiveSummation(inputNumber - 1);
    }
    public static void main(String[] args) {
        int result1 = recursiveSummation(5);
        int result2 = recursiveSummation(10);
        System.out.println("The summatin of 5: "+ result1);
        System.out.println("The summatin of 10: "+ result2);

    
    }
}
