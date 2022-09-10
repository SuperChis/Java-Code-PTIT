
package oopbasic;

import java.util.Scanner;
import java.lang.Math;

 class Rectange {

    private double width;
    private double height;
    private String color;

    public Rectange() {
        this.height = 1;
        this.width = 1;
    }

    public Rectange(double a, double b, String s) {
        this.width = a;
        this.height = b;
        s = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
        this.color = s;
    }
    public int check(){
        if(this.height <= 0 || this.width <= 0 || 
           this.height != (int)this.height || this.width != (int)this.width)
            return 0;
        return 1;
    }
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setColor(String color) {
        this.color = color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
    }
    public double findArea(){
        return this.width * this.height;
    }
    public double findPerimeter(){
        return (this.height + this.width) * 2;
    }
}
public class J04002_KhaiBaoLopHCN {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = 1;
        while(t-- > 0){
            double n = inp.nextDouble();
            double m = inp.nextDouble();
            String s = inp.next();
            Rectange a = new Rectange(n, m, s);
//            a.setColor(s);
            if(a.check() == 1){
                System.out.print((int)a.findPerimeter() + " " + (int)a.findArea() + " " + a.getColor());
            }
            
            else{
                System.out.println("INVALID");
            }
        }
    }
}
