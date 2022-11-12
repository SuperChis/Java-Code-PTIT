
package Code_Ptit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class SoLocPhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            Queue<String> q = new LinkedList<>();
            q.add("6");
            q.add("8");
            ArrayList<String> al = new ArrayList<>();
            while(true){
                String tmp = q.peek();
                al.add(tmp);
                q.remove();
                if(tmp.length() <= n-1){
                    q.add(tmp + "6");
                    q.add(tmp + "8");
                }
                else break;
            }
            while(q.size() > 0){
                al.add(q.peek());
                q.remove();
            }
            System.out.println(al.size());
            for(int i = al.size() - 1; i >= 0; i--){
                System.out.print(al.get(i) + " ");
            }
            System.out.println();
        }
    }
}
