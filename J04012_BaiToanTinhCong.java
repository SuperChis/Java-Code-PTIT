
package oopbasic;

import java.util.*;
class Staff{
    private String id, name, cv;
    private int lcb,lt,thuong, pc, snc, tn;
    public Staff(String name, int lcb, int snc, String cv){      
        this.id = "NC01";
        this.name = name;
        this.lcb = lcb;
        this.snc = snc;
        this.lt = this.lcb * this.snc;
        if(this.snc >= 25){
            this.thuong = this.lt / 5;
        }
        else if(this.snc < 25 && this.snc >= 22){
            this.thuong = this.lt / 10;
        }
        else{
            this.thuong = 0;
        }
        this.cv = cv;
        if(this.cv.charAt(0) == 'G'){
            this.pc = 250000;
        }
        else if(this.cv.charAt(0) == 'P'){
            this.pc = 200000;
        }
        else if(this.cv.charAt(0) == 'T'){
            this.pc = 180000;
        }
        else{
            this.pc = 150000;
        }
        this.tn = this.lt + this.thuong + this.pc;
    }
    public void outp(){
        System.out.println(this.id + " " + this.name + " " + this.lt + " " + this.thuong + " " + this.pc + " " +this.tn);
    }
}
        
public class J04012_BaiToanTinhCong {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Staff a = new Staff(inp.nextLine(), inp.nextInt(), inp.nextInt(), inp.next());
        a.outp();
    }
}
