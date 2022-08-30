package CODE_PTIT;

import java.util.*;

public class J02102 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n * n; i++) {
            int x = inp.nextInt();
            list.add(x);
        }
        Collections.sort(list);
        int b = 0, d = 0;
        int a[][] = new int[20][20];
        while (b <= n / 2) {
            for (int i = b; i < n - b; i++) {
                a[b][i] = list.get(d);
                d++;
            }
            for (int i = b + 1; i < n - b; i++) {
                a[i][n - b - 1] = list.get(d);
                d++;
            }
            for (int i = n - b - 2; i >= b; i--) {
                a[n - b - 1][i] = list.get(d);
                d++;
            }
            for (int i = n - b - 2; i > b; i--) {
                a[i][b] = list.get(d);
                d++;
            }
            b++;
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
