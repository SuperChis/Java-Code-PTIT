package CODE_PTIT;

import java.awt.BorderLayout;
import java.lang.*;
import java.util.*;

public class J03009 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = Integer.parseInt(inp.nextLine());
        while (t-- > 0) {
            Map<String, Integer> map = new HashMap<>();
            String s1 = inp.nextLine();
            String s2 = inp.nextLine();
            String tmp[] = s1.split("\\s+");
            String res[] = s2.split("\\s+");
            for (String x : res) {
                if (x.length() > 0) {
                    map.put(x, 1);
                }
            }
            List<String> list = new ArrayList<String>();
            for (String x : tmp) {
                if (x.length() > 0) {
                    if(!map.containsKey(x)){
                        list.add(x);
                        map.put(x, 1);
                    }
                }
            }
            Collections.sort(list);
            for(String x : list){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
