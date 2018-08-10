public class Test {
    public static void main(String[] args) {

        Procesor procesor = new Procesor("procesor1", "HP", "1234", 2500, 30, 60 );
        PamiecRam ram = new PamiecRam("ram1", "Dell", "4569", 4000, 2000, 50, 100);
        DyskTwardy dyskTwardy = new DyskTwardy("dysk twardy1", "HP", "251", 500);

        Komputer komputer = new Komputer(procesor, ram, dyskTwardy);

        try{
        Method.zwiekszTaktowanieProcesora(komputer, 301);
    } catch (ZbytWysokaTemp e){
            System.out.println(e.getMessage());
        }

        try{
            Method.zwiekszTaktowaniePamieciRam(komputer, 3);
        } catch (ZbytWysokaTemp e){
            System.out.println(e.getMessage());
        }

    }
}
