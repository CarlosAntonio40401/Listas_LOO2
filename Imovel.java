
package exercicio3;

/**
 *
 * @author Carlos Antonio
 */
public abstract class Imovel {

	String cor;

	abstract void pintar(final String s);

	abstract int quantasPortasEstaoAbertas();

	abstract int totalDePortas();
}