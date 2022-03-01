package sk.fiit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int count;
        Factorial factorial = new Factorial();
        Prime prime = new Prime();
        Usek usek = new Usek();
        Scanner scan = new Scanner(System.in);
        Divisor divisor = new Divisor();
        System.out.println("Faktorial po cislo");
        count = scan.nextInt();
        System.out.println("Faktorial :");
        factorial.nthFactorial(count);
        System.out.println("\n\nPrvocisla po");
        count = scan.nextInt();
        System.out.println("Prvocisla :");
        prime.countPrime(count);
        System.out.println("\n\nNajvyssie cislo v useku");
        count = scan.nextInt();
        System.out.println("Usek :");
        usek.countUsek(count);
        System.out.println("\n\nPocet Cisel v postupnosti delitelov");
        count = scan.nextInt();
        System.out.println("Delitel :");
        divisor.Sequence(count);
    }
}
