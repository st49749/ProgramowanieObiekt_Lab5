package Lab10;

import Lab08.Utility;
import Lab09.Uczestnik;

import java.util.LinkedList;
import java.util.Queue;

public class Sklep {
    Queue<Klient> Queue = new LinkedList<>();
    public Sklep(String[] prods) {
        GenerateQueue(prods);
    }

    private void GenerateQueue(String[] prods) {
        var num = Utility.GetRandomNumber(1, 9);
        for (int i = 0; i < num; i++) {
            Klient k = new Klient();
            k.wybierzProdukty(prods);
            Queue.add(k);
        }

        System.out.println("Wchodzisz do sklepu gdzie dlugosc kolejki wynosi " + Queue.size() + " osob");
    }

    public Integer dodajKlienta(Klient k) {
        Queue.add(k);
        return Queue.size();
    }

    public void obsluzKolejke() {
        while (Queue.peek() != null) {
            System.out.println("NASTEPNY KLIENT");
            var klient = Queue.poll();
            while (klient.koszyk.peek() != null) {
                var prod = klient.koszyk.pop();
                System.out.print(prod + " ");
            }
            System.out.println();
        }
    }
}
