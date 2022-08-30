package CODE_PTIT;
import java.util.*;

public class J02005 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int m = inp.nextInt(), x;
        int a[] = new int[1001];
        int b[] = new int[1001];
        for (int i = 0; i < n; i++) {
            x = inp.nextInt();
            a[x] = 1;
        }
        for (int i = 0; i < m; i++) {
            x = inp.nextInt();
            b[x] = 1;
        }
        for (int i = 1; i <= 1000; i++)
            if (a[i] == 1 && b[i] == 1)
                System.out.printf("%d ", i);
    }
}