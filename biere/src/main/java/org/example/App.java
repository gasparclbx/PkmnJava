package org.example;

import org.example.enumGlobal.Types;
import org.example.pojo.Bieres;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

        System.out.println("Combien de bières tu veux ?");
        Scanner sc = new Scanner(System.in);
        String saisie = "";
        int nombre = 0;
        float prix = 0.0F;
        boolean verif = false;
        boolean verifnombre = false;
        while(!verif){ // verif = //false
            try {
                saisie = "pression";
                verif = true;
                while(!verifnombre) {
                    try {
                        nombre = sc.nextInt();
                        verifnombre = true;
                    } catch (InputMismatchException e){
                        System.out.println("Tu me prends pour qui ?");
                        sc.next();
                    }
                }
                for (int i = 0; i < nombre; i++ ){
                    nombre += 1;
                    prix += 5.0F;
                }
            } catch (InputMismatchException e){
                System.out.println("Dégage petokask !!");
                sc.next();
            }
        }
        Bieres maCommande = new Bieres(Types.BLONDE,  )
        System.out.println();
    }
}

