import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String args[]) {

//        int a[] = {7, 4, 10, 8, 3, 1};
//        int n = a.length;
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - 1 - i; j++) {
//                if (a[j] > a[j + 1]){
//                    int temp = a[j];
//                    a[j] = a[j+1];
//                    a[j+1] = temp;
//
//                }
//            }
//        }
//        System.out.println(Arrays.toString(a));



        Scanner s = new Scanner(System.in);

        System.out.println("Enter number of elements in array: ");
        int n = s.nextInt();

        System.out.println("Enter elements of array: ");
        int a[] = new int[n];
        for(int k=0; k<n; k++){
            a[k] = s.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;

                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
