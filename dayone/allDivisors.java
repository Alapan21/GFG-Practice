
public class allDivisors {
    public static void main(String[] args) {
        divisors(52);
        divisors(120);
    }

    private static void divisors(int n) {
        int i = 1;
        for(;i * i < n; i++){
            if(n%i==0){
                System.out.println(i);    
            }
        }
        for(; i>=0; i--){
            if(n%i == 0){
                System.out.println(n/i);
            }
        }
    }

}