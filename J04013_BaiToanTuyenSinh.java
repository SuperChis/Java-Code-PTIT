package oopbasic;

import java.util.*;
import java.text.DecimalFormat;

class Student {
     private String id, name;
     private double d1, d2, d3, d4, sumg;
     private String tinhTrang;
     public Student(String a, String b, double d1, double d2, double d3){
         this.id = a;
         this.name = b;
         this.d1 = d1;
         this.d2 = d2;
         this.d3 = d3;
         if(this.id.charAt(2) == '1'){
             this.d4 = 0.5;
         }
         else if(this.id.charAt(2) == '2'){
             this.d4 = 1.0;
         }
         else{
             this.d4 = 2.5;
         }
         this.sumg = d1*2 + d2 + d3;
         if(this.sumg + this.d4 >= 24){
             this.tinhTrang = "TRUNG TUYEN";
         }  
         else{
             this.tinhTrang = "TRUOT";
         }
             
     }
     public void outp(){
         System.out.print(this.id + " " + this.name + " " + new DecimalFormat("0.#").format(this.d4) + " " + new DecimalFormat("0.#").format(this.sumg) + " " + this.tinhTrang);
     }
}

public class J04013_BaiToanTuyenSinh {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Student a = new Student(inp.nextLine(), inp.nextLine(), inp.nextDouble(), inp.nextDouble(), inp.nextDouble());
        a.outp();
    }
}

