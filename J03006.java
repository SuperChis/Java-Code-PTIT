
package CODE_PTIT;

import java.util.*;
/**
 *
 * @author Acer
 */
public class J03006 {
    public static int ThuanNghich(String s){
        int l = 0, r = s.length()-1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)) return 0;
            l++; r--;
        }
        return 1;
    }
    public static int EvenNum(String s){  
        for(int i = 0; i < s.length();i++){
            if((s.charAt(i) - '0') % 2 != 0 ) return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t;
        t = Integer.parseInt(inp.nextLine());
        while(t-- > 0){
           String s = inp.nextLine();
           if(ThuanNghich(s) == 1 && EvenNum(s) == 1){
               System.out.println("YES");
           }
           else{
               System.out.println("NO");
           }
          
        }
    }
}
