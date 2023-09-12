public class code_5_Fibbo {
    public static int fibbo(int n){
        if (n == 0 || n == 1){
            return n;
        }
        return fibbo(n - 1) + fibbo(n - 2);
    }

    public static void main(String args[]){
        int result = fibbo(6);
        System.out.println("Result: "+ result);
    }
    
}
