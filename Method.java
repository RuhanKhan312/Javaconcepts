//
//public class Method {
//    void function1(){
//        System.out.println("Default method");
//    }
//
//    static void function2(int a){
//        System.out.println(a);
//    }
//
//    public static void main(String args[]){
//        Method obj = new Method();
//        function2(20);
//        obj.function1();
//    }
//}

//public class Method{
//
//    void Method1(){
//        System.out.println("Default method");
//    }
//
//    void Method2(int b){
//        System.out.println(b);
//    }
//
//    void Method3(int c, int d){
//        System.out.println(c);
//        System.out.println(d);
//    }
//
//    void Method2(float e){
//        System.out.println(e);
//    }
//
//    void Method4(float f){
//        System.out.println(f);
//    }
//    void Method5(int a, int b){
//        System.out.println(a + b);
//    }
//
//    public static void main(String args[]){
//        Method obj = new Method();
//        obj.Method1();
//        obj.Method2(10);
//        obj.Method3(10,20);
//        obj.Method4(11.45F);
//        obj.Method5(12,13);
//    }
//}

public class Method{

    void Method(){
        System.out.println("Default method");
    }

    void Method(int b){
        System.out.println(b);
    }

    void Method(float f){
        System.out.println(f);
    }

    void Method(int a, float f){
        System.out.println(a);
        System.out.println(f);
    }

    void Abc(float f){
        System.out.println(f);
    }
    void Pqr(int a){
        System.out.println(a);
    }

    void Xyz(int a){
        System.out.println(a);
    }

    void Ruhan(int a){
        System.out.println(a);
    }

    void Faisal(float f){
        System.out.println(f);
    }

    public static void main(String args[]){
        Method obj = new Method();
        obj.Method();
        obj.Method(10);
        obj.Method(12.45F);
        obj.Method(25,14.23F);
        obj.Abc(3);
        obj.Pqr(11);
        obj.Xyz(8);
        obj.Ruhan(23);
        obj.Faisal(6.2F);
    }
}