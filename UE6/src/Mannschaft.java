public class Mannschaft {
    private String name;
    private int punkte;
    private int tordiff;
    public Mannschaft(String name){
        this.name = name;
        this.punkte = 0;
        this.tordiff = 0;
    }
    public void addPunkte(int punkte){
        this.punkte += punkte;
    }
    public void changeTordifferenz(int tordiff){
        this.tordiff = tordiff;
    }
    public String getName(){
        return this.name;
    }
    public int getPunkte(){
        return this.punkte;
    }
    public int getTordifferenz(){
        return this.tordiff;
    }
}
