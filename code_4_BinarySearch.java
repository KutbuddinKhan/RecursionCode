public class code_4_BinarySearch {
    
    public static int binarySearch(int[] a, int left, int right, int x){
        if (left > right){
            return -1;
        }
        
        int mid = (left + right) / 2;
        
        if(x == a[mid]){
            return mid;
        }
        if(x < a[mid]){
            return binarySearch(a, left, mid - 1, x);
        }
            return binarySearch(a, mid + 1, right, x);
    }

    public static void main(String[] args) {
        int[] a = {-1, 0, 1, 2, 3, 4, 7, 9, 10, 20};
        int result = binarySearch(a, 0, 9, 20);
        System.out.println("Result: "+ result);
    }
}
