
public class gcdandlcm {
    public static void main(String[] args) {
        System.out.println(hcf(12, 16));
        System.out.println(lcm(12, 16));

    }

    private static int hcf(int a, int b) {
        if (b == 0)
            return a;
        return hcf(b, a % b);
    }
    private static int lcm(int a, int b) {
        return (a * b) / hcf(a, b);
    }
}
