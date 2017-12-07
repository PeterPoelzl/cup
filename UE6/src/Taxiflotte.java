import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

import java.util.ArrayList;
import java.util.Random;

public class Taxiflotte {
    private ArrayList<TaxiBot> taxiflotte;
    public Taxiflotte(City city){
        this.taxiflotte = new ArrayList<TaxiBot>();
    }
    public static void erzeugeFlotte(){
        Random random = new Random();
        City city = new City();
        ArrayList<TaxiBot> liste = new ArrayList<TaxiBot>();
        int taxiAnzahl = 3;
        for (int i = 0; i <= taxiAnzahl; i++) {
            RobotSE robi = new RobotSE(city, random.nextInt(11), random.nextInt(11), Direction.NORTH);
            TaxiBot taxi1 = new TaxiBot(robi);
            liste.add(taxi1);
        }
    }
    public boolean add(TaxiBot taxi){
        for (int i = 0; i < taxiflotte.size(); i++) {
            if(taxi.getSpalte() == taxiflotte.get(i).getSpalte() && taxi.getZeile() == taxiflotte.get(i).getZeile()){
                return false;
            }
        }
        this.taxiflotte.add(taxi);
        return true;
    }
    public void holeAb(int zeile, int spalte){
        City city = new City();
        Thing person = new Thing(city, zeile, spalte);
        int nahe = 0;
        for (int i = 0; i < taxiflotte.size(); i++) {
            if(taxiflotte.get(i).getDistanz(zeile, spalte) < taxiflotte.get(nahe).getDistanz(zeile, spalte)){
                nahe = i;
            }
        }
        taxiflotte.get(nahe).fahreZu(zeile, spalte);
        taxiflotte.get(nahe).einsteigen();
    }
}
