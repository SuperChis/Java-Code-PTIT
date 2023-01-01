
package CODE_PTIT;

import java.util.*;
import java.lang.*;

public class J02026 {
    static ArrayList<Integer> a = new ArrayList<>();
    static int b[] = new int[15];
    static int c[] = new int[15];
    static void in(int n){
        for(int i = 1; i <= n; i++){
            System.out.print(a.get(i-1) + " ");
        }
        System.out.println();
    }
    static void Try(int i, int n, int k){
        for(int j = b[i-1] + 1; j <= n-k+1; j++){
            c[i] = a.get(j-1);
            if(i == k) in(k);
            else{
                Try(i+1,n,k);
            }
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        while(t-- > 0){
            int n = inp.nextInt();
            int k = inp.nextInt();
            for(int i = 1; i <= n; i++){
                int x = inp.nextInt();
                a.add(x);
            }
            Collections.sort(a);
            Try(1,n,k);
        }
    }
}
