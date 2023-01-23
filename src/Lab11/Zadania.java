package Lab11;

import Lab08.Utility;
import Lab10.*;

import java.io.*;
import java.util.*;

public class Zadania {
    public static void WykonajZadania() throws IOException {
        //Zad1();
        //Zad2();

        // ZAD 3
        System.out.println("ZAD 3: Podaj nazwe pliku do ktorego chcesz zapisac tekst: ");
        var sciezka = Utility.GetString();
        System.out.println("ZAD 3: Podaj date urodzenia po kolei: rok, miesiac, dzien zatwierdzajac enterem: ");
        var year = Utility.GetInt();
        var month = Utility.GetInt();
        var day = Utility.GetInt();

        var yearPath = sciezka.replace(".txt", "Year.txt");
        var monthPath = sciezka.replace(".txt", "Month.txt");
        var dayPath = sciezka.replace(".txt", "Day.txt");

        SaveBinary(yearPath, year);
        SaveBinary(monthPath, month);
        SaveBinary(dayPath, day);

        // ZAD 4
        System.out.println(ReadBinray(yearPath));
        System.out.println(ReadBinray(monthPath));
        System.out.println(ReadBinray(dayPath));
    }

    private static void Zad2() throws IOException {
        System.out.println("ZAD 2: Podaj nazwe pliku ktory chcesz odczytac: ");
        var sciezka = Utility.GetString();
        int numOfLines = 0;
        try {

            File file = new File(sciezka);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                numOfLines++;
                System.out.println(scanner.next());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Plik posiada " + numOfLines + " linii");
    }

    private static void Zad1() throws IOException {
        System.out.println("ZAD 1: Podaj nazwe pliku do ktorego chcesz zapisac tekst: ");
        var sciezka = Utility.GetString();
        PrintWriter zapis = new PrintWriter(sciezka);

        var text= Utility.GetString();
        while (!text.equals("-")) {
            zapis.println(text);
            text = Utility.GetString();
        }
        zapis.close();
    }

    private static void SaveBinary(String sciezka, int number) throws IOException {
        DataOutputStream outputStream = null;
        try {
            outputStream = new DataOutputStream(new FileOutputStream(sciezka));
            outputStream.writeInt(number);
        } finally {
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

    public static int ReadBinray(String sciezka) throws IOException{

        int number = 0;
        DataInputStream inputStream = null;
        try {
            inputStream = new DataInputStream(new FileInputStream(sciezka));
            number = inputStream.readInt();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
        return number;
    }
}
