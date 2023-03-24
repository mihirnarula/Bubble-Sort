// bubble sort
package bubblesortx;
import java.util.*;
public class BubbleSortX {

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
            System.out.println("Enter 10 values: ");
        for (int i = 0; i < 10; i++){
            a[i] = sc.nextInt();
        }
        for (int j = 0; j <= 9; j++)
            for (int x = 0; x < 9 - j; x++) {
                if (a[x] > a[x + 1]) {
                    int temp = a[x];
                    a[x] = a[x + 1];
                    a[x + 1] = temp;

                }


            }
        System.out.println("Sorted aray: ");
        for (int k = 0; k <= 9; k++)
            System.out.println(a[k]);

    }
}
    

