
package CODE_PTIT;

import java.util.*;
public class J03040 {
    public static int Check1(String s){
        if((s.charAt(5) - '0') < (s.charAt(6) - '0') &&
            (s.charAt(6) - '0') < (s.charAt(7) - '0') &&
            (s.charAt(7) - '0') < (s.charAt(9) - '0') &&
             (s.charAt(9) - '0') < (s.charAt(10) - '0')) return 1;
        return 0;
    }
//    public static int Check2(String s){
//        if((s.charAt(5) - '0') == (s.charAt(6) - '0') &&
//            (s.charAt(6) - '0') == (s.charAt(7) - '0') &&
//            (s.charAt(7) - '0') == (s.charAt(9) - '0') &&
//             (s.charAt(9) - '0') == (s.charAt(10) - '0')) return 1;
//        return 0;
//    }
    public static int Check3(String s){
        if(s.charAt(5) == s.charAt(6) &&
            s.charAt(6) == s.charAt(7) &&
             s.charAt(9) == s.charAt(10)) return 1;
        return 0;
    }
    public static int Check4(String s){
        if(s.charAt(5) != '6' && s.charAt(5)!= '8' ||
            s.charAt(6) != '6' && s.charAt(6) != '8' ||
            s.charAt(7) != '6' && s.charAt(7)!= '8' ||
            s.charAt(9) != '6' && s.charAt(9)!= '8' ||
            s.charAt(10) != '6' && s.charAt(10)!= '8') return 0;
        return 1;
    }
   
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t;
        t = Integer.parseInt(inp.nextLine());
        while(t-- > 0){
           String s = inp.nextLine();
           if(Check1(s) == 1 || Check3(s) == 1
               || Check4(s) == 1){
               System.out.println("YES");
           }
           else{
               System.out.println("NO");
           }
          
        }
    }
}
