package lista5;

import java.util.ArrayList;


/**
 *
 * @author Carlos Antonio
 */
public class TesteLivroMouse {

    public static void main(String[] args) {

        ArrayList<Produto> carrinhoCompras = new ArrayList();

        Mouse mouse = new Mouse("Óptico", "Ricardo eletro", 35.0, "Um mouse simples.");

        Livro livro = new Livro("Clarice", "Leitura", 30.0, "Relatos sobre a vida de uma mulher.");

        carrinhoCompras.add(mouse);
        carrinhoCompras.add(livro);

        for (int i = 0; i < carrinhoCompras.size(); i++) {

            System.out.println(carrinhoCompras.get(i).getDescricao());

        }

    }
}
