public class Method {
    public static void zwiekszTaktowanie(Komputer komputer, int dodaneTaktowanie){
        double temp1 = komputer.getProcesor().getTempPrzyTaktowaniu() + (dodaneTaktowanie * 0.1);
        double temp2 = komputer.getRam().getTempPrzyTaktowaniu() + (dodaneTaktowanie * 0.15);
        if(temp1 > komputer.getProcesor().getMaxTemp() || temp2 > komputer.getRam().getMaxTemp()){
            throw new ZbytWysokaTemp("Temperatura jest zbyt wysoka");
        } else {
            System.out.println("Taktowanie zostało zwiększone");
        }
    }
}
