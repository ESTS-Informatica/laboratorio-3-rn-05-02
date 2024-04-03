
/**
 * Escreva uma descrição da classe Lorry aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */

// Nivel 4
public class Lorry extends GroundTransportation {

    private int numberOfPallets;
    private int trailers;

    public Lorry(int numberOfpallets, int trailers, String licensePlate) {
        super(licensePlate);
        this.numberOfPallets = numberOfPallets;
        this.trailers = trailers;
    }
    
    public int getNumberOfPallets() {
        return numberOfPallets;
    }
    
    public int getTrailers() {
        return trailers;
    }
    
    public void setNumberOfpallets(int numberOfPallets) {
        this.numberOfPallets = numberOfPallets;
    }

    public void setTrailers(int trailers) {
        this.trailers = trailers;
    }
    
    @Override
    public String toString() {
        return super.toString() +
                String.format("%15s: %s\n", "Nº Paletes", numberOfPallets);
    }
    
    //Pedido do Nivel 3
    @Override
    public String getTransportType() {
        return "Camião";
    }
}
