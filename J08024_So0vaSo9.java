package Code_Ptit;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Queue;

public class J08024_So0vaSo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            Queue<Integer> q = new ArrayDeque<>();
            q.add(9);
            while(true){
                if(q.peek() % n == 0){
                    System.out.println(q.peek());
                    break;
                }
                else{
                    q.add(q.peek()*10);
                    q.add(q.peek() *10 + 9);
                    q.poll();
                }
            }
        }
    }
}
