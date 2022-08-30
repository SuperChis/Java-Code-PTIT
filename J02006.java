
package CODE_PTIT;

import java.util.*;

public class J02006 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n, m;
        n = inp.nextInt();
        m = inp.nextInt();
        int[] a =  new int[n];
        int[] b =  new int[m];
        TreeSet<Integer> s = new TreeSet<>();
        for(int i = 0; i < n+m; i++){
            s.add(inp.nextInt());
        }
        for(long i : s){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
