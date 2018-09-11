package lista5;

/**
 *
 * @author Carlos Antonio
 */
public class Assistente extends Funcionario {

    private int matricula;

    public Assistente(int matricula, String nome) {
        super(nome);
        this.matricula = matricula;

    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String exibirDados() {
        return "Dados do assistente: \n Nome:" + getNome() + "\n Matricula:" + getMatricula();
    }

}
