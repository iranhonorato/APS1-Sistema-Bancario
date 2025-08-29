package org.example;
import java.time.LocalDate;
import conta.corrente.*;
import cliente.*;

public class Main {
    public static void main(String[] args) {
        String opcao = "0";

        do {
            System.out.println("""
                    1 - Realizar Saque 
                    2 - Realizar Depósito
                    3 - Ver Movimentações
                    4 - Ver Saldo 
                    5 - Ver Limite
                    6 - Ver Cartões
                    10 - Encerrar a Operação 
                    """);
            System.out.println("\n");

            opcao = System.console().readLine();

            if (opcao.equals("1")) {
                System.out.println("Você a Primeira Operação");
            } else if (opcao.equals("2")) {
                System.out.println("Você a Segunda Operação");
            } else if (opcao.equals("3")) {
                System.out.println("Você a Terceira Operação");
            } else if (opcao.equals("4")) {
                System.out.println("Você escolheu a Quarta Operação");
            } else if (opcao.equals("5")) {
                System.out.println("Você escolheu Encerrar o protocolo");
            }

        } while (!opcao.equals("10"));


    }
}