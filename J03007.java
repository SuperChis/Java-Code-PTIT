
package CODE_PTIT;
import java.util.Scanner;

public class J03007 {
    public static int check1(String s){
        if(s.charAt(0) != '8' && s.charAt(s.length()-1) != 8) return 0;
        return 1;
    }
    public static int check2(String s){
        int sum1 = 0;
        for(int i = 0; i < s.length(); i++){
            sum1 += (s.charAt(i) - '0'); 
        }
        if(sum1 % 10 == 0) return 1;
        return 0;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t;
        t = Integer.parseInt(inp.nextLine());
        while(t-- > 0){
           String s = inp.nextLine();
           if(check1(s) == 1 && check2(s) == 1){
               System.out.println("YES");
           }
           else{
               System.out.println("NO");
           }
          
        }
    }
}
