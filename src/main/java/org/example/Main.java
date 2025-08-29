package org.example;
import java.time.LocalDate;
import conta.corrente.*;
import cliente.*;

public class Main {
    public static void main(String[] args) {
        ContaCorrente banco1 = new ContaCorrente("01", "01", 5000f, 10000f);
        Cliente cliente1 = new Cliente("111.111.111-11", "Iran", LocalDate.of(1912, 1, 1), 2400f, banco1);
        String opcao = "0";

        do {
            System.out.println("""
                    1 - Primeira Operação
                    2 - Segunda Operação
                    3 - Terceira Operação
                    4 - Quarta Operação 
                    5 - Encerrar a Operação 
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

        } while (!opcao.equals("5"));


    }
}