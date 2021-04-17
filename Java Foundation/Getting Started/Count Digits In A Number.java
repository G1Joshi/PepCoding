import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int c = 0;
        while (n > 0) {
            c++;
            n /= 10;
        }
        System.out.print(c);
    }
}