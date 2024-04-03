import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Escreva uma descrição da classe ShippingCompany aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */

//Nivel 5
public class ShippingCompany extends HashSet<Transport> {
    
    private String name;
    private final List<Transport> inService;

    public ShippingCompany(String name) {
        this.name = name;
        inService = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeTransportation(String id, String origin, String destination, double price) {
        Transport transport = getTransportation(id);
        if (transport != null && transport.isAvailable()) {
            transport.setValues(origin, destination, price);
            inService.add(transport);
            remove(transport);
        }

    }
    
    public void finalizeTransportation(String id) {
        Transport transport = getTransportation(id);
        if (transport != null) {
            transport.resetValues();
            remove(transport);
            add(transport);
        }
        
    }
    
    private Transport getTransportation(String id) {
        for (Transport transport : this) {
            if (transport.getId().equalsIgnoreCase(id)) {
                return transport;
            }
        }
        return null;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Transportes em serviço da empresa ").append(name).append(":\n");
        for (Transport transport : inService) {
            sb.append(transport).append("\n");
        }
        return sb.toString();
    }
}
