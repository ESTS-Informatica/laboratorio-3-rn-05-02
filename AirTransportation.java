
/**
 * Escreva uma descrição da classe AirTransportation aqui.
 * 
 * @author (Thiers) 
 * @version (201902549)
 */
public class AirTransportation extends Transport {
    
    
    private String name;
    private int numberOfContainers;
    private static final double HON = 4.0;
    
    public AirTransportation(String name, int numberOfContainers) {
        super();
        this.name = name;
        this.numberOfContainers = numberOfContainers;
    }
    
    public int getNumberOfContainers(){
        return numberOfContainers;
    }
    
    public void setNumberOfContainers() {
        if (numberOfContainers >= 0) {
            this.numberOfContainers = numberOfContainers;
        }
    }
    
    public String getName() {
        return name;
    }
    
    public void setName() {
        this.name = name;
    }
    
}
