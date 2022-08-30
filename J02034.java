package CODE_PTIT;

import java.util.*;

public class J02034 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] a = new int[205];
        int ok = 0, s = 0;
        for(int i = 0; i < n; i++){
            int x = inp.nextInt();
            a[x]++;
            if(s < x) s = x;
        }
        for(int i = 1; i < s; i++){        
            if(a[i] == 0){
                ok = 1;
                System.out.println(i);
            }
        }
        if(ok == 0){
            System.out.println("Excellent!");
        }
    }
}
