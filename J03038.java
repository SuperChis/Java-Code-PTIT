
package CODE_PTIT;

import java.util.*;

public class J03038 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Set<Character> se = new HashSet<>();
        String s = inp.nextLine();
        for(int i = 0; i < s.length(); i++){
            se.add(s.charAt(i));
        }
         System.out.println(se.size());       
    }
}
