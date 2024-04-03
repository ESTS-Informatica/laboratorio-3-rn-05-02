
/**
 * Escreva uma descrição da classe GroundTransportation aqui.
 * 
 * @author (Thiers Neto) 
 * @version (201902549)
 */
public class GroundTransportation extends Transport {
    private String licensePlate;
    private static final double FEES = 3.0;
    
    public GroundTransportation(String licensePlate) {
        super();
        this.licensePlate = licensePlate;
    }
    
    public String getLicensePlate() {
        return licensePlate;
    }   
    
    public void licensePlate() {
        if(licensePlate == null) {
            this.licensePlate =licensePlate;
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format("%15s: %s\n", "Matricula", licensePlate);
    }
    
    // Nivel 3
    @Override
    public String getTransportType() {
        return "Transporte Terrestre";
    }
    
    // Nivel 3
    @Override
    public double getPriceWithFees() {
        return getPrice() * (1.0 + (3.0 / 100.0));
    }
}
