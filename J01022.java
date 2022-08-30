package CODE_PTIT;

import java.util.Scanner;

public class J01022 {
    static long[] a = new long[93];
    public static long fibo(int n, long k){
        if(n == 1) return 0;
        if(n == 2) return 1;
        if(k <= a[n-2]){ 
            return fibo(n-2, k);
        }
        else {
            return fibo(n-1, k - a[n-2]);
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        a[1] = 1;
        a[2] = 1;
        for(int i = 3; i <= 92; i++){
            a[i] = a[i-1] + a[i-2];
        }
        while(t-- > 0){
            int n = inp.nextInt();
            long k = inp.nextLong();
            System.out.println(fibo(n,k));
        }
    }
}
/*
2
6 4
8 19
*/
