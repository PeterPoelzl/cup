public class Handymast {
    private String bezeichnung;
    private double xKoorinate;
    private  double yKoordinate;
    private int kapazitaet;
    public Handymast(String bezeichnung, double xKoordinate, double yKoodinate, int kapazitaet){
        this.bezeichnung = bezeichnung;
        this.xKoorinate = xKoordinate;
        this.yKoordinate = yKoodinate;
        this.kapazitaet = kapazitaet;
    }
    public String getBezeichnung(){
        return this.bezeichnung;
    }
    public double getxKoorinate() {
        return this.xKoorinate;
    }
    public double getyKoordinate() {
        return this.yKoordinate;
    }
    public int getKapazitaet() {
        return this.kapazitaet;
    }
    public void addKapazitaet(int zusatzkapazitaet){
        this.kapazitaet += zusatzkapazitaet;
    }
}
