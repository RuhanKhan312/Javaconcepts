import java.util.Arrays;

public class TaskSorting {
    public static void main(String[] args){

//        String str = "aeA12U3z";
//
//        int count = 0;
//        int integerCount = 0;
//
//        for(int i=0; i<str.length(); i++){
//            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='A' || str.charAt(i)=='U' || str.charAt(i)=='z'){
//                count++;
//            }
//            else{
//                integerCount++;
//            }
//        }
//
//        System.out.println("Total number of characters are " + count);
//        System.out.println("Total number of integers are " + integerCount);
//

        int a[] = {11,5,2,7,11,11,11,2,7,7,7,7,7,5,2};
        int n = a.length;

        int count11 = 0;
        int count5 = 0;
        int count2 = 0;
        int count7 = 0;
        for(int r=0; r<a.length; r++){
            if(a[r]==11){
                count11++;
            }

            else if(a[r]==5){
                count5++;
            }
            else if(a[r]==2){
                count2++;
            }
            else if(a[r]==7){
                count7++;
            }

        }


        System.out.println("Count of 11 is " + count11);
        System.out.println("Count of 5 is " + count5);
        System.out.println("Count of 2 is " + count2);
        System.out.println("Count of 7 is " + count7);

        double multiple11 = 0;
        double multiple5 = 0;
        double multiple2 = 0;
        double multiple7 = 0;

        for(int i=0; i<a.length; i++) {
            if (a[i] == 11) {
                multiple11 = Math.pow(11, count11);
            }

            if (a[i] == 5) {
                multiple5 = Math.pow(5, count5);
            }

            if (a[i] == 2) {
                multiple2 = Math.pow(2, count2);
            }
            if (a[i] == 7) {
                multiple7 = Math.pow(7, count7);
            }

        }
        int Multiple11 = (int)multiple11;
        int Multiple5 = (int)multiple5;
        int Multiple2 = (int)multiple2;
        int Multiple7 = (int)multiple7;
        int arr[] = {Multiple11, Multiple5, Multiple2, Multiple7};
        //System.out.println(Arrays.toString(arr));
        int len = arr.length;

        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
        System.out.println(Arrays.toString(arr));



    }
}
