package CODE_PTIT;

import java.util.Scanner;

public class J02021 {
    public static int[] C = new int[15];
    public static int n, k , cnt = 0;
    public static void in(){
        for(int i = 1; i <= k; i++){
            System.out.printf("%d", C[i]);
        }
        System.out.printf(" ");
    }
    public static void Try(int i){
        for(int j = C[i-1] + 1; j <= n-k+i; j++){
           C[i]= j;
           if(i == k){
               cnt++;
               in();
           }
           else{
               Try(i+1);
           }
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        n = inp.nextInt();
        k = inp.nextInt();
        Try(1);
        System.out.println();
        System.out.println("Tong cong co " + cnt + " to hop");
    }
}
