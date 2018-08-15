package exercicio2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carlos Antonio
 */
public class Pais {
private String nome;
private String nomeCapital;
private double dimensao;
private ArrayList<String> paisesFronteiras;

    public Pais(String nome, String nomeCapital, double dimensao) {
        this.nome = nome;
        this.nomeCapital = nomeCapital;
        this.dimensao = dimensao;
    }

   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeCapital() {
        return nomeCapital;
    }

    public void setNomeCapital(String nomeCapital) {
        this.nomeCapital = nomeCapital;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }
    
    public void paisIgual(){
        
    }

    public boolean equals(final Pais outro){
        return true;
        
        // falta terminar
    }
    

public ArrayList<String> paisesFronteira( ){
    Scanner leitura= new Scanner (System.in);
    System.out.println("Digite 1 se o pais possui fronteiras");
    int opcao= leitura.nextInt();
     while(opcao==1){
    System.out.println("Informe o pais que faz fronteira");
    String paisesFronteiras=leitura.next();
    
this.paisesFronteiras.add(paisesFronteiras);

    System.out.println("Digite 1 se o pais possui fronteiras");
     opcao= leitura.nextInt();
     }
    
        
    return this.paisesFronteiras;
}

public void  listaPaises(){
    
    for (int i=0; i<this.paisesFronteiras.size(); i++) {
        System.out.println(i);
    }
    
}

public ArrayList<String> listaPaisVizinho(Pais pais){
    ArrayList<String> paisesVizinhos= new ArrayList<String>();
    // falta terminar
    return paisesVizinhos;
}

}
