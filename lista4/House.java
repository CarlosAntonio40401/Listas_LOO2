package lista4;

/**
 *
 * @author Carlos Antonio
 */
public class House extends Building{
    
    private double tamanho;

    public House(double tamanho, int numeroDePessoas, boolean usoDeEnergiaRenovavel, int numeroDeLampadas, boolean usoDeArCondicionado) {
        super(numeroDePessoas, usoDeEnergiaRenovavel, numeroDeLampadas, usoDeArCondicionado);
        this.tamanho = tamanho;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
    
    
}
