//
//public class Inheritance {
//    int a = 10;
//}
//class Pqr extends Inheritance {
//    int b = 20;
//    int sum = a+b;
//    int sub = b-a;
//    int multiplication = a*b;
//    int division = b/a;
//
//    public static void main(String args[]) {
//        Pqr obj = new Pqr();
//        System.out.println(obj.sum);
//        System.out.println(obj.a + obj.b);
//        System.out.println(obj.b - obj.a);
//        System.out.println(obj.sub);
//        System.out.println(obj.multiplication);
//        System.out.println(obj.division);
//    }
//}

public class Inheritance{
    int a = 10;
}
    class BB extends Inheritance{
    int b = 20;
    }
    class CC extends BB{
    int c = 30;
    }
    class DD extends CC{
    int d = 40;

    public static void main(String args[]){
        DD obj = new DD();
        System.out.println(obj.a + obj.b + obj.c + obj.d);
        System.out.println(obj.b - obj.b);
        System.out.println(obj.a - obj.c - obj.d);
    }
    }
