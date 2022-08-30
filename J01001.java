
package CODE_PTIT;
import java.util.Scanner;

public class J01001 {
    public static void main(String[] args) {
        int a, b;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        if(a <= 0 || b <= 0){
            System.out.println("0");
        }  
        else{
            System.out.print((a+ b)*2);
            System.out.print(" ");
            System.out.print(a * b);
        }
    }   
}
   
