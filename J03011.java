package CODE_PTIT;

import java.util.Scanner;
import java.math.BigInteger;

public class J03011 {
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = Integer.parseInt(inp.nextLine());     
        while(t-- > 0){
            BigInteger a = inp.nextBigInteger();
            BigInteger b = inp.nextBigInteger();
            System.out.println(a.gcd(b));
        }
    }
}
