package conta.corrente;
import cliente.Cliente;

import java.time.LocalDate;
import java.util.ArrayList;

import static conta.corrente.Movimentacao.Tipo.DEPOSITO;
import static conta.corrente.Movimentacao.Tipo.SAQUE;

public class ContaCorrente {
    private String agencia;
    private String numero;
    private Float saldo;
    private Float limite;
    private final Cliente cliente; // 1 Cliente para cada Conta Corrente
    private final ArrayList<Movimentacao> movimentacoes = new ArrayList<>(); // N Movimentações para cada Conta Corrente
    private final ArrayList<Cartao> cartoes = new ArrayList<>(); // N Cartões para cada Conta Corrente

    public ContaCorrente(String agencia, String numero, Float saldo, Float limite, Cliente cliente) {
        this.agencia = agencia;
        this.numero= numero;
        this.saldo = saldo;
        this.limite = limite;
        this.cliente = cliente;
    };


    // Métodos Get
    public String getAgencia() { return this.agencia; };
    public String getNumero () { return this.numero; };
    public Float getSaldo() { return this.saldo; };
    public Float getLimite() { return this.limite; };

    // Métodos Set
    public void setAgencia(String agencia) { this.agencia = agencia; };
    public void setNumero (String numero) { this.numero = numero; };

    // Lista Movimentações
    public ArrayList<Movimentacao> listaMovimentacoes() { return this.movimentacoes; };

    // Lista Cartões
    public ArrayList<Cartao> listaCartoes(){ return this.cartoes;};

    //  Cadastra cartão na conta
    public void adicionarCartoes(Cartao cartao) {
        // Verifica se o cartão já está cadastrado nessa conta
        for (Cartao c: this.cartoes) {
            if (cartao == c) {
                System.out.println("Este cartão já está cadastrado nessa conta");
                return;
            }
            // Adiciona cartão na conta
            this.cartoes.add(cartao);
            System.out.println("Cartão de número" + cartao.getNumeroCartao() + " Adicionado com sucesso!");
        }
    }

    // Realiza saque
    public void saque(Float valor) {
        Float novoSaldo = this.saldo - valor;

        // Verifica se o valor é válido
        if (valor == null || valor < 0) {
            System.out.println("Valor inválido");
            return;

            // Verifica se o novo saldo está dentro do limite permitido da conta
        } else if (novoSaldo >= -this.limite) {
            // Adiciona movimentacao à lista
            Movimentacao movimentacao = new Movimentacao(valor, SAQUE, LocalDate.now());
            this.movimentacoes.add(movimentacao);

            // Atualiza saldo
            this.saldo = novoSaldo;
            System.out.println(movimentacao.getTipo() + " de " + movimentacao.getValor() + " na data " + movimentacao.getData());
            return;
        }

    };

    // Realiza depósito
    public void deposito(Float valor)    {

        // Verifica se o valor é válido
        if (valor == null || valor < 0) {
            System.out.println("Valor inválido");
            return;

        } else {
            // Adiciona movimentação à lista
            Movimentacao movimentacao = new Movimentacao(valor, DEPOSITO, LocalDate.now());
            this.movimentacoes.add(movimentacao);

            // Atualiza saldo
            this.saldo += valor;
            System.out.println(movimentacao.getTipo() + " de " + movimentacao.getValor() + " na data " + movimentacao.getData());
        }

    }

}
