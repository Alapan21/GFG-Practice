import java.util.Arrays;

public class sieveOfEratosthenes {
    public static void main(String[] args) {
        sieve(20);
        sieve(40);
    }

    private static void sieve(int n) {
        Boolean[] isPrime = new Boolean[n+1];
        Arrays.fill(isPrime, true);
        //
        for(int i = 2; i<= n; i++){
            if(isPrime[i]){
                for(int j = i*i ; j <= n; j += i){
                    isPrime[j] = false;
                }
            }
        }
        //
        for(int i=2; i <= n; i++){
            if(isPrime[i] == true){
                System.out.print(i + " ");
            }
        }
        //
        System.out.println();
    }
    
}
