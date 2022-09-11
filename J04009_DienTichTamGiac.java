package oopbasic;

import java.util.Scanner;
import java.lang.Math;

class Point {
    private double x ;
    private double y;
    public Point(double a, double b){
        this.x = a;
        this.y = b;
    }
    
    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }
    
    public double distance(Point b){
        return Math.sqrt((this.x - b.x) * (this.x - b.x) + (this.y - b.y) * (this.y - b.y));
    }
    
    public double distance(Point a, Point b){
        return Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
    }
}
public class J04009_DienTichTamGiac {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        while(t-- > 0){
            Point p1 = new Point(inp.nextDouble(), inp.nextDouble());
            Point p2 = new Point(inp.nextDouble(), inp.nextDouble());
            Point p3 = new Point(inp.nextDouble(), inp.nextDouble());
            double a = p1.distance(p2);
            double b = p1.distance(p3);
            double c = p2.distance(p3);
            if(a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || c + b <= a){
                System.out.println("INVALID");
            }
            else{
                double ans = 0.25 * Math.sqrt((a+b+c) * (a+b-c) * (a-b+c) * (-a+b+c));
                System.out.printf("%.2f\n", ans);
            }
            
        }
    }
}
