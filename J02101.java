package CODE_PTIT;

import java.util.*;

public class J02101 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        while(t-- > 0){
            int n = inp.nextInt();
            int[][] a = new int[105][105];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    a[i][j] = inp.nextInt();
                }
            }
            for(int i = 0; i < n; i++){
                if(i % 2 == 0){
                    for(int j = 0; j < n; j++){
                        System.out.printf("%d ", a[i][j]);
                    }
                }
                else{
                    for(int j = n-1; j >= 0; j--){
                        System.out.printf("%d ", a[i][j]);
                    }
                }
                
            }
            System.out.println();
        }
    }
}
