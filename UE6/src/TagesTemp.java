public class TagesTemp {
    private String datum;
    private double temperatur;
    public TagesTemp(String datum, double temperatur){
        this.datum = datum;
        this.temperatur = temperatur;
    }
    public String gibDatum(){
        return this.datum;
    }
    public double gibTemp(){
        return this.temperatur;
    }
    public void setzeTemp(double neueTemp){
        this.temperatur = neueTemp;
    }
}
