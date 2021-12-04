package Loja;

import Loja.Funcionarios.Funcionario;
import Loja.Funcionarios.Gerente;
import java.util.List;
import java.util.Scanner;

public class Loja {

    String nome;
    Endereco endereco;
    Gerente gerente;

    public static Loja novaLoja(List<Funcionario> list){

        Scanner sc = new Scanner(System.in);

        Loja loja = new Loja();

        System.out.println(" --- CADASTRANDO UMA NOVA LOJA --- \n");

        System.out.println(" --- INFORMACOES DA LOJA --- ");
        System.out.println("Entre com o nome da loja: ");
        loja.setNome(sc.nextLine());
        System.out.println("Entre com o endereco da loja: \n");
        loja.setEndereco(Endereco.cadastrarEnd());

        Funcionario f = new Gerente();

        System.out.println("Entre com o nome do Gerente: ");
        f.setNome(sc.nextLine());
        System.out.println("Entre com o CPF do Gerente: ");
        f.setCPF(sc.nextInt());
        System.out.println("Entre com a data de nascimento do Gerente (somente numeros): ");
        f.setDataNasc(sc.nextInt());
        System.out.println("Entre com o telefone do Gerente (somente numeros): ");
        f.setTelefone(sc.nextInt());
        System.out.println("Entre com o endereco do gerente: \n");
        f.setEndereco(Endereco.cadastrarEnd());

        Funcionario.setQtdFunc(1);
        f.setID(Funcionario.getQtdFunc());

        loja.setGerente((Gerente) f);

        list.add(f);

        System.out.println("Loja cadastrada com sucesso!");
        System.out.println(" ");

        return loja;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

}
