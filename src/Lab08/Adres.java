package Lab08;

public class Adres {
    String ulica, miasto, kodPocztowy;
    int nrDomu;


    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) throws NieprawidlowyAdresException {
        if(ulica == null || ulica.length() == 0)
            throw new NieprawidlowyAdresException("Ulica nie może być nullem");

        this.ulica = ulica;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) throws NieprawidlowyAdresException {
        if(miasto == null || miasto.length() == 0)
            throw new NieprawidlowyAdresException("Miasto nie może być nullem");

        this.miasto = miasto;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }

    public int getNrDomu() {
        return nrDomu;
    }

    public void setNrDomu(int nrDomu) throws NieprawidlowyAdresException {
        if(nrDomu < 0)
            throw new NieprawidlowyAdresException("Nr domu nie moze byc mniejszy od zero");

        this.nrDomu = nrDomu;
    }

    public Adres(String ulica, String miasto, String kodPocztowy, int nrDomu) throws NieprawidlowyAdresException {
        this.setUlica(ulica);
        this.setMiasto(miasto);
        this.setKodPocztowy(kodPocztowy);
        this.setNrDomu(nrDomu);
    }
}
