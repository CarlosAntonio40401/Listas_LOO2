package lista4;

/**
 *
 * @author Carlos Antonio
 */
public class School extends Building {

    private boolean laboratorios;

    public School(boolean laboratorios, int numeroDePessoas, boolean usoDeEnergiaRenovavel, int numeroDeLampadas, boolean usoDeArCondicionado) {
        super(numeroDePessoas, usoDeEnergiaRenovavel, numeroDeLampadas, usoDeArCondicionado);
        this.laboratorios = laboratorios;
    }

    public boolean isLaboratorios() {
        return laboratorios;
    }

    public void setLaboratorios(boolean laboratorios) {
        this.laboratorios = laboratorios;
    }

}
