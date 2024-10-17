import java.util.Scanner;

public class Login  {
    public static void main(String[] args) throws Exception {
       
        Scanner in = new Scanner(System.in);
        String etu;
        String suku;
        String verkko;


        System.out.println("Etunimi?");
        etu=in.nextLine();
        System.out.println("Sukunimi?");
        suku=in.nextLine();
        System.out.println("Yrityksen verkkotunnus?");
        verkko=in.nextLine();


        if (etu.equals ("") || suku.equals ("") || verkko.equals (""))
        {
            System.out.println("Virhe! Jokin tiedoista puuttui.");
        }
        else
        {
            generateEmail(etu, suku, verkko);
            generateUsername(etu, suku);
        }
    }     
        // Main päättyy