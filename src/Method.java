public class Method {
    public static void zwiekszTaktowanieProcesora(Komputer komputer, int dodaneTaktowanie){
        double temp = komputer.getProcesor().getTempPrzyTaktowaniu() + (dodaneTaktowanie * 0.1);
        if(temp > komputer.getProcesor().getMaxTemp()){
            throw new ZbytWysokaTemp("Nie można zwiększyć taktowania procesora. Maksymalna temperatura zostałaby przekroczona.");
        } else {
            komputer.getProcesor().setTaktowanieMHz(komputer.getProcesor().getTaktowanieMHz() + dodaneTaktowanie);
            System.out.println("Taktowanie procesora zostało zwiększone");
        }
    }

    public static void zwiekszTaktowaniePamieciRam(Komputer komputer, int dodaneTaktowanie){
        double temp = komputer.getRam().getTempPrzyTaktowaniu() + (dodaneTaktowanie * 0.15);
        if(temp > komputer.getRam().getMaxTemp()){
            throw new ZbytWysokaTemp("Nie można zwiększyć taktowania pamięci ram. Maksymalna temperatura zostałaby przekroczona.");
        } else {
            komputer.getRam().setTaktowanieMHz(komputer.getRam().getTaktowanieMHz() + dodaneTaktowanie);
            System.out.println("Taktowanie pamięci ram zostało zwiększone");
        }
    }
}
