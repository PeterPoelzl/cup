import java.util.ArrayList;

public class Perlenkette {
    private ArrayList<Perle> perlenkette;
    private String farbe1;
    private double durchmesser1;
    private String farbe2;
    private double durchmesser2;

    public Perlenkette(String farbe1, double durchmesser1, String farbe2, double durchmesser2){
        this.farbe1 = farbe1;
        this.farbe2 = farbe2;
        this.durchmesser1 = durchmesser1;
        this.durchmesser2 = durchmesser2;
        this.perlenkette = new ArrayList<Perle>();
    }
    public boolean addPerle(Perle naechstesGlied){
        if(this.perlenkette.size() > 0 &&
                (naechstesGlied.getFarbe().equals(this.perlenkette.get(this.perlenkette.size() - 1).getFarbe())) ||
                (naechstesGlied.getDurchmesser() == this.perlenkette.get(this.perlenkette.size() - 1).getDurchmesser())){
            return false;
        }
        if ((naechstesGlied.getFarbe().equals(farbe1) && naechstesGlied.getDurchmesser() != durchmesser1) ||
                (naechstesGlied.getFarbe().equals(farbe2) && naechstesGlied.getDurchmesser() != durchmesser2)){
                    return false;
        } else {
            this.perlenkette.add(naechstesGlied);
            return true;
        }
    }
    public boolean hatGleichViele(){
        return this.perlenkette.size() % 2 == 0;
    }
    public boolean kannGeschlossenWerden(int mindestlaenge){
        return this.perlenkette.size() >= mindestlaenge && hatGleichViele();
    }
}
