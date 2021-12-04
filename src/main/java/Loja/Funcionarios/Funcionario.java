package Loja.Funcionarios;

import Loja.Cliente;
import Loja.Endereco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcionario {

    int ID;
    String nome;
    int CPF;
    int dataNasc;
    int telefone;
    Endereco endereco;


    static int qtdFunc= 0;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public int getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(int dataNasc) {
        this.dataNasc = dataNasc;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public static int getQtdFunc() {
        return qtdFunc;
    }

    public static void setQtdFunc(int qtdFunc) {
        Funcionario.qtdFunc = qtdFunc;
    }

    public static void cadastrarCliente(List<Cliente> list) {

        Scanner sc= new Scanner(System.in);

        Cliente c = new Cliente();

        System.out.println(" --- CADASTRO DE CLIENTE --- ");
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