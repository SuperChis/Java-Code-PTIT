package CODE_PTIT;

import java.util.Scanner;

public class J02106 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[][] a =  new int[n][3];
        int ans = 0;
        for(int i = 0; i < n; i++){
            int cnt = 0;
            for(int j = 0; j < 3; j++){
                a[i][j] = inp.nextInt();
                if(a[i][j] == 1) cnt++;
                else cnt--;
            }
            if(cnt > 0) ans++;
        }
        System.out.println(ans);
    }
}
