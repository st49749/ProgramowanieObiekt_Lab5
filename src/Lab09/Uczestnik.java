package Lab09;

import java.util.Objects;

public class Uczestnik {
    int id;
    String imie;
    int wiek;

    public Uczestnik(int id, String imie, int wiek) {
        this.id = id;
        this.imie = imie;
        this.wiek = wiek;
    }

    public int getId() {
        return id;
    }

    public String getImie() {
        return imie;
    }

    public int getWiek() {
        return wiek;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Uczestnik))
            return false;

        var out = (Uczestnik)obj;
        return out.getWiek() == this.getWiek()
                && out.getImie() == this.getImie()
                && out.getId() == this.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getImie(), getWiek());
    }

    @Override
    public String toString() {
        return "Uczestnik | " + getId() + " | " + getImie() + " | " + getWiek();
    }
}
