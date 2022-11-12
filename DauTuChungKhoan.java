
package Code_Ptit;

import java.util.Scanner;
import java.util.Stack;

public class DauTuChungKhoan {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int a[] = new int[n+5];
            for(int i = 1; i <= n; i++){
                a[i] = sc.nextInt();
            }
            Stack<Integer> s = new Stack<>();
            s.push(0);
            a[0] = (int) (1e6 + 1);
            for(int i = 1; i <= n; i++){
                while(a[i] >= a[s.peek()] && s.size() > 0){
                    s.pop();
                }
                System.out.print(i - s.peek() + " ");
                s.push(i);
            }
            System.out.println();
        }
    }
}
