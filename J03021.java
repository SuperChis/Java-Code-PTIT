package CODE_PTIT;

import java.util.Scanner;

public class J03021 {

    public static void main(String[] args) {
        Scanner inp = new Scanner((System.in));
        int t = Integer.parseInt(inp.nextLine());
        int a[] = {2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9};
        while (t-- > 0) {
            String s = inp.nextLine().toLowerCase();
            String tmp = "";
            for (int i = 0; i < s.length(); i++) {
                String s1 = Integer.toString(a[s.charAt(i) - 'a']);
                tmp = tmp + s1;
            }
            if (tmp.compareTo(new StringBuilder(tmp).reverse().toString()) == 0) {
                System.out.println("YES");
            } 
            else {
                System.out.println("NO");
            }
        }
    }
}
