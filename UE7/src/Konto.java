public class Konto {
    private String kontonummer;
    private String inhaber;
    private double kontostand;
    private boolean geschlossen;
    public Konto(String kontonummer, String inhaber, double kontostand){
        this.kontonummer = kontonummer;
        this.kontostand = kontostand;
        this.inhaber = inhaber;
        this.geschlossen = false;
    }

    public String getKontonummer() {
        return kontonummer;
    }

    public double getKontostand() {
        return kontostand;
    }

    public String getInhaber() {
        return inhaber;
    }

    public boolean isGeschlossen() {
        return geschlossen;
    }
    public void setGeschlossen(){
        this.geschlossen = true;
    }
}
