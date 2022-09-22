
package oopbasic;

import java.util.*;

class Student {
    private String id, name, lop, date;
    private double gpa;
    public Student(String name, String lop, String date, double gpa){
        this.id = "B20DCCN001";
        this.name = name;
        this.lop = lop;
        this.gpa = gpa;
        if(date.charAt(1) == '/'){
            date = "0" + date;
        }
        if(date.charAt(4) == '/'){
            date = date.substring(0, 3) + "0" + date.substring(3);
        }
        this.date = date;
    }
    public void outp(){
        System.out.printf("%s %s %s %s %.2f\n", this.id, this.name, this.lop, this.date, this.gpa);
    }
}
public class J04006_KhaiBaoLopSV {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Student a = new Student(inp.nextLine(), inp.next(), inp.next(), inp.nextDouble());
        a.outp();
    }
}
