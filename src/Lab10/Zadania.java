package Lab10;

import java.text.Collator;
import java.util.*;

public class Zadania {
    public static void WykonajZadania() {
        Zad1();

        // ZAD 2
        Queue<Command> queue = new LinkedList<>();
        CommandContainer container = new CommandContainer();
        queue = container.GetQueue(queue);
        ContainerConsumer.ConsumeQueue(queue);

        // ZAD 3
        Stos<String> stos = new Stos<String>();
        String expression = "+B+a+ł---+a+g+a---+n-+w-+l+i+t---+e-+r+k--+a+c+h---";

        for (char ch: expression.toCharArray()) {
            if(ch == '+')
                continue;

            if(ch == '-') {
                if(!stos.empty())
                    stos.pop();
                continue;
            }

            stos.push("" + ch);
        }

        System.out.println(stos.toString());

        // ZAD 4
        String[] array = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" };
        Sklep sklep = new Sklep(array);
        Klient ja = new Klient();
        ja.wybierzProdukty(array);
        sklep.dodajKlienta(ja);
        sklep.obsluzKolejke();

        // ZAD 5
        var prywatnaKolekcja = new HashMap<Integer, Film>();
        prywatnaKolekcja.put(1, new Horror("Horror 1", 120));
        prywatnaKolekcja.put(2, new Horror("Horror 2", 130));
        prywatnaKolekcja.put(3, new Komedia("Komedia 1", 140));
        prywatnaKolekcja.put(4, new Komedia("Komedia 2", 150));

        var iteratorKeySet = prywatnaKolekcja.keySet().iterator();
        while(iteratorKeySet.hasNext()) {
            var key = iteratorKeySet.next();
            var value = prywatnaKolekcja.get(key);
            System.out.println("Nr " + key + " " + value.toString());
        }
    }

    private static void Zad1() {
        // ZAD 1
        var kangarooList = new ArrayList<Kangur>();
        for (int i = 0; i < 10; i++) {
            kangarooList.add(new Kangur(i+1));
        }

        for (int i = 0; i < kangarooList.size(); i++) {
            var temp = kangarooList.get(i);
            temp.skok();
        }

        var iterator = kangarooList.iterator();
        while(iterator.hasNext()) {
            var temp = iterator.next();
            temp.skok();
        }

        Map<String, Kangur> mapofKangaroos = new HashMap<String, Kangur>();
        for (int i = 0; i < kangarooList.size(); i++) {
            // https://www.javatpoint.com/java-ascii-table - przesuniecie o 97 zeby nadawac dynamicznie nazwy a,b,c,d,e...
            var name = "" +  ((char)(i + 97));
            mapofKangaroos.put(name, kangarooList.get(i));
        }

        var iteratorKeySet = mapofKangaroos.keySet().iterator();
        while(iteratorKeySet.hasNext()) {
            var key = iteratorKeySet.next();
            var value = mapofKangaroos.get(key);

            System.out.println("Nazwa kangura: " + key);
            value.skok();
        }

        iteratorKeySet = mapofKangaroos.keySet().iterator();
        Map<String, Kangur> linkedHashMap = new LinkedHashMap<String, Kangur>();
        while(iteratorKeySet.hasNext()) {
            var key = iteratorKeySet.next();
            var value = mapofKangaroos.get(key);

            linkedHashMap.put(key, value);
        }
    }
}