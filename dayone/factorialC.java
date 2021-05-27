
public class factorialC {

    public static void main(String[] args) {
        System.out.println(factorialRecursion(5));
        System.out.println(factorialIterative(5));
        //System.out.println(factorialRecursion(5));
    }

    private static int factorialIterative(int i) {
        int result = 1;
        while(i > 0){
            result *= i;
            i--;
        }
        return result;
    }

    private static int factorialRecursion(int i) {
        if(i == 0 ) return 1;
        return i * factorialRecursion(i-1);
    }
}
