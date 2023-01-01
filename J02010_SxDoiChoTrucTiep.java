package CODE_PTIT;

import java.util.Scanner;

public class J02010_SxDoiChoTrucTiep {
    public static void in(int[] a, int n){
        for(int i = 0;i < n; i++){
            System.out.printf("%d ", a[i]);
        }            
        System.out.println();
    }
    public static void sx(int[] a, int n){
        int i,j,t;
        for(i = 0;i < n-1; i++){
            for(j = i+1;j < n; j++){
                if(a[i] > a[j]){
                    t = a[i]; a[i] = a[j]; a[j] = t;
                }
            }
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
