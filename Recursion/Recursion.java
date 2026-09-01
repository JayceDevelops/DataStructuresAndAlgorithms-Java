public class Recursion {
    
    public static void main(String[] args) {
        System.out.println(gcd(16, 100));
        System.out.println(binary(10));
        rev(5);
    }

    // Returns Greatest Common Denominator
    public static int gcd(int x, int y){
        if (y == 0) {
            return x;
        }

        return gcd(y, x % y);
    }

    // Returns Int as Binary
    public static String binary(int n){
        if (n == 1){
            return "1";
        }

        return binary (n / 2) + (n % 2);
    }

    public static void rev(int n){
        if (n == 0){
            return;
        }

        System.out.println("Before recursive call. n=" + n);

        rev(n - 1);

        System.out.println("After recursive call. n=" + n);
    }
}
