package Bankomat;
import java.io.Console;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class bankomat {



    public static void main(String[] args) {

        int kontostand = 0;
        int einzahlung = 0;
        int auszahlung = 0;

        System.out.println("Selektieren Sie die gewünschte Funktion");
        System.out.println("      " + "1." + "Einzahlen");
        System.out.println("      " + "2." + "Abheben");
        System.out.println("      " + "3." + "Kontostand");
        System.out.println("      " + "4." + "Ende");


        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();

        do {

            System.out.println("Wählen Sie eine Zahl zwischen 1 und 4 aus!");
            selection = scanner.nextInt();

        } while (selection > 4);

        switch (selection) {
            case 1:
                System.out.println("Geben Sie den Betrag ein den Sie einzahlen möchten:");
                int betrag = scanner.nextInt();
                einzahlung = betrag;
                System.out.println(einzahlung + "Euro");
                break;
            case 2:
                System.out.println("Geben Sie den Betrag ein den Sie abheben möchten:");
                break;
            case 3:
                System.out.println("kontostand");
                break;
            case 4:
                System.out.println("Aufwiedersehen");
                break;
        }

        selection.nextInt();

    }

}
