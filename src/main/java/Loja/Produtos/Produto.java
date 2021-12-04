package Loja.Produtos;

public class Produto {

    String nome;
    String tipo;
    int codigo;
    float valor;
    int garantia;

    public static int qtdProdutos;

    public String getNome()  {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void isGarantia() {
        if(this.garantia == 0)
            System.out.println("NAO");
        else System.out.println("SIM");
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public static int getQtdProdutos() {
        return qtdProdutos;
    }
}
