
package CODE_PTIT;

import java.util.*;

public class J02037_DayUuThe {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = Integer.parseInt(inp.nextLine());
        while(t-- > 0){
            String s = inp.nextLine();
            String res[] = s.split("\\s");
            int cnt1 = 0, cnt2 = 0;
            for(int i = 0; i <  res.length; i++){
                if(Integer.parseInt(res[i]) % 2 == 0){
                    cnt1++;
                }
                else   
                    cnt2++;
            }
            if((cnt1 > cnt2 && res.length % 2 == 0) ||
               (cnt1 < cnt2 && res.length % 2 != 0))
                System.out.println("YES");
            else 
                System.out.println("NO");
        }
        
               
    }
}
