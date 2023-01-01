package CODE_PTIT;

import java.util.*;
import java.lang.*;

public class J03024 {
    public static int Check1(String s){
        if(s.charAt(0) == '0') return 0;
        for(int i = 0; i < s.length(); i++){
            if((s.charAt(i) - '0') < 0 || (s.charAt(i) - '0') > 9) return 0;
        }
        return 1;
    }
    public static int Check(String s){  
        int cntL = 0, cntC = 0;     
        for(int i = 0; i < s.length(); i++){
            if((s.charAt(i) - '0') % 2 == 0){ 
                cntC++;
            }
            else cntL++;
            
        }
        if(cntC < cntL && s.length() % 2 != 0){
            return 1;
        }
        else if(cntC > cntL && s.length() % 2 == 0){
            return 1;
        }
        else return 0;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = Integer.parseInt(inp.nextLine());
        while(t-- > 0){
            String s = inp.nextLine();
            if(Check(s) == 1 && Check1(s) == 1){
                System.out.printf("YES\n");
            }
            else if(Check1(s) == 0){
                System.out.println("INVALID");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
