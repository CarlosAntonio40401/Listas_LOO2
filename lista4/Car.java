package lista4;

/**
 *
 * @author Carlos Antonio
 */
public class Car implements CarbonFootprint{
    
    private String combustivel;
    private String modelo;

    public Car(String combustivel, String modelo) {
        this.combustivel = combustivel;
        this.modelo = modelo;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public double getCarbonFootprint() {
        int formula=450;
        Double kilometro=1.0;
        Double emissaoCO2=kilometro/formula;
       return emissaoCO2 ;
    }
   
}