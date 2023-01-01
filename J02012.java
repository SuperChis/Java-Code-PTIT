package CODE_PTIT;

import java.util.Scanner;

public class J02012 {
    public static void in(int[] a, int n){
        for(int i = 0;i < n; i++){
            System.out.printf("%d ", a[i]);
        }            
        System.out.println();
    }
    public static void sx(int[] a, int n){
        int i,j,x;
        System.out.printf("Buoc 0: %d\n", a[0]);
        for(i = 1;i < n; i++){
            x = a[i]; j = i-1;
            while(j >= 0 && a[j] > x){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = x;
            System.out.printf("Buoc %d: ", i);
            in(a,i+1);
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
