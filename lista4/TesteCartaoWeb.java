package lista4;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Antonio
 */
public class TesteCartaoWeb {

    
    public static void main(String[] args) {
        
         CartaoWeb[] cartao = new CartaoWeb[3];

        Aniversario aniversario = new Aniversario("");
        Natal natal = new Natal("");
        DiaDosNamorados diaDosNamorados = new DiaDosNamorados("");

        cartao[0] = aniversario;
        cartao[1] = natal;
        cartao[2] = diaDosNamorados;

        for (int i = 0; i < cartao.length; i++) {
            String remetente = JOptionPane.showInputDialog("Remetente:");

            JOptionPane.showMessageDialog(null, cartao[i].retornarMensagem(remetente));
        }

    }
    
}
