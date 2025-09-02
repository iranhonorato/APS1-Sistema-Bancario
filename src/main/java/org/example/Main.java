package org.example;
import java.time.LocalDate;
import java.util.ArrayList;

import conta.corrente.*;
import cliente.*;

import static conta.corrente.Cartao.Status.ATIVO;
import static conta.corrente.Cartao.Status.INATIVO;
import static conta.corrente.Movimentacao.Tipo;

public class Main {
    public static void main(String[] args) {
        Cliente eu = new Cliente("111.111.111-11","Iran", LocalDate.of(2002, 02, 16), 10000f);
        ContaCorrente meuBanco = new ContaCorrente("01", "01", 15000f, 30000f, eu);
        Cartao cartao1 = new Cartao("777", "debito", LocalDate.of(2030, 01, 01), ATIVO);
        Cartao cartao2 = new Cartao("666", "crédito", LocalDate.of(2030, 01, 01), INATIVO);

        meuBanco.adicionarCartoes(cartao1);
        meuBanco.adicionarCartoes(cartao2);

        String opcao = "0";

        do {
            System.out.println("""
                    1 - Realizar Saque 
                    2 - Realizar Depósito
                    3 - Verificar saldo
                    4 - Ver Movimentações
                    5 - Ver Saldo 
                    6 - Ver Limite
                    7 - Ver Cartões
                    10 - Encerrar a Operação 
                    """);
            System.out.println("\n");

            opcao = System.console().readLine();

            if (opcao.equals("1")) {
                System.out.println("Você a Primeira Operação");
                System.out.println("Quanto você quer sacar?");
                String saque = System.console().readLine();
                meuBanco.saque(Float.parseFloat(saque));





            } else if (opcao.equals("2")) {
                System.out.println("Você a Segunda Operação");
                System.out.println("Quanto você quer Depositar?");
                String deposito = System.console().readLine();
                meuBanco.deposito(Float.parseFloat(deposito));


            } else if (opcao.equals("3")) {
                System.out.println("Você a Terceira Operação");
                System.out.println("Seu saldo: " + meuBanco.getSaldo());


            } else if (opcao.equals("4")) {
                System.out.println("Você a Quarta Operação");
                ArrayList<Movimentacao> movimentacoes = new ArrayList<>();
                movimentacoes = meuBanco.listaMovimentacoes();
                for (int i = 0; i < movimentacoes.size(); i++) {
                    System.out.println("Sua " +(i+1)+ "ª movimentação: " + movimentacoes.get(i).getTipo() + " - " + movimentacoes.get(i).getValor());

                }




            } else if (opcao.equals("5")) {
                System.out.println("Você escolheu a Quinta Operação");
                System.out.println("Seu saldo é de: " + meuBanco.getSaldo());





            } else if (opcao.equals("6")) {
                System.out.println("Você escolheu a Sexta Operação");
                System.out.println("Seu saldo é de: " + meuBanco.getLimite());
            }



            else if (opcao.equals("7")) {
                System.out.println("Você escolheu a Sétima Operação");
                for (int i = 0; i < meuBanco.listaCartoes().size(); i ++) {
                    System.out.println("Seus cartões são: " + meuBanco.listaCartoes().get(i).getNumeroCartao());
                }
            }





            else if (opcao.equals("10")) {
                System.out.println("Você escolheu Encerrar o protocolo");
            }

        } while (!opcao.equals("10"));


    }
}