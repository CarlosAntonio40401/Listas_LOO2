package lista5;

/**
 *
 * @author Carlos Antonio
 */
public abstract class Animal {

    private String nome;
    private String raca;

    public Animal() {
    }

    public Animal(String nome) {
        this.nome = nome;
       
    }

    public abstract String caminhar();

}
