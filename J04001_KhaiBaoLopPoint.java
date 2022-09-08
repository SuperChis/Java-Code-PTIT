
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

public class J04001_KhaiBaoLopPoint {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        while(t-- > 0){
            Point a = new Point(inp.nextDouble(), inp.nextDouble());
            Point b = new Point(inp.nextDouble(), inp.nextDouble());
            System.out.printf("%.4f\n", a.distance(b));
        }
    }
}
