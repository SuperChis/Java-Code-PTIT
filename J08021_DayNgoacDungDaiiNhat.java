package Code_Ptit;

import java.util.*;

public class J08021_DayNgoacDungDaiiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            Stack<Integer> st = new Stack<>();
            st.add(-1);
            int res = 0;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '(') st.add(i);
                else{
                    st.pop();
                    if(st.size() != 0) res = Math.max(res, i-st.peek());
                    else st.add(i);
                }
            }
            System.out.println(res);
        }
    }
}
