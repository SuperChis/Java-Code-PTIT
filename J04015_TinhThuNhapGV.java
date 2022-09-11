package oopbasic;

import java.util.*;

class Teacher{
    private String id, name;
    private int hsl, pc, lcb, tn;
    public Teacher(String id, String name, int lcb){
        this.name = name;
        this.id = id;
        this.lcb = lcb;
        
        if(id.charAt(1) == 'T'){
            this.pc = 2000000;
        }
        if(id.charAt(1) == 'P'){
            this.pc = 900000;
        }
        if(id.charAt(0) == 'G'){
            this.pc = 500000;
        }
        String tmp2 = id.substring(2);
        this.hsl = Integer.parseInt(tmp2);
        this.tn = this.hsl * this.lcb + this.pc;
        
    }
    public void outp(){
        System.out.printf("%s %s %d %d %d", this.id, this.name, this.hsl, this.pc, this.tn);
    }
}
public class J04015_TinhThuNhapGV {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Teacher a = new Teacher(inp.nextLine(), inp.nextLine(), inp.nextInt());
        a.outp();
    }
}
