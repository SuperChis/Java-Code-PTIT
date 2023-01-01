
package CODE_PTIT;

import java.util.*;
import java.math.BigInteger;

public class J03033 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        while(t-- > 0){
            BigInteger a = inp.nextBigInteger();
            BigInteger b = inp.nextBigInteger();
            System.out.println((a.multiply(b).divide(a.gcd(b))));
        }
    }
}
