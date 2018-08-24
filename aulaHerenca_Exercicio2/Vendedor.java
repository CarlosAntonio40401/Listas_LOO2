package aulaHerenca_Exercicio2;

public class Vendedor extends Empregado{
    
    private float valorVenda;
private float comissao;

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    @Override
    public float obterLucros(){
        return (super.getSalario()+comissao);
    } 
    
    
}
