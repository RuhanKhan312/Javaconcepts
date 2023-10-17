//
//public class Method2 {
//    int a = 10;
//    int b = 20;
//
//    void s(int c, int d){
//        System.out.println(a + " " + c);
////        System.out.println(e);
//    }
//
//    void t(int e, int f){
//        System.out.println(b);
//        System.out.println(f);
////        System.out.println(d);
//    }
//
//    public static void main(String args[]){
//        Method2 ab = new Method2();
//        ab.s(10,20);
//        ab.t(30,40);
//    }
//}
//Parents ki property dono child me jaa skti hy but child apni property
// parents ke siva dusre child k sth share nhi kr skte

//public class Method2{
//    int a = 10;
//    int b = 20;
//
//    void s(int c, int d){
//        System.out.println(a+b+c+d);
//    }
//
//    void t(int e, int f){
//        System.out.println(a+b+e+f);
//    }
//
//    public static void main(String args[]){
//        Method2 ab = new Method2();
//        ab.s(30,40);
//        ab.t(50,60);
//    }
//}

//public class Method2{
//    void Average(int a, int b, int c, int d, int e){
//        System.out.println("Average is: " + (a+b+c+d+e)/5);
//    }
//
//    public static void main(String args[]){
//        Method2 obj = new Method2();
//        obj.Average(10,20,30,40,50);
//    }
//}

//public class Method2{
//    void a(int a){
//        System.out.println("Square is: " + a*a);
//        System.out.println("Cube is: " + a*a*a);
//    }
//
//    public static void main(String args[]){
//        Method2 obj = new Method2();
//        obj.a(2);
//    }
//}
//import java.util.Scanner;
//public class Method2{
//
//    Scanner s = new Scanner(System.in);
//    void Add(int a, int b){
//        System.out.print("Enter any number: ");
//        a = s.nextInt();
//        System.out.print("Enter any number: ");
//        b = s.nextInt();
//        System.out.println("Sum is: " + (a+b));
//
//    }
//    void Substract(int a, int b){
//        System.out.println("Enter any number: ");
//        int a = s.nextInt();
//        System.out.println("Enter any number: ");
//        int b = s.nextInt();
//        System.out.println("Sub is: " + (a-b));
//    }
//
//    public static void main(String args[]){
//        Method2 obj = new Method2();
//        obj.Add(10,20);
//        obj.Substract(30,40);
//    }
//
//}

import java.util.Scanner;
//public class Method2{
//
//    void Add(int a, int b){
//        System.out.println("Sum is: " + (a+b));
//
//    }
//    void Substract(int a, int b){
//        System.out.println("Sub is: " + (a-b));
//    }
//
//    public static void main(String args[]){
//        Scanner s = new Scanner(System.in);
//
//        System.out.println("Enter value of a: ");
//        int a = s.nextInt();
//
//        System.out.println("Enter value of b: ");
//        int b = s.nextInt();
//
//        Method2 obj = new Method2();
//        obj.Add(a,b);
//        obj.Substract(a,b);
//
//    }
//
//}

//public class Method2{
//    String a;
//    String b;
//    String c;
//    String d;
//
//    Method2(String e, String f, String g, String h){
//        a = e;
//        b = f;
//        c = g;
//        d = h;
//    }
//
//    void display(){
//        System.out.println(a + ", " + "I am" + b + "." + "I live in " + c + "." + "I have completed " + d + ".");
//    }
//
//    public static void main(String args[]){
//        Method2 ab = new Method2("Hello", " Ruhan", "Nagpur", "B.Tech");
//        ab.display();
//
//    }
//}

//public class Method2{
//
//    void Add(){
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter first number: ");
//        int a = s.nextInt();
//
//        System.out.print("Enter second number: ");
//        int b = s.nextInt();
//
//        int sum = a + b;
//        System.out.println("Sum is: " + sum);
//
//        AgainEnter();
//
//    }
//    void AgainEnter(){
//        Scanner s = new Scanner(System.in);
//        System.out.println("Again Enter: ");
//        String yes = s.next();
//        if(yes.equals("Yes")){
//            Add();
//        }
//        else{
//            System.out.println("Exiting ");
//        }
//    }
//
//
//    public static void main(String args[]){
//
//        Method2 obj = new Method2();
//        obj.Add();
//
//    }
//}

public class Method2{
    void fun1(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a choice: ");
        int userChoice = s.nextInt();

        if(userChoice==1){
            Square();
        }
        else if(userChoice==2){
            Cube();
        }
        else if(userChoice==3){
            Percent();
        }
        else if(userChoice==4){
            Average();
        }
        AgainEnter();
    }

    void Square(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int a = s.nextInt();
        System.out.println("Square is: " + (a*a));
    }
    void Cube(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int b = s.nextInt();
        System.out.println("Cube is: " + (b*b*b));
    }

    void Percent(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter obtained marks: ");
        int c = s.nextInt();
        System.out.println("Enter total marks: ");
        int d = s.nextInt();
        System.out.println("Percent is: " + ((c*100)/d));
    }
    void Average(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int e = s.nextInt();
        System.out.println("Enter second number: ");
        int f = s.nextInt();

        System.out.println("Average is: " + ((e+f)/2));
    }

    void AgainEnter(){
        Scanner s = new Scanner(System.in);
        System.out.print("Again Enter: ");
        String yes = s.next();
        if(yes.equals("Yes")){
            fun1();
        }
        else{
            System.out.println("Exiting");
        }
    }

    public static void main(String args[]){
        Method2 obj = new Method2();
        obj.fun1();
    }
}
