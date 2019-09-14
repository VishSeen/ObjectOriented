import enumeration.EnumClass;
import interfaces.Interface;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        //draw interface
        drawUserInterface();

        EnumClass enumClass = new EnumClass();
    }


    /**
     * This function draws all the interfaces
     */
    public static void drawUserInterface(){
        System.out.println("--------------------------------------------------------");
        System.out.println("Welcome to Java Programming: Object Oriented Programming");
        System.out.println("--------------------------------------------------------");

        System.out.println("");
        System.out.println("");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int scannerInt = scanner.nextInt();



        Interface inter = new Interface();
    }
}
