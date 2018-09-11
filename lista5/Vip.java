package lista5;

/**
 *
 * @author Carlos Antonio
 */
public class Vip extends Ingresso{
    
    
    @Override
    public double imprimeValor() {

        Double ingressoVip = (super.imprimeValor() * 0.10) + super.imprimeValor();
        return ingressoVip;
    }
}
