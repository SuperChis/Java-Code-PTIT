
package CODE_PTIT;

import java.util.*;

public class J02007 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t;
        t = inp.nextInt();
        for(int k = 1; k <= t; k++){ 
            Map<Integer, Integer> map = new LinkedHashMap<>();
            int n = inp.nextInt();
            for(int i = 0; i < n; i++){
                int x = inp.nextInt();
                if(map.containsKey(x)){
                    int cnt = map.get(x);
                    cnt++;
                    map.put(x, cnt);
                }
                else{
                    map.put(x, 1);
                }
            }
            System.out.println("Test " + k +":");
            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                System.out.println(entry.getKey() + " xuat hien " + entry.getValue() + " lan");
            }
        }
    }
}
