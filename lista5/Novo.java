package lista5;

/**
 *
 * @author Carlos Antonio
 */
public class Novo extends Imovel{
    
    
     private double adicional;

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    public String valorComAdicional() {

        return "Novo valor com adicional: R$" + (super.getPreco() + getAdicional());
    }
}
