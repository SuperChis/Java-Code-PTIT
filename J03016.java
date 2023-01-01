
package CODE_PTIT;

import java.util.Scanner;
import java.math.BigInteger;

public class J03016 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        while(t-- > 0){
            BigInteger a = inp.nextBigInteger();
            BigInteger b = a.divide(new BigInteger("11"));
            if(a.compareTo(b.multiply(new BigInteger("11"))) == 0){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        }
    }
}
