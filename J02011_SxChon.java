package CODE_PTIT;

import java.util.Scanner;

public class J02011_SxChon {
    public static void in(int[] a, int n){
        for(int i = 0;i < n; i++){
            System.out.printf("%d ", a[i]);
        }            
        System.out.println();
    }
    public static void sx(int[] a, int n){
        int i, j ,t, min;
        for(i = 0;i < n-1; i++){
            min = i;
            for(j = i+1;j < n; j++){
                if(a[j] < a[min]) min = j;
            }
            t = a[i]; a[i] = a[min]; a[min] = t;
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
