import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int c = 0;
        int num = n;
        while (num != 0) {
            num /= 10;
            c++;
        }
        k = k % c;
        if (k < 0)
            k = k + c;

        int d = 1;
        int m = 1;
        for (int i = 1; i <= c; i++) {
            if (i <= k)
                d *= 10;
            else
                m *= 10;
        }
        int r = n % d * m + n / d;
        System.out.println(r);
    }
}