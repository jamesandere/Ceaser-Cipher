
import java.util.Scanner;

public class App{
    public static void main(String[] args){
//        Console myConsole = System.console();
        Scanner myObj = new Scanner(System.in);
//        Encrypt encry = new Encrypt();
//        Decrypt decry = new Decrypt();
        System.out.println("Welcome to Caesar Cipher!");
//        String App = myConsole.readLine();
        System.out.println("***What's it all about?***");
        System.out.println("It is a type of substitution cipher in which each letter in the plaintext is replaced by a letter some fixed number of positions down the alphabet.");
        String word = myObj.nextLine();
        System.out.println("Enter 1 to encrypt");
        System.out.println("Enter 2 to decrypt");
        int pick = myObj.nextInt();
        if(pick==1){
            System.out.println("Enter word to encrypt");
//            String input = new String();
            String input = myObj.next();
            System.out.println("Enter key to shift letters");
            int move = myObj.nextInt();
//            String resultEncryp = caesar.encrypt(input, move);
//             System.out.println(resultEncryp);
        }
        else if(pick==2){
            System.out.println("Enter word to decrypt");
            String input = myObj.next();
            System.out.println("Enter key to shift letters");
            int move = myObj.nextInt();
//            String resultDecryp = cipher.decrypt(input, move);
//            System.out.println(resultDecryp);
        }
        else {
            System.out.println("Invalid choice");
        }
    }
}

    }
}