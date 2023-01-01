package CODE_PTIT;

/**
 *
 * @author Acer
 */
import java.util.*;
public class J02105 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[][] a = new int[50][50];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = inp.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
            System.out.printf("List(%d) = ", i+1);
            for(int j = 0; j < n; j++){
                if(a[i][j] == 1){
                    System.out.printf("%d ", j+1);
                }
            }
            System.out.println();
        }
    }
        
}
