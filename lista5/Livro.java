package lista5;

/**
 *
 * @author Carlos Antonio
 */
public class Livro extends Produto {

    private String autor;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Livro(String autor, String nomeLoja, Double preco, String descricao) {
        super(nomeLoja, preco, descricao);
        this.autor = autor;
    }

    @Override
    public String getDescricao() {
        return "Livro:\nLivro comprado na loja:" + getNomeLoja() + " ,este livro é sobre Banco de dados, foi escrito pelo autor:" + this.autor
                + "e custou:" + super.getPreco()+" R$";
    }

}
