package aulaHerenca_Exercicio2;


public class Administrador extends Empregado {
    
    
    private float ajudaDeCusto;

    public float getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(float ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
    
    @Override
    public float obterLucros(){
        return   ( super.getSalario()+this.ajudaDeCusto);
    }
    
}
