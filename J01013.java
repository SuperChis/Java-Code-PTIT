
package CODE_PTIT;

import java.util.Scanner;
public class J01013 {
    static int a[] = new int[2000001];
    public static void Process() {
        for (int i = 2; i * i <= 2000000; i++){
            if (a[i] == 0){
                for (int j = i * i; j <= 2000000; j += i){
                    a[j] = i;
                }
            }           
        }    
        for(int i = 2; i <= 2000000; i++){
            if (a[i] == 0){
                a[i] = i;
            }    
        }       
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Process();
        long s = 0;
        int t = inp.nextInt();
        while (t-- > 0) {
            int n = inp.nextInt();
            while (n != 1) {
                s += a[n];
                n /= a[n];
            }
        }
        System.out.print(s);
    }
}
