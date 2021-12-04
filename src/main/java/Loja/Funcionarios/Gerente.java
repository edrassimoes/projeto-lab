package Loja.Funcionarios;

import Loja.Endereco;
import Loja.Cliente;
import Loja.Loja;
import Loja.Produtos.Produto;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class Gerente extends Funcionario {

    public static void cadastrarFuncionario(List<Funcionario> lista) {

        Scanner scGer = new Scanner(System.in);


        System.out.println(" --- CADASTRAR NOVO FUNCIONARIO --- ");
        System.out.println(" ");
        System.out.println("Que tipo de funcionario se deseja cadastrar? ");
        System.out.println(" - 1 para Gerente");
        System.out.println(" - 2 para Atendente");
        System.out.println(" - 3 para Caixa");
        System.out.println(" - 4 para Sair");
        System.out.println(" ");

        int aux = scGer.nextInt();
        scGer.nextLine();

        switch (aux){

            case 1:
                Funcionario f1 = new Gerente();
                System.out.println("Entre com o nome do funcionario: ");
                f1.nome = scGer.nextLine();
                System.out.println("Entre com o CPF do funcionario: ");
                f1.CPF = scGer.nextInt();
                System.out.println("Entre com a data de nascimento do funcionario (somente numeros): ");
                f1.dataNasc = scGer.nextInt();
                System.out.println("Entre com o telefone do funcionario (somente numeros): ");
                f1.telefone = scGer.nextInt();
                System.out.println("Entre com o endereco do funcionario: ");
                f1.endereco = Endereco.cadastrarEnd();

                Funcionario.qtdFunc++;
                f1.ID = Funcionario.qtdFunc;

                lista.add(f1);

                System.out.println(" Novo gerente cadastrado com sucesso!");
                System.out.println(" ");
                break;

            case 2:
                Funcionario f2 = new Atendente();
                System.out.println("Entre com o nome do funcionario: ");
                f2.nome = scGer.nextLine();
                System.out.println("Entre com o CPF do funcionario: ");
                f2.CPF = scGer.nextInt();
                System.out.println("Entre com a data de nascimento do funcionario (somente numeros): ");
                f2.dataNasc = scGer.nextInt();
                System.out.println("Entre com o telefone do funcionario (somente numeros): ");
                f2.telefone = scGer.nextInt();
                System.out.println("Entre com o endereco do funcionario: ");
                f2.endereco = Endereco.cadastrarEnd();

                Funcionario.qtdFunc++;
                f2.ID = Funcionario.qtdFunc;

                lista.add(f2);

                System.out.println(" Novo atendente cadastrado com sucesso!");
                System.out.println(" ");
                break;

            case 3:
                Funcionario f3 = new Caixa();
                System.out.println("Entre com o nome do funcionario: ");
                f3.nome = scGer.nextLine();
                System.out.println("Entre com o CPF do funcionario: ");
                f3.CPF = scGer.nextInt();
                System.out.println("Entre com a data de nascimento do funcionario (somente numeros): ");
                f3.dataNasc = scGer.nextInt();
                System.out.println("Entre com o telefone do funcionario (somente numeros): ");
                f3.telefone = scGer.nextInt();
                System.out.println("Entre com o endereco do funcionario: ");
                f3.endereco = Endereco.cadastrarEnd();

                Funcionario.qtdFunc++;
                f3.ID = Funcionario.qtdFunc;

                lista.add(f3);

                System.out.println(" Novo caixa cadastrado com sucesso!");
                System.out.println(" ");
                break;

            default:
                System.out.println("Saindo...");
                break;

        }

    }

    public static void removerFuncionario(List<Funcionario> list) {

        Scanner sc = new Scanner(System.in);
        List<Funcionario> listaRemover = new ArrayList<>();
        Funcionario fAux = new Funcionario();

        System.out.println(" ");
        System.out.println("Qual funcionario sera removido?");
        System.out.println("Entre com o ID do funcionario: ");
        fAux.setID(sc.nextInt());

        list.forEach(funcionario -> {
            if (funcionario.getID() == fAux.getID()){
                listaRemover.add(funcionario);
            }
        });

        list.removeAll(listaRemover);

        System.out.println("Funcionario removido com sucesso! ");
        System.out.println(" ");

    }

    public static void infoFuncionarios(List<Funcionario> list) {

        System.out.println(" --- Lista de Funcionarios --- \n");

        list.forEach(funcionario -> {

            System.out.println(" ");
            System.out.println("ID: " + funcionario.getID());
            System.out.println("Nome: "  + funcionario.getNome());
            System.out.println("CPF: " + funcionario.getCPF());
            System.out.println("Data de nascimento: " + funcionario.getDataNasc());
            System.out.println("Telefone: " + funcionario.getTelefone());
            System.out.println("Endereco: ");
            Endereco.mostrarEnd(funcionario.getEndereco());
            System.out.println(" ");
        });

    }

    public static void infoLoja(Loja loja) {

        System.out.println(" --- Informacoes da Loja --- ");
        System.out.println("Nome da Loja: " + loja.getNome());
        System.out.println("Endereco da Loja: ");
        Endereco.mostrarEnd(loja.getEndereco());
        System.out.println("Gerente(s) da loja: " + loja.getGerente().nome);
        System.out.println("Quantidade de funcionarios: " + Funcionario.getQtdFunc());
        System.out.println("Quantidade de produtos: " + Produto.getQtdProdutos());
        System.out.println("Quantidade de clientes: " + Cliente.getQtdClientes());
        System.out.println(" ");
    }

    public static void mudarValor(List<Produto> list) {

        Scanner sc = new Scanner(System.in);

        Produto pAux = new Produto();

        System.out.println(" ");
        System.out.println("Qual produto recebera alteração em seu valor?");
        System.out.println("Entre com o codigo do produto: ");
        pAux.setCodigo(sc.nextInt());
        System.out.println("Entre com o novo valor do produto: ");
        pAux.setValor(sc.nextFloat());
        System.out.println(" ");

        list.forEach(produto -> {
            if (produto.getCodigo() == pAux.getCodigo() ){
                produto.setValor(pAux.getValor());
            }
        });
        System.out.println("Valor alterado com sucesso! ");
        System.out.println(" ");
    }

    public static void cadastrarProduto(List<Produto> list) {

        Scanner sc= new Scanner(System.in);

        Produto p = new Produto();

        System.out.println(" --- CADASTRO DE PRODUTOS --- ");
        System.out.println(" ");
        System.out.println("Entre com o nome do produto: ");
        p.setNome(sc.nextLine());
        System.out.println("Entre com o tipo do produto: ");
        p.setTipo(sc.nextLine());
        System.out.println("Entre com o codigo do produto: ");
        p.setCodigo(sc.nextInt());
        System.out.println("Entre com o valor do produto: ");
        p.setValor(sc.nextFloat());
        System.out.println("Esse produto possui garantia? ");
        System.out.println(" 1 - SIM \n 0 - NAO");
        p.setGarantia(sc.nextInt());

        list.add(p);

        System.out.println("Produto cadastrado com sucesso! ");
        System.out.println(" ");

    }

    public static void removerProduto(List<Produto> list) {

        Scanner sc = new Scanner(System.in);
        List<Produto> listaRemover = new ArrayList<>();
        Produto pAux = new Produto();

        System.out.println(" --- REMOVER PRODUTO --- ");
        System.out.println(" ");
        System.out.println("Qual produto sera removido?");
        System.out.println("Entre com o codigo do produto: ");
        pAux.setCodigo(sc.nextInt());
        System.out.println(" ");

        list.forEach( produto -> {
            if (produto.getCodigo() == pAux.getCodigo()){
                listaRemover.add(produto);
            }
        });

        list.removeAll(listaRemover);

        System.out.println("Produto removido com sucesso! ");
        System.out.println(" ");

    }

    public static void cadastrarCliente(List<Cliente> list) {

        Scanner sc= new Scanner(System.in);

        Cliente c = new Cliente();

        System.out.println(" --- CADASTRO DE CLIENTE --- \n");
        System.out.println("Entre com o nome do cliente: ");
        c.setNome(sc.nextLine());
        System.out.println("Entre com o CPF do cliente: ");
        c.setCPF(sc.nextInt());
        System.out.println("Entre com a data de nascimento do cliente: ");
        c.setDataNasc(sc.nextInt());
        System.out.println("Entre com o telefone do cliente: ");
        c.setTelefone(sc.nextInt());
        System.out.println("O cliente deseja possuir um cartao da loja? ");
        System.out.println( " 1 - SIM \n 0 - NAO ");
        c.setPossuiCartao(sc.nextInt());
        c.setEndereco(Endereco.cadastrarEnd());

        System.out.println("Cliente cadastrado com sucesso! ");
        System.out.println(" ");

        list.add(c);

    }

    public static void removerCliente(List<Cliente> list) {

        Scanner sc = new Scanner(System.in);
        List<Cliente> listaRemover = new ArrayList<>();
        Cliente cAux = new Cliente();

        System.out.println(" --- REMOVER CLIENTE --- ");
        System.out.println(" ");
        System.out.println("Qual cliente sera removido?");
        System.out.println("Entre com o nome do cliente: ");
        cAux.setNome(sc.nextLine());
        System.out.println(" ");

        list.forEach( cliente -> {
            if (cliente.getNome() == cAux.getNome()){
                listaRemover.add(cliente);
            }
        });

        list.removeAll(listaRemover);

        System.out.println("Cliente removido com sucesso! ");
        System.out.println(" ");

    }

}
