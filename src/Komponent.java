public abstract class Komponent{
    private String nazwaModelu;
    private String producent;
    private String numerSeryjny;

    public Komponent(String nazwaModelu, String producent, String numerSeryjny) {
        this.nazwaModelu = nazwaModelu;
        this.producent = producent;
        this.numerSeryjny = numerSeryjny;
    }

    public String getNazwaModelu() {
        return nazwaModelu;
    }

    public void setNazwaModelu(String nazwaModelu) {
        this.nazwaModelu = nazwaModelu;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public String getNumerSeryjny() {
        return numerSeryjny;
    }

    public void setNumerSeryjny(String numerSeryjny) {
        this.numerSeryjny = numerSeryjny;
    }
}
