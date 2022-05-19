package Bankomat;
import java.io.Console;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class bankomat {



    public static void main(String[] args) {
            startPage();
        }

    public static void startPage(){
        System.out.println("Selektieren Sie die gewünschte Funktion");
        System.out.println("      " + "1." + "Einzahlen");
        System.out.println("      " + "2." + "Abheben");
        System.out.println("      " + "3." + "Kontostand");
        System.out.println("      " + "4." + "Ende");


        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();

        while(selection > 4) {
            System.out.println("Wählen Sie eine Zahl zwischen 1 und 4 aus!");
            selection = scanner.nextInt();
        }

        switch (selection) {
            case 1:
                deposit();
                break;
            case 2:
                withdraw();
                break;
            case 3:
                balance();
                break;
            case 4:
                end();
                break;
        }

    }
    public static void deposit(){
        System.out.println("Geben Sie den Betrag ein den Sie einzahlen möchten:");

        Scanner scanner = new Scanner(System.in);
        float selection = scanner.nextFloat();


    }

    public static void balance(){

    }

    public static void withdraw(){
        System.out.println("Geben Sie den Betrag ein den Sie abheben möchten:");
    }

    public static void end(){
        System.out.println("Aufwiedersehen!");
    }

}


