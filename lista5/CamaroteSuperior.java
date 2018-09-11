package lista5;

/**
 *
 * @author Carlos Antonio
 */
public class CamaroteSuperior extends Vip {

    private double adicional;

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    @Override
    public double imprimeValor() {

        Double ingressoCamaroteSuperior = (super.imprimeValor() + adicional);
        return ingressoCamaroteSuperior;
    }
}
