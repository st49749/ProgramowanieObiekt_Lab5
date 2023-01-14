package Lab09;

import java.util.*;

public class Zadania {
    public static void WykonajZadania() {
        // ZAD 1
        var listWithArray = new ArrayList<Uczestnik>();
        var listWithLinkedList = new LinkedList<Uczestnik>();

        listWithArray.add(new Uczestnik(1, "Adam", 15));
        listWithArray.add(new Uczestnik(2, "Anna", 20));
        listWithArray.add(new Uczestnik(2, "Jan", 25));

        listWithLinkedList.add(new Uczestnik(1, "Adam", 15));
        listWithLinkedList.add(new Uczestnik(2, "Anna", 20));
        listWithLinkedList.add(new Uczestnik(2, "Jan", 25));

        Zad1FiltrujOsobyNiepelnoletnie(listWithArray);
        Zad1FiltrujOsobyNiepelnoletnie(listWithLinkedList);

        // ZAD 2
        Uczestnik[] array = new Uczestnik[] {
                new Uczestnik(1, "Adam", 15),
                new Uczestnik(2, "Anna", 20),
                new Uczestnik(2, "Jan", 25)
        };
        List<Uczestnik> list = Arrays.asList(array);
        List<Uczestnik> arrlist2 = list.subList(1,2);
        System.out.println("Sublist of arrlist: " + arrlist2);
        list.subList(1,2).clear();

        // ZAD 3
        List<Integer> noList1 = new ArrayList<Integer>();
        List<Integer> noList2 = new ArrayList<Integer>();
        noList1.add(1);
        noList1.add(2);
        noList2.add(3);
        noList2.add(4);

        ListIterator<Integer> li = noList1.listIterator(noList1.size());
        while(li.hasPrevious()) {
            noList2.add(li.previous());
        }
    }

    public static ArrayList<Uczestnik> Zad1FiltrujOsobyNiepelnoletnie(List<Uczestnik> lista) {
        var result = new ArrayList<Uczestnik>();

        for (var item: lista) {
            if(item.getWiek() < 18)
                result.add(item);
        }

        return result;
    }

    public static LinkedList<Uczestnik> Zad1FiltrujOsobyNiepelnoletnie(LinkedList<Uczestnik> lista) {
        var result = new LinkedList<Uczestnik>();

        for (var item: lista) {
            if(item.getWiek() < 18)
                result.add(item);
        }

        return result;
    }
}
