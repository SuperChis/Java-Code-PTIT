package J05011;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
class Person implements Comparable<Person>{
    private String id, name, t_in, t_out, t_use;
    private int hours, Minutes;
    Person(String id, String name, String tin, String tout){
        this.id = id;
        this.name = name;
        this.t_in = tin;
        this.t_out = tout;
        int m1 = Integer.parseInt(tin.substring(3, 5));
        int m2 = Integer.parseInt(tout.substring(3, 5));
        int minutes, hour;
        int hour1 = Integer.parseInt(tout.substring(0, 2)) - Integer.parseInt(tin.substring(0,2));
        m2 += 60 * hour1;
        int minu = m2 - m1;
        hour = minu / 60;
        minutes = minu % 60;
        this.hours = hour;
        this.Minutes = minutes;
        this.t_use = Integer.toString(hour) + " gio " + Integer.toString(minutes) + " phut";
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return Minutes;
    }

    public String getTuse() {
        return this.t_use;
    }
    
    @Override
    public int compareTo(Person o) {
        if(this.hours < o.getHours()) return 1;
        else if(this.hours == o.getHours()){
            if(this.Minutes < o.getMinutes()) return 1;
        }
        return -1;
    }
    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.t_use;
    }
}

public class J05011_TinhGio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Person> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String id = sc.next();
            sc.nextLine();
            String name = sc.nextLine();
            String t_in = sc.next();
            String t_out = sc.next();
            Person p = new Person(id, name, t_in, t_out);
            a.add(p);
        }
        Collections.sort(a);
        for(Person x : a){
            System.out.println(x.toString());
        }
    }
}
