import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("Min lommeregner ");

        //PLUS

        System.out.println("Hvad er 1 + 1 ? ");
        Lommeregner lommeregner = new Lommeregner();
        System.out.println(lommeregner.sum(1 , 1));

        System.out.println("Hvad er 2 + 2 ? ");
        System.out.println(lommeregner.sum(2 , 2));

        System.out.println("Hvad er 5 + 5 ? ");
        System.out.println(lommeregner.sum(5 , 5));

        System.out.println("Hvad er 120 + 300 ? ");
        System.out.println(lommeregner.sum(120 , 300));

        //MINUS

        System.out.println("Hvad er 1 - 1 ? ");
        System.out.println(lommeregner.minus(1 , 1 ));

        System.out.println("Hvad er 2 - 1 ? ");
        System.out.println(lommeregner.minus(2 , 1));

        System.out.println("Hvad er 5 - 2 ? ");
        System.out.println(lommeregner.minus(5 , 2));

        System.out.println("Hvad er 120 - 300 ? ");
        System.out.println(lommeregner.minus(120 , 300));

        //Multiplicering
        System.out.println("Hvad er 1 * 1 ? ");
        System.out.println(lommeregner.multiplicere(1 , 1 ));

        System.out.println("Hvad er 2 * 2 ? ");
        System.out.println(lommeregner.multiplicere(2 , 2));

        System.out.println("Hvad er 5 * 5 ? ");
        System.out.println(lommeregner.multiplicere(5 , 5));

        System.out.println("Hvad er 10 * 300 ? ");
        System.out.println(lommeregner.multiplicere(10 , 300));

        // Dividere
        System.out.println("Hvad er 10 / 5 ? ");
        System.out.println(lommeregner.dividere(10 , 5 ));

        System.out.println("Hvad er 3 / 2 ? ");
        System.out.println(lommeregner.dividere(30 , 2));

        System.out.println("Hvad er 100 / 5 ? ");
        System.out.println(lommeregner.dividere(100 , 5));

        System.out.println("Hvad er 300 / 100 ? ");
        System.out.println(lommeregner.dividere(300 , 100));

        // Secret ( a * a / b )
        System.out.println("Hvad er 2 * 2 - 2 ? ");
        System.out.println(lommeregner.secret(2 , 2 ));

        System.out.println("Hvad er 4 * 4 - 10 ? ");
        System.out.println(lommeregner.secret(4 , 10));

        System.out.println("Hvad er 5 * 5 - 5 ? ");
        System.out.println(lommeregner.secret(5 , 5));

        System.out.println("Hvad er 100 * 100 - 50 ? ");
        System.out.println(lommeregner.secret(100 , 50));

    }
}
