package com.lenka4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try {

            System.out.println("Podaj imie psa: ");
            String name = sc.nextLine();
            System.out.println("Podaj date urodzenia psa w formacie yyy-mm-dd: ");
            String inputDate = sc.nextLine();
            Date date = formatter.parse(inputDate );
            System.out.println("Podaj wage psa: ");
            String inputWeight = sc.nextLine();
            Float weight = Float.valueOf(inputWeight);
            System.out.println("Podaj nazwe wlasciciela: ");
            String ownerName = sc.nextLine();
            Pies pies = new Pies(name, date, weight, ownerName);
            System.out.println("Dane twojego psa to: " + pies.nameYourSelf());

        } catch (ParseException e) {
            System.out.println("Zły format daty.");
            e.printStackTrace();
        }catch (Exception f){
            System.out.println("nieznany blad");
        }


    }
}
