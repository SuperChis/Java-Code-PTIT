package CODE_PTIT;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Acer
 */
public class J01003 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       Float a, b;
       a = in.nextFloat();
       b = in.nextFloat();
       if(a == 0 && b == 0){
           System.out.println("VSN");
       }
       else if(a == 0 && b > 0){
           System.out.println("VN");
       }
       else{
           System.out.printf("%.2f\n",(-b)/a);
       }
    }
       
}
