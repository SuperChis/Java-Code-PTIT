
package CODE_PTIT;

import java.util.Scanner;
import java.util.HashSet;

public class J03031 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = Integer.parseInt(inp.nextLine());
        while(t-- > 0){
           HashSet<Character> set = new HashSet<>();
           String s = inp.next();
           int k = inp.nextInt();
           for(int i = 0; i < s.length(); i++){
               set.add(s.charAt(i));
           }
           if(set.size() + k >= 26){
               System.out.println("YES");
           }
           else{
               System.out.println("NO");
           }
        }
    }
}
