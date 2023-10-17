import java.util.Scanner;

public class ArrayTask {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int len = s.nextInt();
        int arr[] = new int[len];
        System.out.println("Enter " + len + " elements of array: ");

        for(int i=0; i<len; i++){
            arr[i] = s.nextInt();
        }

        System.out.println("Enter element you want to search: ");
        int element = s.nextInt();
        for(int j=0; j<len; j++){
            if(arr[j]==element){
                System.out.println("Element found at " + j + "th position");
            }
            else if(j==len-1){
                System.out.println("Element not found");
            }
        }

    }
}
