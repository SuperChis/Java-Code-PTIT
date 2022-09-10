
package oopbasic;

import java.util.Scanner;
import java.lang.Math;

 class PhanSo {

    private long tu;
    private long mau;

    public PhanSo() {
        this.tu = 1;
        this.mau = 1;
    }

    public PhanSo(long a, long b) {
        this.tu = a;
        this.mau = b;
    }

    public long getTu() {
        return this.tu;
    }

    public long getMau() {
        return this.mau;
    }
    
    public static long gcd(long a, long b){
        while(b != 0){
            long tmp  = a % b;
            a = b;
            b = tmp;
        }
        return a;
    } 
    public void result(){
        long tmp = gcd(this.tu, this.mau);
        this.tu /= tmp;
        this.mau /= tmp;
    }
}
public class J04003_PhanSo {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = 1;
        while(t-- > 0){
            long n = inp.nextLong();
            long m = inp.nextLong();
            PhanSo a = new PhanSo(n, m);
            a.result();
            System.out.println(a.getTu() + "/" + a.getMau());
        }
    }
}
