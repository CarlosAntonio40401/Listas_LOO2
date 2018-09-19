package lista6;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Carlos Antonio
 */
public class Exercicio3 {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int[] vetor = new int[10];
        int posicao = 0, valor = 0;

        System.out.println("Preencha as 10 posições do array:");
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Informe a posição do array:");
                posicao = leitura.nextInt();
                System.out.println("Informe o valor para o array:");
                valor = leitura.nextInt();
                System.out.println("___________________________________");
                vetor[posicao] = valor;
            } catch (ArrayIndexOutOfBoundsException e) {

                System.err.println(e);
                System.out.println(" O Array tem 10 posições, ele vai do indice 0 até o indice 9, por favor informe um indice que esteja dentro desse intervalo");
            } catch (InputMismatchException e) {
                leitura.next();
                System.err.println(e);
                System.out.println("O Array é do tipo inteiro, por favor informe um número inteiro.");
            }

        }

        System.out.println("Valores guardado com sucesso!!!");

       
    }
}
