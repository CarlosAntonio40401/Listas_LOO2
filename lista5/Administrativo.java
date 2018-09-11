package lista5;

/**
 *
 * @author Carlos Antonio
 */
public class Administrativo extends Assistente{
    
    public Administrativo(int matricula, String nome) {
        super(matricula, nome);
    }
    
    
    
    public Double adicional(double adicional){
       Double salario=1000.0;
       adicional=(salario*adicional)+salario;
        return adicional;
    }
    
    @Override
    public String exibirDados(){
        return "Dados do administrativo:\n Nome:"+getNome()+"\n Matricula:"+getMatricula()+
                "\n Salário com adicional:"+adicional(0.10);
    }
}
