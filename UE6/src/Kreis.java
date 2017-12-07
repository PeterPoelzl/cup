import java.lang.Math;

public class Kreis {
    // Das sind die Werte, die einen Kreisinstanz beschreiben, daher sind es Attribute der Kreisklasse.
    private double mX;
    private double mY;
    private double radius;
    public Kreis (double mittelpunktX, double mittelpunktY, double radius){
        this.mX = mittelpunktX;
        this.mY = mittelpunktY;
        this.radius = radius;
    }
    public boolean istImBereich(double x, double y){
        // Die Methode Math.pow(double basis, double exponent) hebt die Basis zur Potenz.
        // Solange der Ausdruck links vom Ungleichheitssoperator kleiner oder gleich dem Ausdruck zur rechten ist,
        // liegt ein Punkt im Kreis.
        return (Math.pow((x - this.mX), 2) + Math.pow((y - this.mY), 2) <= Math.pow(this.radius, 2));
    }
}
