
package CODE_PTIT;

import java.util.*;
import java.lang.*;

public class J03025 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = Integer.parseInt(inp.nextLine());
        while(t-- > 0){
            String s = inp.nextLine();
            int cnt = 0;
            int l = 0, r = s.length()-1;
            while(l < r){
                if(s.charAt(l) != s.charAt(r)){
                    cnt++;
                }
                l++;
                r--;
            }
            if(s.length() % 2 == 0 && cnt == 1 ||
               s.length() % 2 != 0 && cnt <= 1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
