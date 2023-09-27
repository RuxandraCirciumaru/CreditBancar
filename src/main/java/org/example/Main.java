package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UnitateBancara unitateBancara = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Va rugam introduceti numele:");
        String numeIntrodus = scanner.nextLine();

        System.out.print("Va rugam introduceti varsta dumneavoastra:");
        int varstaIntrodusa = Integer.parseInt(scanner.nextLine());

        System.out.print("Va rugam introduceti CNP-ul dumneavoastra:");
        int cnpIntrodus = Integer.parseInt(scanner.nextLine());

        System.out.print("Va rugam introduceti salariul net al dumneavoastra:");
        double salariuIntrodus = Double.parseDouble(scanner.nextLine());

        Person persoana = new Person(numeIntrodus, varstaIntrodusa, cnpIntrodus, salariuIntrodus);

        if (varstaIntrodusa < 18) {
            System.out.println("Persoana nu este eligibila pentru un credit");
            System.exit(0);
        } else if (varstaIntrodusa > 18 && varstaIntrodusa < 40) {
            unitateBancara = new BancaPentruLocuinte();
            System.out.println("Va incadrati la un credit de tipul \"Banca Pentru Locuinte\"");
        } else {
            unitateBancara = new BancaPentruNevoipersonale();
            System.out.println("Va incadrati la un credit de tipul \"Banca Pentru Nevoi Personale\"");
        }

        System.out.println("Creditul maxim ce va poate fi oferit este de " + unitateBancara.credit(persoana) +
                " lei, iar dobanda aferenta este de " + unitateBancara.dobanda(persoana) + " lei.");


        scanner.close();

        }
    }
