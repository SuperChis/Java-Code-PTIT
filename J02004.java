package CODE_PTIT;

import java.util.Scanner;

public class J02004 {
    public static boolean Check(int[] a, int n){
        int l  = 0, r = n-1;
        while(l < r){
            if(a[l] != a[r]) return false;
            l++; 
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        while(t-- > 0){
            int n;
            n  = inp.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = inp.nextInt();  
            }
            if(Check(a, n)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
