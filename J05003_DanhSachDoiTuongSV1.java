package oopbasic;

import java.util.Scanner;
import java.util.ArrayList;

class Student {

    private String id, name, lop, date;
    private double gpa;

    public Student(int i, String name, String lop, String date, double gpa) {
        String tmp = Integer.toString(i);
        while (tmp.length() < 3) {
            tmp = "0" + tmp;
        }
        this.id = "B20DCCN" + tmp;
        this.name = name;
        this.lop = lop;
        this.gpa = gpa;
        if (date.charAt(1) == '/') {
            date = "0" + date;
        }
        if (date.charAt(4) == '/') {
            date = date.substring(0, 3) + "0" + date.substring(3);
        }
        this.date = date;
    }

    public void outp() {
        System.out.printf("%s %s %s %s %.2f\n", this.id, this.name, this.lop, this.date, this.gpa);
    }
}

public class J05003_DanhSachDoiTuongSV1 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        ArrayList<Student> a = new ArrayList<Student>();
        int n = inp.nextInt();
        for (int i = 1; i <= n; i++) {
            inp.nextLine();
            Student s = new Student(i, inp.nextLine(), inp.next(), inp.next(), inp.nextDouble());
            a.add(s);
        }
        for (int i = 0; i < a.size(); i++) {
            a.get(i).outp();
        }
    }
}
