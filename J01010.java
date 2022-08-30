
package CODE_PTIT;

import java.util.Scanner;

public class J01010 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = Integer.parseInt(inp.nextLine());
        while(t-- > 0){
            String s = inp.nextLine();
            int ans = 0, ok = 1;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '1'){
                    ans = ans * 10 + 1;
                }
                else if(s.charAt(i) == '0' || s.charAt(i) == '8' || s.charAt(i) == '9'){
                    ans  = ans * 10;
                }
                else {
                    ok = 0;
                    break;
                }
            }
            if(ok == 0 || ans == 0){
                System.out.println("INVALID");
            }
            else{
                System.out.println(ans);

            }
        }
    }
}
