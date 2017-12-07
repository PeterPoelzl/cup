import java.util.ArrayList;

public class Tabelle {
    private ArrayList<Mannschaft> liste;
    public Tabelle(ArrayList<String> dieMannschaften){
        for(String i : dieMannschaften){
            liste.add(new Mannschaft(i));
        }
    }
    public void werteSpielAus(String m1Name, String m2Name, int tore1, int tore2){
        Mannschaft m1 = new Mannschaft(m1Name);
        Mannschaft m2 = new Mannschaft(m2Name);

        m1.changeTordifferenz(tore1 - tore2);
        m2.changeTordifferenz(tore2 - tore1);

        if(tore1 > tore2){
            m1.addPunkte(3);
        }
        if(tore1 == tore2){
            m1.addPunkte(1);
            m2.addPunkte(1);
        }
        if(tore2 > tore1){
            m2.addPunkte(3);
        }
        addMannschaft(m1);
        addMannschaft(m2);
    }
    public void addMannschaft(Mannschaft m){
        for (int j = 0; j < liste.size(); j++){
            if(m.getPunkte() > liste.get(j).getPunkte()){
                liste.add(j, m);
            }
            if(m.getPunkte() == liste.get(j).getPunkte() && m.getTordifferenz() > liste.get(j).getTordifferenz()){
                liste.add(j, m);
            }
        }
        // Catch-all
        this.liste.add(m);
    }
    public ArrayList<Mannschaft> getTabelle() {
        return liste;
    }
}
