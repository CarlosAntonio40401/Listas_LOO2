package aulaHerenca_Exercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Antonio
 */
public class TesteVendedor {

    public static void main(String[] args) {

        Vendedor vendedor = new Vendedor();

        String nome = null, idade = null, altura = null, sexo = null, salario = null, valorVenda = null, comissao = null;

        JOptionPane.showInputDialog("Informe o nome do vendedor: ");
        vendedor.setNome(nome);
        JOptionPane.showInputDialog("Informe a idade:");
        vendedor.setIdade(Integer.parseInt(idade));
        JOptionPane.showInputDialog("Informe a altura:");
        vendedor.setAltura(Float.parseFloat(altura));
        JOptionPane.showInputDialog("Informe o sexo:");
        vendedor.setSexo(sexo);
        JOptionPane.showInputDialog("Informe o salário:");
        vendedor.setSalario(Float.parseFloat(salario));
        JOptionPane.showInputDialog("Informe o valor da venda:");
        vendedor.setValorVenda(Float.parseFloat(valorVenda));
        JOptionPane.showInputDialog("Informe a comissão:");
        vendedor.setComissao(Float.parseFloat(comissao));

        JOptionPane.showMessageDialog(null, "Nome:" + vendedor.getNome() + "\n Idade:" + vendedor.getIdade() + "\n Altura:"
                + vendedor.getIdade() + "\n Sexo:" + vendedor.getSexo() + "\n Salário:" + vendedor.getValorVenda()
                + "\n Comissão:" + vendedor.getComissao() + "Lucros:" + vendedor.obterLucros());
    }

}
