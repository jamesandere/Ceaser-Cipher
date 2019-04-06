import java.io.Console;
import java.util.Scanner;

public class App{
    public static void main(String[] args){
//        Console myConsole = System.console();
        Scanner myObj = new Scanner(System.in);
        System.out.println("Welcome to Caesar Cipher!");
//        String App = myConsole.readLine();
        System.out.println("***What's it all about?***");
        System.out.println("It is a type of substitution cipher in which each letter in the plaintext is replaced by a letter some fixed number of positions down the alphabet.");
        String word = myObj.nextLine();
//        System.out.println("You chose " + App);
//        System.out.println("You chose " + word);
    }
}