
public class countDigits {

    public static void main(String[] args) {
        System.out.println(countDigitWhile(12));
        System.out.println(countDigitRecursion(123));
        System.out.println(countDigitLog(1234));
    }

    private static int countDigitWhile(int i) {
        int count = 0;
        while(i > 0){
            i/=10;
            count++;
        }
        return count;
    }

    private static int countDigitRecursion(int i) {
        if(i==0) return 0;
        return 1 + countDigitRecursion(i/10);
    }

    private static int countDigitLog(int i) {
        return (int)Math.floor(Math.log10(i)+1);
    }
}