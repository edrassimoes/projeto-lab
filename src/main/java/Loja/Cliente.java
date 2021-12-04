package Loja;

public class Cliente {

    String nome;
    int CPF;
    int dataNasc;
    Endereco endereco;
    int telefone;
    int possuiCartao;

    static int qtdClientes;

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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int isPossuiCartao() {
        return this.possuiCartao;
    }

    public void setPossuiCartao(int possuiCartao) {
        this.possuiCartao = possuiCartao;
    }

    public static int getQtdClientes() {
        return qtdClientes;
    }

}
