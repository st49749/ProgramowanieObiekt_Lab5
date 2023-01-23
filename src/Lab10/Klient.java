package Lab10;

import Lab08.Utility;

public class Klient {
    Stos<String> koszyk = new Stos<String>();
    public Klient() {
    }

    public void wybierzProdukty(String[] listaProd) {
        var liczbaProd = Utility.GetRandomNumber(1, 15);

        for (int i = 0; i < liczbaProd; i++) {
            var index = Utility.GetRandomNumber(0, listaProd.length - 1);
            koszyk.push(listaProd[index]);
        }
    }
}
