package Loja.Funcionarios;

import Loja.Cliente;

import java.util.List;
import java.util.Scanner;

public class Caixa extends Funcionario {

    public static void oferecerCartao(List<Cliente> lista) {

        Scanner sc = new Scanner(System.in);

        Cliente cliente = new Cliente();

        System.out.println("Qual o nome do cliente do qual deseja-se atualizar as info. do cartao? ");
        cliente.setNome(sc.nextLine());

        if(cliente.getNome() == null)
            System.out.println("Nao ha nenhum cliente com esse nome. \n");
        else {
            System.out.println("Deseja adicionar um cartao para o cliente " + cliente.getNome() + " ?");
            System.out.println(" 1 - SIM \n 0 - NAO ");
            cliente.setPossuiCartao(sc.nextInt());

            lista.forEach(cliente1 -> {
                if (cliente1.getNome() == cliente.getNome()) {
                    cliente1.setPossuiCartao(cliente.isPossuiCartao());
                }

            });

            System.out.println(" Informacoes do cartao atualizadas com sucesso! ");
            System.out.println(" ");
        }
    }

}
