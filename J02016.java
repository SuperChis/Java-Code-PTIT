package CODE_PTIT;

import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class J02016 {

    public static int BinaryS(long a[], int l, int r, long x) {
        if (l > r) {
            return -1;
        }
        int mid = (l + r) / 2;
        if (x == a[mid]) {
            return mid;
        }
        if (x < a[mid]) {
            return BinaryS(a, l, mid - 1, x);
        }
        return BinaryS(a, mid + 1, r, x);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        while (t-- > 0) {
            int n = inp.nextInt();
            long a[] = new  long[n];
            for (int i = 0; i < n; i++) {
                long x = inp.nextLong();
                a[i] = x * x;
            }
            Arrays.sort(a);
            int ok = 0;
            for (int i = 0; i < n - 2; i++) {
//                if(a[i] == 0) continue;
                for (int j = i + 1; j < n-1; j++) {
                    if (BinaryS(a, j+1, n - 1, a[i] + a[j]) != -1) {
                        ok = 1;
                        System.out.println("YES");
                        break;
                    }
                }
                if(ok == 1) break;
            }
            if (ok == 0) {
                System.out.println("NO");
            }
            System.out.println();
        }
    }
}