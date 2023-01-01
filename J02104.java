
package CODE_PTIT;

import java.util.*;

public class J02104 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[][] a = new int[1005][1005];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = inp.nextInt();
                if(a[i][j] == 1 && i < j){
                    System.out.println("(" + (i+1) + "," + (j+1) + ")");
                }
            }
        }
    }
}
