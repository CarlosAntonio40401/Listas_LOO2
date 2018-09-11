package lista5;

/**
 *
 * @author Carlos Antonio
 */
public class Mouse extends Produto {

    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getDescricao() {
        return "Mouse:\nProduto comprado na " + getNomeLoja() + " mouse do tipo:" + this.tipo + " mouse optico, Saída USB.  1.600 DPI, "
                + " custou:" + getPreco() + " R$";
    }

    public Mouse(String tipo, String nomeLoja, Double preco, String descricao) {
        super(nomeLoja, preco, "mouse optico, Saída USB.  1.600 DPI.");
        this.tipo = tipo;
    }
}
