import java.util.ArrayList;

public class Bank {
    private ArrayList<Konto> bank;
    public Bank(){
        this.bank =  new ArrayList<Konto>();
    }
    // O(n)
    public boolean addKonto(Konto einKonto) {
        for (int i = 0; i < this.bank.size(); i++) {
            if (this.bank.get(i).getKontonummer().equals(einKonto.getKontonummer())) {
                return false;
            }
        }
        this.bank.add(einKonto);
        return true;
    }
    // O(n/2)
    public boolean schliesseKonto(String kontonummer){
        for (int i = 0; i < this.bank.size(); i++) {
            if(this.bank.get(i).getKontonummer().equals(kontonummer)){
                this.bank.get(i).setGeschlossen();
                return true;
            }
        }
        return false;
    }
    public ArrayList<Konto> gibKontenImPlus() {
        ArrayList<Konto> kontenImPlus = new ArrayList<>();
        for (int i = 0; i < this.bank.size(); i++) {
            if(!this.bank.get(i).isGeschlossen() && this.bank.get(i).getKontostand() > 0){
                kontenImPlus.add(this.bank.get(i));
            }
        }
        return kontenImPlus;
    }
    public Konto findeBestesKonto(){
        double hoechsterKontostand = 0;
        for (int i = 0; i < this.bank.size(); i++) {
            if(!this.bank.get(i).isGeschlossen() && this.bank.get(i).getKontostand() > hoechsterKontostand){
                hoechsterKontostand = this.bank.get(i).getKontostand();
            }
        }
        for (int i = 0; i < this.bank.size(); i++) {
            if(this.bank.get(i).getKontostand() == hoechsterKontostand){
                return this.bank.get(i);
            }
        }
        return null;
    }
}
// |#|#|#|#| https://en.wikipedia.org/wiki/Off-by-one_error#Fencepost_error
