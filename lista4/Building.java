package lista4;

/**
 *
 * @author Carlos Antonio
 */
public abstract class Building implements CarbonFootprint {

    private int numeroDePessoas;
    private boolean usoDeEnergiaRenovavel;
    private int numeroDeLampadas;
    private boolean usoDeArCondicionado;

    public Building(int numeroDePessoas, boolean usoDeEnergiaRenovavel, int numeroDeLampadas, boolean usoDeArCondicionado) {
        this.numeroDePessoas = numeroDePessoas;
        this.usoDeEnergiaRenovavel = usoDeEnergiaRenovavel;
        this.numeroDeLampadas = numeroDeLampadas;
        this.usoDeArCondicionado = usoDeArCondicionado;
    }

    public int getNumeroDePessoas() {
        return numeroDePessoas;
    }

    public void setNumeroDePessoas(int numeroDePessoas) {
        this.numeroDePessoas = numeroDePessoas;
    }

    public boolean isUsoDeEnergiaRenovavel() {
        return usoDeEnergiaRenovavel;
    }

    public void setUsoDeEnergiaRenovavel(boolean usoDeEnergiaRenovavel) {
        this.usoDeEnergiaRenovavel = usoDeEnergiaRenovavel;
    }

    public int getNumeroDeLampadas() {
        return numeroDeLampadas;
    }

    public void setNumeroDeLampadas(int numeroDeLampadas) {
        this.numeroDeLampadas = numeroDeLampadas;
    }

    public boolean isUsoDeArCondicionado() {
        return usoDeArCondicionado;
    }

    public void setUsoDeArCondicionado(boolean usoDeArCondicionado) {
        this.usoDeArCondicionado = usoDeArCondicionado;
    }

    @Override
    public double getCarbonFootprint() {
        int formula = 0;
        Double kilometros = 1.0;
        Double emissaoCO2 = kilometros / formula;
        if (this.usoDeArCondicionado == true && this.usoDeEnergiaRenovavel == true) {
            formula = 900;
            emissaoCO2 = kilometros / formula;
        } else {
            if (this.usoDeArCondicionado == false && this.usoDeEnergiaRenovavel == true) {
                formula = 500;
                emissaoCO2 = kilometros / formula;
            } else {
                if (this.usoDeArCondicionado == true && this.usoDeEnergiaRenovavel == false) {
                    formula = 600;
                    emissaoCO2 = kilometros / formula;
                } else {
                    if (this.usoDeArCondicionado == false && this.usoDeEnergiaRenovavel == false) {
                        formula = 100;
                        emissaoCO2 = kilometros / formula;
                    }
                }
            }
        }
        
            return emissaoCO2;
        }

    }
