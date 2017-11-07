public class Bankomat {
    private int betrag;

    public Bankomat(){
        this.betrag = 0;
    }
    public Bankomat(int anfangsbetrag){
        this.betrag = anfangsbetrag;
    }
    public void befuelle(int betrag){
        this.betrag += betrag;
    }
    public int gibVerfuegbarenBetrag(){
        return this.betrag;
    }
    public String behebe(int betrag){
        if (betrag > 0 &&
                betrag <= this.betrag &&
                betrag % 10 == 0){
            this.betrag -= betrag;
            int hunderter = (betrag - betrag % 100) / 100;
            int funfziger = (betrag % 100 - betrag % 50) / 50;
            int zehner = (betrag % 50 - betrag % 10) / 10;
            return String.format("Sie erhalten %d Hunderter, %d Fünfziger und %d Zehner", hunderter, funfziger, zehner);
        } else {
            return "Ungültiger Betrag";
        }
    }
}
