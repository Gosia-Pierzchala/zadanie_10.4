public class Procesor extends Komponent {
    private int taktowanieMHz;
    private double tempPrzyTaktowaniu;
    private double maxTemp;

    public Procesor(String nazwaModelu, String producent, String numerSeryjny, int taktowanieMHz, double tempPrzyTaktowaniu, double maxTemp) {
        super(nazwaModelu, producent, numerSeryjny);
        this.taktowanieMHz = taktowanieMHz;
        this.tempPrzyTaktowaniu = tempPrzyTaktowaniu;
        this.maxTemp = maxTemp;
    }

    public int getTaktowanieMHz() {
        return taktowanieMHz;
    }

    public void setTaktowanieMHz(int taktowanieMHz) {
        this.taktowanieMHz = taktowanieMHz;
    }

    public double getTempPrzyTaktowaniu() {
        return tempPrzyTaktowaniu;
    }

    public void setTempPrzyTaktowaniu(double tempPrzyTaktowaniu) {
        this.tempPrzyTaktowaniu = tempPrzyTaktowaniu;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }
}
