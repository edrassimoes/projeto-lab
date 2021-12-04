package Loja.Funcionarios;

import Loja.Produtos.Produto;

import java.util.List;

public class Atendente extends Funcionario {

    public static void infoProdutos(List<Produto> list) {

        System.out.println(" --- Lista de Produtos --- \n");

        list.forEach(produto -> {

            System.out.println(" ");
            System.out.println("Nome do produto: " + produto.getNome());
            System.out.println("Tipo do produto: "  + produto.getTipo());
            System.out.println("Codigo do produto: " + produto.getCodigo());
            System.out.println("Valor do produto: " + produto.getValor());
            System.out.println("Acompanha garantia: ");
            produto.isGarantia();
            System.out.println(" ");
        });

    }

}
