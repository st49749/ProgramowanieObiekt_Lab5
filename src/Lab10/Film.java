package Lab10;

public abstract class Film {
    int czasTrwania;
    String tytul, typ;
    Boolean czyObejrzany;

    public Film(String tytul, int czasTrwania) {
        this.czasTrwania = czasTrwania;
        this.tytul = tytul;
        czyObejrzany = false;
    }

    public int getCzasTrwania() {
        return czasTrwania;
    }

    public String getTytul() {
        return tytul;
    }

    public Boolean getCzyObejrzany() {
        return czyObejrzany;
    }

    public String getTyp() {
        return typ;
    }

    public void obejrzyj() {
        czyObejrzany = true;
    }

    public String toString() {
        return "Tytul: " + getTytul() + ", Czas trwania: " + getCzasTrwania() + " min, Obejrzany: " + getCzyObejrzany() + ", Typ: " + getTyp();
    }
}
