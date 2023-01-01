
package CODE_PTIT;

import java.util.Scanner;

public class J02013_SXNoiBot {
    public static void in(int[] a, int n){
        for(int i = 0;i < n; i++){
            System.out.printf("%d ", a[i]);
        }            
        System.out.println();
    }
    public static void sx(int[] a, int n){
        int i, j, t;
        boolean ok;
        for(i=0;i<n;i++){
            ok = true;
            for(j = 0;j < n-i-1; j++){
                if(a[j] > a[j+1]){
                    ok = false;
                    t = a[j]; a[j] = a[j+1]; a[j+1] = t;
                }
            }
            if(ok) break;
            System.out.printf("Buoc %d: ", i+1);
            in(a,n);
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = inp.nextInt();
        }
        sx(a, n);
    }
}
            
  
