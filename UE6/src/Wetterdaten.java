import java.util.ArrayList;

public class Wetterdaten {
    private ArrayList<TagesTemp> temperaturListe;
    public Wetterdaten(){
        this.temperaturListe = new ArrayList<TagesTemp>();
    }
    public void addTag(TagesTemp einTag){
        this.temperaturListe.add(einTag);
    }
    public double getMittlereTemp(){
        double summe = 0;
        for (int i = 0; i < this.temperaturListe.size(); i++) {
            summe += temperaturListe.get(i).gibTemp();
        }
        return summe / this.temperaturListe.size();
    }
    public boolean zuWarm(TagesTemp einTag){
        return (einTag.gibTemp() - getMittlereTemp() >= 3);
    }
}
