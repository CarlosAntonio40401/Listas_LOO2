package aulaHerenca_Exercicio2;

import javax.swing.JOptionPane;

public class TesteEmpregado {

    public static void main(String[] args) {

        Empregado empregado = new Empregado();
        String nome = null,idade,altura=null,sexo = null,salario=null;

        nome=JOptionPane.showInputDialog(null, "Informe o nome do empregado:");
        empregado.setNome(nome);
        
        idade = JOptionPane.showInputDialog(null, "Informe a idade:");
        empregado.setIdade(Integer.parseInt(idade));
      JOptionPane.showInputDialog(null,"Informe a altura:");
       empregado.setAltura(Float.parseFloat(altura));
        JOptionPane.showInputDialog(null,"Informe o sexo:");
        empregado.setSexo(sexo);   
       JOptionPane.showInputDialog(null,"Informe o salário:");
        empregado.setSalario(Float.parseFloat(salario));
        
        
        JOptionPane.showMessageDialog(null,"Nome do empregado:"+ empregado.getNome()+"\n Idade:"+empregado.getIdade()
        +"\n Altura:"+empregado.getAltura()+"\n Sexo:"+empregado.getSexo()+"\n Salário:"+empregado.getSalario()+"\n Lucros:"+empregado.obterLucros());
        
        

    }

}
