package lista5;

/**
 *
 * @author Carlos Antonio
 */
public class Tecnico extends Assistente {

    public Tecnico(int matricula, String nome) {
        super(matricula, nome);
    }

    public Double bonusSalarial(Double adicional) {
        Double salario = 5000.0;
        salario = (salario * adicional)+salario;
        return salario;
    }

    @Override
    public String exibirDados() {
        return "Dados do técnico:\n Nome:" + super.getNome() + "\n Matricula:"
                + super.getMatricula() + "\n Salário com bônus:" + bonusSalarial(0.10);

    }
}
