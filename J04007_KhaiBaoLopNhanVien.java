
package oopbasic;

import java.util.*;
class Staff {
    private String id, name, gt, dc, date, mst, hd;
    public Staff(String name, String gt, String date, String dc, String mst, String hd){
        this.id = "00001";
        this.name = name;
        this.gt = gt;
        this.dc = dc;
        this.date = date;
        this.dc = dc;
        this.mst = mst;
        this.hd = hd;
    }
    public void outp(){
        System.out.printf("%s %s %s %s %s %s %s", this.id, this.name, this.gt, this.date, this.dc, this.mst, this.hd);
    }
}

public class J04007_KhaiBaoLopNhanVien {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String ten = inp.nextLine();
        String gt = inp.next();
        String ns =  inp.next();
        inp.nextLine();
        String addr = inp.nextLine();
        String mst = inp.next();
        String sd = inp.next();
        Staff a = new Staff(ten, gt, ns, addr, mst, sd);
        a.outp();
    }
}
