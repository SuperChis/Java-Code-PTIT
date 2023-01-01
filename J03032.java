
package CODE_PTIT;

import java.util.Scanner;

public class J03032 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = Integer.parseInt(inp.nextLine());
        while(t-- > 0){
            String s = inp.nextLine();
            String tmp[] = s.split("\\s");
            for(String x : tmp){
                if(x.length() > 0){
                    StringBuilder sb = new StringBuilder(x);
                    System.out.print(sb.reverse().toString() + " ");
                }
            }
            System.out.println();
        }
    }
}
