import java.util.Scanner;

public class vowelandConsonant {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an alphabet: ");
        char word = s.next().charAt(0);
        char ch = Character.toLowerCase(word);

        if(ch =='a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u'){
            System.out.println("It is a vowel");
        }
        else if((ch>='a' && ch >= 'z') || (ch>='A' && ch>='Z') ){
            System.out.println("It is a consonant");
        }

        else{
            System.out.println("It is not an alphabet");
        }
    }
}
