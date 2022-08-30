package CODE_PTIT;

import java.util.*;

public class J02103 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        for(int x = 1; x <= t; x++){
            int n = inp.nextInt(), m = inp.nextInt();
            int[][] a = new int[20][20];
            int[][] b = new int[20][20];
            int[][] c = new int[20][20];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    a[i][j] = inp.nextInt();              
                }
            }
            for(int i = 0;i < m; i++){
		for(int j = 0;j < n; j++){
                    b[i][j] = a[j][i];
		}
            }
            for(int i = 0;i < n; i++){
		for(int j = 0; j < n; j++){
                    c[i][j] = 0;
                    for(int k = 0;k < m; k++){
			c[i][j] = c[i][j] + a[i][k] * b[k][j];
                    }
		}
            }
            System.out.printf("Test %d:\n", x);
            for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			System.out.printf("%d ", c[i][j]);
		}
		System.out.printf("\n");
            }
        }
    }
}
