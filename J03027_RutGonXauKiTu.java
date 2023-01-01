
package CODE_PTIT;

import java.util.Scanner;

public class J03027_RutGonXauKiTu {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        while(true){
            int ok = 0;
            for(int i = 0; i < s.length() - 1; i++){
                if(s.charAt(i) == s.charAt(i+1)){
                    s = s.substring(0, i) + s.substring(i+2);
                    ok = 1;
                    break;
                }
            }
            if(ok == 0) 
                break;
        } 
        if(s.length() == 0){
            System.out.println("Empty String");
        }
        else{
            System.out.println(s);
        }
    }
}
