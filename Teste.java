/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpoo2_lista1;

import java.util.Scanner;

/**
 *
 * @author Carlos Antonio
 */
public class Teste {

	public static void main(final String[] args) {

		final Banco banco = new Banco();
		banco.criaConta();
		banco.criaConta();

		banco.TransferenciaContas();
		banco.excluirConta();
	}
}
