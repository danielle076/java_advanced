package AbstractClasses.Example2;

public class Flat extends Woning {
    private int deelnummer;

    public Flat(String gemeente, String sectie, int nummer, int deelnummer) {
        super(gemeente, sectie, nummer);
        this.deelnummer = deelnummer;
    }

    @Override
    public String getGemeente() {
        return this.gemeente;
    }

    @Override
    public void setGemeente(String gemeente) {
        this.gemeente = gemeente;
    }

    @Override
    public String getSectie() {
        return this.sectie;
    }

    @Override
    public void setSectie(String sectie) {
        this.sectie = sectie;
    }

    @Override
    public int getNummer() {
        return this.nummer;
    }

    @Override
    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public int getDeelnummer() {
        return deelnummer;
    }

    public void setDeelnummer(int deelnummer) {
        this.deelnummer = deelnummer;
    }

    // methode geefRegistratie wordt overschreven van Woning.java
    @Override
    public void geefRegistratie() {
        String x = "Plaatselijk bekend in: " + this.gemeente + " Als sectie: " + this.sectie + " Nummer: " + this.nummer + " Deelnummer: " + this.deelnummer;
        System.out.println(x);
    }
}
