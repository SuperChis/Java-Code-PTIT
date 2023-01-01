
package CODE_PTIT;

import java.util.*;
import java.lang.*;

public class J03010 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = Integer.parseInt(inp.nextLine());
        Map<String, Integer> map = new HashMap<String, Integer>();
        while(t-- > 0){
            String str = inp.nextLine();
            String tmp[] = str.toLowerCase().split("\\s");
            String s = "";
            for(int i = tmp.length - 1; i >= 0; i--){
                if(tmp[i].length() > 0){
                    s = tmp[i];
                    break;
                }
            }
            for(int i = 0; i < tmp.length - 1; i++){
                if(tmp[i].length() > 0)
                    s += tmp[i].charAt(0);
            }
            if(map.containsKey(s)){
                int cnt = map.get(s);
                cnt++;
                map.put(s, cnt);
                System.out.print(s + map.get(s));
            }
            else{
            	map.put(s, 1);
                System.out.print(s);
            }
            System.out.print("@ptit.edu.vn");
            System.out.println();
        }    
    }
}
