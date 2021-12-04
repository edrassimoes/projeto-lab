import Loja.Funcionarios.Atendente;
import Loja.Funcionarios.Caixa;
import Loja.Funcionarios.Funcionario;
import Loja.Funcionarios.Gerente;
import Loja.Cliente;
import Loja.Loja;
import Loja.Produtos.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scMain = new Scanner(System.in);

        List<Cliente> listaClien = new ArrayList<>();
        List<Funcionario> listaFunc = new ArrayList<>();
        List<Produto> listaProd = new ArrayList<>();

        Loja lojaPrincipal = new Loja();

        lojaPrincipal = Loja.novaLoja(listaFunc);

        int w = 1;

        do {

            System.out.println("Acessar como: ");
            System.out.println(" 1 - Gerente \n 2 - Atendente \n 3 - Caixa \n 4 - Sair ");

            int aux = scMain.nextInt();

            switch (aux) {

                case 1:

                    int w1 = 1;

                    do {

                        System.out.println(" --- ACESSANDO COMO GERENTE --- ");

                        System.out.println("Entre com o valor do servico que deseja utilizar: ");
                        System.out.println(" 1 - Cadastrar funcionario \n 2 - Remover funcionario \n 3 - Info. dos funcionarios \n 4 - Info. da Loja \n 5 - Cadastrar produto \n 6 - Remover produto \n 7 - Alterar valor do produto \n 8 - Cadastrar cliente \n 9 - Remover cliente \n 10 - Sair");

                        int aux2 = scMain.nextInt();

                        switch (aux2) {

                            case 1:
                                Gerente.cadastrarFuncionario(listaFunc);
                                break;

                            case 2:
                                Gerente.removerFuncionario(listaFunc);
                                break;

                            case 3:
                                Gerente.infoFuncionarios(listaFunc);
                                break;

                            case 4:
                                Gerente.infoLoja(lojaPrincipal);
                                break;

                            case 5:
                                Gerente.cadastrarProduto(listaProd);
                                break;

                            case 6:
                                Gerente.removerProduto(listaProd);
                                break;

                            case 7:
                                Gerente.mudarValor(listaProd);
                                break;

                            case 8:
                                Gerente.cadastrarCliente(listaClien);
                                break;

                            case 9:
                                Gerente.removerCliente(listaClien);
                                break;

                            default:
                                w1 = 0;
                                System.out.println("Saindo...");
                                break;
                        }
                    } while (w1 == 1);
                    break;

                case 2:

                    int w2 = 1;

                    do {

                        System.out.println(" --- ACESSANDO COMO ATENDENTE --- ");

                        System.out.println("Entre com o valor do servico que deseja utilizar: ");
                        System.out.println(" 1 - Cadastrar cliente \n 2 - Remover cliente \n 3 - Info. dos produtos \n 4 - Sair ");

                        int aux3 = scMain.nextInt();

                        switch (aux3) {

                            case 1:
                                Atendente.cadastrarCliente(listaClien);
                                break;

                            case 2:
                                Atendente.removerCliente(listaClien);
                                break;

                            case 3:
                                Atendente.infoProdutos(listaProd);
                                break;

                            default:
                                w2 = 0;
                                System.out.println("Saindo...");
                                break;
                        }
                    } while (w2 == 1);
                    break;

                case 3:

                    int w3 = 1;

                    do {

                        System.out.println(" --- ACESSANDO COMO CAIXA --- ");

                        System.out.println("Entre com o valor do servico que deseja utilizar: ");
                        System.out.println(" 1 - Cadastrar cliente \n 2 - Remover cliente \n 3 - Cartao da loja \n 4 - Sair ");

                        int aux4 = scMain.nextInt();

                        switch (aux4) {

                            case 1:
                                Caixa.cadastrarCliente(listaClien);
                                break;

                            case 2:
                                Caixa.removerCliente(listaClien);
                                break;

                            case 3:
                                Caixa.oferecerCartao(listaClien);
                                break;

                            default:
                                w3 = 0;
                                System.out.println("Saindo...");
                                break;
                        }
                    } while (w3 == 1);
                    break;

                default:
                    w = 0;
                    System.out.println("Fechando o programa...");
                    break;

            }

        } while (w == 1);

    }

}