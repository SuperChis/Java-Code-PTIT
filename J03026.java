package CODE_PTIT;

import java.util.Scanner;

public class J03026 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        String tmp = inp.nextLine();
        while(t-- > 0){
            String s1 = inp.nextLine();
            String s2 = inp.nextLine();
            if(s1.compareTo(s2) == 0){
                System.out.println("-1");
            }
            else{
                System.out.println(Math.max(s1.length(), s2.length()));
            }
        }
    }
}
