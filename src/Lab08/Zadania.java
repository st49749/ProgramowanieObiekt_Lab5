package Lab08;

import jdk.jshell.execution.Util;

import java.util.InputMismatchException;

public class Zadania {
    public static void WykonajZadania() {
        Zad1();

        // ZAD 2
        try {
            System.out.println(Zad2Silnia(-2));
        } catch (BlednaWartoscDlaSilniException e) {
            System.out.println("Podano bledna wartosc silni");
        }

        try {
            System.out.println(Zad2Silnia(5));
        } catch (BlednaWartoscDlaSilniException e) {
            System.out.println("Podano bledna wartosc silni");
        }

        // ZAD 3
        try {
            var adres = new Adres("Ulica", "Miasto", "30-300", 10);
        } catch (NieprawidlowyAdresException e) {
            System.out.println("Wykryto niepoprawne wartosci adresu: " + e.getMessage());
        }
    }

    public static void Zad1() {
        System.out.println("Podaj liczbe do pierwiastkowania");
        double liczba;

        while(true) {
            try {
                liczba = Utility.GetDouble();
                if (liczba < 0)
                    throw new IllegalArgumentException("Nie mozna pierwiastkowac liczby ujemnej");

                System.out.println("Pierwiastek liczby " + liczba + " to : " + Math.sqrt(liczba));
                break;
            }
            catch (InputMismatchException ex) {
                System.out.println("Podana wartosc nie zostala rozpoznana jako liczba.");
            }
            catch (IllegalArgumentException ex) {
                System.out.println("Zlapano wyjatek IllegalArgumentException: " + ex.getMessage());
            }
        }
        System.out.println("Zakonczenie programu zadania nr 1");
    }

    public static int Zad2Silnia(int liczba) throws BlednaWartoscDlaSilniException {
        if(liczba < 0)
            throw new BlednaWartoscDlaSilniException("Wartosc dla silni nie moze byc ujemna");

        int result = 1;
        for (int i = 1; i <= liczba; i++) {
            result = result * i;
        }
        return result;
    }
}
