package CODE_PTIT;

import java.util.*;

public class J03004 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = Integer.parseInt(inp.nextLine());
        while (t-- > 0) {
            String s = inp.nextLine();
            s = s.toLowerCase();
            System.out.println(s);
            String[] res = s.split("\\s+");
            StringBuilder builder = new StringBuilder();
            for (String i : res) {
                if (i.length() > 0) {
                    char[] C = i.toCharArray();
                    C[0] = Character.toUpperCase(C[0]);
                    builder.append(new String(C));
                    builder.append(" ");
                }
            }
            String ans = builder.toString().trim();
            System.out.println(ans);
        }
    }
}
