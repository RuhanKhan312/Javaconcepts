import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class ClassandObjects {

    Scanner s = new Scanner(System.in);

//    System.out.print("Enter a number");
    int a = s.nextInt();
    int b = s.nextInt();


    public static void main(String args[]){

        ClassandObjects obj = new ClassandObjects();

        System.out.println(obj.a);

        //Addition
        System.out.println(obj.a + obj.b);

        //Percentage
        System.out.println(obj.a * 100/(obj.a+obj.b) );

        //Average
        System.out.println((obj.a + obj.b)/2);

    }
}
