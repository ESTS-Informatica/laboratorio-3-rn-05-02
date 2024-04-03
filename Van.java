
/**
 * Escreva uma descrição da classe Van aqui.
 * 
 * @author (Thiers Neto) 
 * @version (201902549)
 */

//Nivel 4
public class Van extends GroundTransportation 
{
    private int packages;
    
    public Van (int packages, String licensePlate)
    {
        super(licensePlate);
        this.packages = packages;
    }
    
    public void setNumberOfPackages(int packages){
        this.packages = packages;
    }
    
    public int getNumberOfPackges() {
        return packages;
    }
    
    @Override
    public String toString() {
        return super.toString() +
                String.format("%15s: %s\n", "Nº de pacotes", packages);
    }
    
    //Pedido do Nivel 3
    @Override
    public String getTransportType() {
        return "Van";
    }
}
