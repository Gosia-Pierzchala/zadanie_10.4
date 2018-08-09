public class DyskTwardy extends Komponent{
    private int pojemnoscGB;

    public DyskTwardy(String nazwaModelu, String producent, String numerSeryjny, int pojemnoscGB) {
        super(nazwaModelu, producent, numerSeryjny);
        this.pojemnoscGB = pojemnoscGB;
    }

    public int getPojemnoscGB() {
        return pojemnoscGB;
    }

    public void setPojemnoscGB(int pojemnoscGB) {
        this.pojemnoscGB = pojemnoscGB;
    }
}
