package L_AbstractClasses.Example2;

public abstract class Woning {
    // 3 attributen
    protected String gemeente;
    protected String sectie;
    protected int nummer;

    // constructor
    public Woning(String gemeente, String sectie, int nummer) {
        this.gemeente = gemeente;
        this.sectie = sectie;
        this.nummer = nummer;
    }

    // methodes abstract (zijn leeg)
    public abstract String getGemeente();

    public abstract void setGemeente(String gemeente);

    public abstract String getSectie();

    public abstract void setSectie(String sectie);

    public abstract int getNummer();

    public abstract void setNummer(int nummer);

    // methode geefRegistratie
    public void geefRegistratie() {
        String x = "Plaatselijk bekend in: " + this.gemeente + " Als sectie: " + this.sectie + " Nummer: " + this.nummer;
        System.out.println(x);
    }
}