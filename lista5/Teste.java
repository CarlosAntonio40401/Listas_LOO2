package lista5;

import java.util.Scanner;

/**
 *
 * @author Carlos Antonio
 */
public class Teste {

    public static void main(String[] args) {

        // Exercício 5 letra A
        Administrativo administrativo = new Administrativo(0, "");

        administrativo.setMatricula(45);
        administrativo.setNome("Angela");
        administrativo.adicional(1000.0);

        System.out.println(administrativo.exibirDados());

        Tecnico tecnico = new Tecnico(0, "");

        tecnico.setMatricula(508);
        tecnico.setNome("Ricardo");
        System.out.println(tecnico.exibirDados());

        // Exercício 5 letra B
        Animal animal;
        animal = new Cachorro();
        Cachorro cachorro = (Cachorro) animal;

        System.out.println("Cachorro latindo:" + cachorro.late());

        Gato gato = new Gato();

        System.out.println("O gato miando:" + gato.mia());

        System.out.println(cachorro.caminhar());
        System.out.println(gato.caminhar());

        // Exercício 5 letra C
        Rica rica = new Rica();

        rica.setNome("Aldo");
        rica.setIdade(25);
        rica.setDinheiro(50000.00);
        System.out.println("Dados da pessoa rica:");
        System.out.println("Nome:" + rica.getNome());
        System.out.println("Idade:" + rica.getIdade());
        System.out.println("Valor em dinheiro:" + rica.getDinheiro());
        System.out.println("Valor em compras:" + rica.fazCompras(500.00));

        Pobre pobre = new Pobre();

        pobre.setNome("Manuel");
        pobre.setIdade(45);
        System.out.println("Dados da pessoa pobre:");
        System.out.println("Nome:" + pobre.getNome());
        System.out.println("Idade:" + pobre.getIdade());
        System.out.println("Trabalha:" + pobre.trabalha());

        Miseravel miseravel = new Miseravel();

        miseravel.setNome("Joselia");
        miseravel.setIdade(30);
        System.out.println("Dados da pessoa miserável:");
        System.out.println("Nome:" + miseravel.getNome());
        System.out.println("Idade:" + miseravel.getIdade());
        System.out.println("Mendigar:" + miseravel.mendiga());

        // Exercício 5 letra D
        Ingresso ingresso = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tipo do ingresso, Digite 1 para normal e 2 para vip:");
        int opcao = scanner.nextInt();

        if (opcao == 1) {

            Normal normal = new Normal();
            normal.setValorIngresso(1500);
            System.out.println("Ingresso normal.");

            System.out.println(normal.ingressoNormal());
        } else if (opcao == 2) {
            System.out.println("Ingresso vip");
            System.out.println("Digite 1 para camarote superior e 2 para camarote inferior");
            opcao = scanner.nextInt();
            if (opcao == 1) {
                CamaroteSuperior camaroteSuperior = new CamaroteSuperior();
                camaroteSuperior.setValorIngresso(100);
                camaroteSuperior.setAdicional(15);
                System.out.println("Camarote superior");
                System.out.println("Valor do ingresso:" + camaroteSuperior.imprimeValor());
            } else if (opcao == 2) {
                CamaroteInferior camaroteInferior = new CamaroteInferior();
                camaroteInferior.setLocalizacao("Setor sul");
                camaroteInferior.setValorIngresso(200);
                System.out.println("Localizado no " + camaroteInferior.getLocalizacao());
                System.out.println("Valor do ingresso:" + camaroteInferior.getValorIngresso());
            }
        }

        // Exercício 5 letra e
        System.out.println("Digite 1 para um novo imóvel ou 2 para um velho imóvel.");
        opcao = scanner.nextInt();
        if (opcao == 1) {
            Novo novo = new Novo();
            novo.setAdicional(200);
            novo.setEndereco("Rua 05, avenida Presidente Vargas");
            novo.setPreco(30000);
            System.out.println("Dados do imóvel novo:");
            System.out.println("Endereço:" + novo.getEndereco());
            System.out.println("Preço:" + novo.getPreco());
            System.out.println("Valor com o adicional:" + novo.valorComAdicional());
        } else if (opcao == 2) {
            Velho velho = new Velho();

            velho.setEndereco("Plano piloto");
            velho.setDesconto(500);
            velho.setPreco(60000);
            System.out.println("Dados do imóvel velho:");
            System.out.println("Endereço:" + velho.getEndereco());
            System.out.println("Preço:" + velho.getPreco());
            System.out.println("Preço com desconto:" + velho.precoComDesconto());
        }
    }
}
