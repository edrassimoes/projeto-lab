package Loja;

import java.util.Scanner;

public class Endereco {

    String rua;
    String bairro;
    int num;
    int CEP;
    String complemento = null;

    public static Endereco cadastrarEnd(){

        Scanner scEnd = new Scanner(System.in);

        Endereco e1 = new Endereco();

        System.out.println(" --- CADASTRANDO ENDERECO --- ");
        System.out.println("Entre com o nome da rua: ");
        e1.rua = scEnd.nextLine();
        System.out.println("Entre com o nome do bairro: ");
        e1.bairro = scEnd.nextLine();
        System.out.println("Entre com o numero do local: ");
        e1.num = scEnd.nextInt();
        System.out.println("Entre com o CEP do local: ");
        e1.CEP = scEnd.nextInt();
        System.out.println("E nescessario um complemento? ");
        System.out.println(" - Digite 1 para SIM");
        System.out.println(" - Digite 0 para NAO");
        int aux = scEnd.nextInt();
        scEnd.nextLine();

        if (aux == 1){
            System.out.println("Entre com o complemento: ");
            e1.complemento = scEnd.nextLine();
        } else {
            e1.complemento = null;
        }
        System.out.println("Endereco cadastrado com sucesso! \n");
        return e1;
    };

    public static void mostrarEnd(Endereco e){

        System.out.println("Rua: " + e.rua);
        System.out.println("Bairro: " + e.bairro);
        System.out.println("Numero: " + e.num);
        System.out.println("CEP: " + e.CEP);
        System.out.println("Complemento: " + e.complemento);

    }

}
