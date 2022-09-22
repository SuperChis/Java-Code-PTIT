
package oopbasic;

import java.util.Scanner;
class PhanSo {

    private long tu;
    private long mau;

    public PhanSo(long a, long b) {
        this.tu = a;
        this.mau = b;
    }
    public long getTu() {
            return tu;
    }

    public long getMau() {
            return mau;
    }
    
    public static long gcd(long a, long b){
        while(b != 0){
            long tmp  = a % b;
            a = b;
            b = tmp;
        }
        return a;
    } 
    
      public void setTu(int tu) {
        this.tu = tu;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }
    public static long lcm(long a, long b){
        return a * b / gcd(a, b);
    }
    public void result(){
        long tmp = gcd(this.tu, this.mau);
        this.tu /= tmp;
        this.mau /= tmp;
    }
    public void process(PhanSo b){
        long res = lcm(this.mau, b.mau);
        long tuC = this.getTu()*(res/this.getMau()) + b.getTu()*(res/b.getMau());
//        a.setTu(a.getTu()*(res/a.getMau()) + b.getTu()*(res/b.getMau()));
//        a.setMau(res);
        PhanSo c = new PhanSo(tuC*tuC,res*res);
        c.result();
        PhanSo d = new PhanSo(this.getTu() * b.getTu() * c.getTu(), this.getMau() * b.getMau() * c.getMau());
        d.result();
        System.out.println(c.getTu() + "/" + c.getMau() + " " + d.getTu() + "/" + d.getMau());
    }
}
public class J04014_TinhToanPhanSo {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        while(t-- > 0){
            PhanSo a = new PhanSo(inp.nextLong(), inp.nextLong());
            PhanSo b = new PhanSo(inp.nextLong(), inp.nextLong());
            a.process(b);
        }
    }
}
