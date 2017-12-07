import java.util.ArrayList;

public class Handynetz {
    private ArrayList<Handymast> handynetz;
    public Handynetz(){
        this.handynetz = new ArrayList<Handymast>();
    }
    public boolean add(Handymast mast){
        for (int i = 0; i < this.handynetz.size(); i++) {
            if (this.handynetz.get(i).getBezeichnung().equals(mast.getBezeichnung())){
                return false;
            }
        }
        this.handynetz.add(mast);
        return true;
    }
    public boolean addKapazitaet(String bezeichnung, int zusatzkapazitaet){
        for (int i = 0; i < this.handynetz.size(); i++) {
            if(this.handynetz.get(i).getBezeichnung().equals(bezeichnung)){
                this.handynetz.get(i).addKapazitaet(zusatzkapazitaet);
                return true;
            }
        }
        return false;
    }
    public int entferne(int mindestkapazitaet){
        int entfernt = 0;
        for (int i = 0; i < this.handynetz.size(); i++) {
            if(this.handynetz.get(i).getKapazitaet() < mindestkapazitaet){
                this.handynetz.remove(i);
                entfernt += 1;
            }
        }
        return entfernt;
    }
    public int getAnzahlGespraeche(double xKoordinate, double yKoordinate, double radius){
        Kreis umkreis = new Kreis(xKoordinate, yKoordinate, radius);
        int gespraeche = 0;
        for (int i = 0; i < this.handynetz.size(); i++) {
            if(umkreis.istImBereich(this.handynetz.get(i).getxKoorinate(), this.handynetz.get(i).getyKoordinate())){
                gespraeche += this.handynetz.get(i).getKapazitaet();
            }
        }
        return gespraeche;
    }
}
