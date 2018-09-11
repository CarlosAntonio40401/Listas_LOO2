package lista5;

/**
 *
 * @author Carlos Antonio
 */
public class Velho extends Imovel{
    
     private double desconto;

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    public String precoComDesconto(){
        return "Preço do imovél com desconto: R$"+(getPreco()-getDesconto()) ;
    }
}
