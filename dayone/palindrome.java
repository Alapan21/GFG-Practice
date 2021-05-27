
public class palindrome {
    public static void main(String[] args) {
        System.out.println(customPalindrome(123));
        System.out.println(customPalindrome(121));
        System.out.println(customPalindrome(1441));
    }

    private static boolean customPalindrome(int i) {
        int temp = i, rev = 0, ld = 0;
        while(temp > 0){
            ld = temp % 10;
            rev = rev * 10 + ld;
            temp /= 10;
        }
        return rev==i;
    }
}
