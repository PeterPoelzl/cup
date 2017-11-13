import java.lang.Math;

public class Kreis {
    private double mX;
    private double mY;
    private double radius;
    public Kreis (double mittelpunktX, double mittelpunktY, double radius){
        this.mX = mittelpunktX;
        this.mY = mittelpunktY;
        this.radius = radius;
    }
    public boolean istImBereich(double x, double y){
        return (Math.pow((x - this.mX), 2) + Math.pow((y - this.mY), 2) <= Math.pow(this.radius, 2));
    }
}
