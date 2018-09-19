package lista6;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author Carlos Antonio
 */
public class Exercicio2 {


    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int n = 0, i = 0, soma = 0;

        do {

            try {
                System.out.println("Informe um numero:");
                n = leitura.nextInt();
                i++;
            } catch (InputMismatchException e) {
                System.err.println(e);
                System.out.println("Informe um número do tipo inteiro, não use letras, caracteres especiais e nem números fracionados!");

                n = 0;

                // para nao entrar no loop
                leitura.next();

            }

            try {
                analisa(soma + n);
                // if (soma + n > 100) {
            } catch (ExcecaoAcimaDeCem e) {
                System.err.println(e);

                System.out.println("Valor somado:" + soma);
                if (i > 0) {
                    System.out.println("Foram somandos " + (i - 1) + " números");
                }
                System.out.println("Foram somandos " + (i) + " números");
                float media = soma / i;
                System.out.println("A média dos números é:" + (media));
            }

            soma = soma + n;
        } while (soma <= 100);

    }

    public static void analisa(int soma) throws ExcecaoAcimaDeCem {

        if (soma > 100) {

            throw new ExcecaoAcimaDeCem("A soma dos números não pode ultrapassar o valor 100.");
        }
    }
}
