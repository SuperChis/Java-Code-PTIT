package CODE_PTIT;

import java.util.*;
import java.lang.*;

public class J03005 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = Integer.parseInt(inp.nextLine());
        while (t-- > 0) {
            String s = inp.nextLine();
            s = s.toLowerCase();
            String res[] = s.split("\\s+");
            List<String> list = new ArrayList<>();
            for(String x : res){
                if(x.length() > 0){
                    list.add(x);
                }
         
            }
            for (int i = 1; i < list.size(); i++) {
                StringBuilder sb = new StringBuilder(list.get(i));
                sb.setCharAt(0, (char)(list.get(i).charAt(0) - 32));
                if(i == list.size() - 1) 
                    System.out.print(sb + ", ");
                else 
                    System.out.print(sb + " ");
            }
            StringBuilder sb = new StringBuilder(list.get(0));
            for(int i = 0; i < sb.length(); i++){
                sb.setCharAt(i, (char)(list.get(0).charAt(i) - 32));
            }
            System.out.print(sb);
            System.out.println();
        }
    }
}
