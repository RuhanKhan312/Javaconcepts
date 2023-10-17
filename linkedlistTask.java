import java.util.LinkedList;
import java.util.Scanner;

public class linkedlistTask {
    public static void main(String args[]) {


        LinkedList<String> anifruit = new LinkedList<>();

        anifruit.add("Elephant");
        anifruit.add("Apple");
        anifruit.add("Tiger");
        anifruit.add("Banana");
        anifruit.add("Lion");
        anifruit.add("Mango");

        System.out.println(anifruit);

        Scanner s = new Scanner(System.in);
        System.out.print("Select you want animal or fruit: 1. Animal 2. Fruit : ");
        int n1 = s.nextInt();

        if(n1==1){
            System.out.println("Animals are: ");
            for(int i=0; i<6; i++){

                System.out.println(anifruit.get(i));
                i++;

            }
        }

        if(n1==2){
            System.out.println("Fruits are: ");
            for(int i=1; i<6; i++){

                System.out.println(anifruit.get(i));
                i++;
            }
        }
    }
}
