
import java.util.Scanner;

public class App{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Welcome to Caesar Cipher!");
        System.out.println("***What's it all about?***");
        System.out.println("It is a type of substitution cipher in which each letter in the plaintext is replaced by a letter some fixed number of positions down the alphabet.");
        System.out.println("Please enter name to continue");
        String word = myObj.nextLine();
        System.out.println("Welcome " + word);
        System.out.println("Enter 1 to encrypt");
        System.out.println("Enter 2 to decrypt");
        int pick = myObj.nextInt();
        Caesar caes = new Caesar();
        Cipher ciph = new Cipher();
        if(pick==1){
            System.out.println("Enter word to encrypt");
            String input = myObj.next();
            System.out.println("Enter key to shift letters");
            int move = myObj.nextInt();
            System.out.println(caes.encrypt(input, move));
        }
        else if(pick==2){
            System.out.println("Enter word to decrypt");
            String input = myObj.next();
            System.out.println("Enter key to shift letters");
            int move = myObj.nextInt();
            System.out.println(ciph.decrypt(input, move)); 
        }
        else {
            System.out.println("Invalid choice");
        }
    }
}

