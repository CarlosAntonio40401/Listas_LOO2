package aulaHerenca_Exercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Antonio
 */
public class Coker extends Cachorro{
    
    
    boolean tosa;

    public boolean precisaTosa() {
        
//        if(tosa==true){
//            JOptionPane.showMessageDialog(null, "Precisa Tosar:");
//        }else{
//            JOptionPane.showMessageDialog(null, "Não precisa Tosar:");
//        }
        return tosa;
    }

    public void setTosa(boolean tosa) {
        this.tosa = tosa;
    }

    public Coker(boolean tosa, String raca, String nome, String tipo, String cor) {
        super(raca, nome, tipo, cor);
        this.tosa = tosa;
    }
     
    
    
    

    
}
