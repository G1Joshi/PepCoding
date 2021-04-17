import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = n;
        int c = 0;
        while (m > 0) {
            c++;
            m /= 10;
        }
        int d = (int) Math.pow(10, c - 1);
        while (d > 0) {
            System.out.println(n / d);
            n %= d;
            d /= 10;
        }
    }
}