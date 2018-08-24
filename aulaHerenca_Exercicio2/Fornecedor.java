package aulaHerenca_Exercicio2;

/**
 *
 * @author Carlos Antonio
 */
public class Fornecedor extends Pessoa {
    
    private Double creditoMaximo;
    private Double valorEmDivida;

    Fornecedor() {
        }

    public Double getCreditoMaximo() {
        return creditoMaximo;
    }

    public void setCreditoMaximo(Double creditoMaximo) {
        this.creditoMaximo = creditoMaximo;
    }

    public Double getValorEmDivida() {
        return valorEmDivida;
    }

    public void setValorEmDivida(Double valorEmDivida) {
        this.valorEmDivida = valorEmDivida;
    }

    public Fornecedor(Double creditoMaximo, Double valorEmDivida, String nome, int idade, float altura, String sexo) {
        super(nome, idade, altura, sexo);
        this.creditoMaximo = creditoMaximo;
        this.valorEmDivida = valorEmDivida;
    }
    
    public Double obterSaldo(){
        Double saldo=(this.creditoMaximo-this.valorEmDivida);
      return  saldo;
    }
    
    
}
