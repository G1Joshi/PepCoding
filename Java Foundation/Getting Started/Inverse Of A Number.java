import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = 0;
        int d = 1;
        while (n > 0) {
            int r = n % 10;
            int p = (int) Math.pow(10, r - 1) * d;
            m += p;
            n /= 10;
            d++;
        }
        System.out.print(m);
    }
}
