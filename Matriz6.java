/*
Matriz 6

0	1	2	3	4	5
6	7	8	9	10	11
12	13	14	15	16	17
 */
package matriz6;
import java.util.Arrays;
public class Matriz6 {

    public static void main(String[] args) {
        System.out.println("Matriz");
            
    int matriz [][] = new int [3][6];
    
        for (int i=0;i<matriz.length;i++)
            for (int j=0;j<matriz[i].length; j++){
                matriz [i][j] = j+i*6;
            }
        for (int i=0;i<matriz.length;i++){
            System.out.println(Arrays.toString(matriz[i]));
        }
    }
    
}
