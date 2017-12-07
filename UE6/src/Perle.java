public class Perle {
    private String farbe;
    private double durchmesser;
    public Perle(String farbe, double durchmesser){
        this.farbe = farbe;
        this.durchmesser = durchmesser;
    }
    public String getFarbe(){
        return this.farbe;
    }
    public double getDurchmesser(){
        return this.durchmesser;
    }
}
