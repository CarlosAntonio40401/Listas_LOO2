
package aulaHerenca_Exercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Antonio
 */
public class FornecedorTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Fornecedor fornecedor = new Fornecedor();
         String valorMaximo=null,nome=null,idade=null,altura=null,sexo=null,valorEmDivida=null;
         
        nome = JOptionPane.showInputDialog(null,"Informe o nome:");
        fornecedor.setNome(nome);
        idade=JOptionPane.showInputDialog(null,"Informe a idade:");
        fornecedor.setIdade(Integer.parseInt(idade));
        altura=JOptionPane.showInputDialog(null,"Informe a altura:");
        fornecedor.setAltura(Float.parseFloat(altura));
        sexo=JOptionPane.showInputDialog(null,"Informe o sexo:");
        fornecedor.setSexo(sexo);
        valorMaximo=JOptionPane.showInputDialog(null,"Informe o valor do crédito máximo:");
        fornecedor.setCreditoMaximo(Double.parseDouble(valorMaximo));
        
        valorEmDivida= JOptionPane.showInputDialog(null,"Informe o valor em divida:");
        fornecedor.setValorEmDivida(Double.parseDouble(valorEmDivida));
        
        JOptionPane.showMessageDialog(null, "Dados do fornecedor:"+"\n Nome:"+fornecedor.getNome()+"Idade:"+fornecedor.getIdade()+
              "Altura:"+fornecedor.getAltura()+ "Sexo:"+fornecedor.getSexo()+"Valor máximo do crédito:"+fornecedor.getCreditoMaximo()+
               "Sexo:"+fornecedor.getSexo()+"Valor máximo do crédito:"+fornecedor.getCreditoMaximo()+"Valor em dívida:"+fornecedor.getValorEmDivida()+
                "Saldo:"+fornecedor.obterSaldo());
       
        
        
        
    }
    
}
