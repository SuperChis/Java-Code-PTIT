/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODE_PTIT;
import java.util.Scanner;
/*
 *
 * @author Acer
 */
public class J01002 
{
    public static void main(String[] args) {
        int t;
        Scanner in =  new Scanner((System.in));
        t = in.nextInt();
        while(t > 0){
            int n;
            n = in.nextInt();
            System.out.println(n*(n+1)/2);
            t--;
        }
            
    }
}
