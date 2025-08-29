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
    private final Cliente cliente;
    private final ArrayList<Movimentacao> movimentacoes = new ArrayList<>();
    private final ArrayList<Cartao> cartoes = new ArrayList<>();

    public ContaCorrente(String agencia, String numero, Float saldo, Float limite, Cliente cliente) {
        this.agencia = agencia;
        this.numero= numero;
        this.saldo = saldo;
        this.limite = limite;
        this.cliente = cliente;
    };

    public String getAgencia() { return this.agencia; };
    public String getNumero () { return this.numero; };
    public Float getSaldo() { return this.saldo; };
    public Float getLimite() { return this.limite; };
    public void setAgencia(String agencia) { this.agencia = agencia; };
    public void setNumero (String numero) { this.numero = numero; };

    public ArrayList<Movimentacao> listaMovimentacoes() { return this.movimentacoes; };
    public ArrayList<Cartao> listaCartoes(){ return this.cartoes;};

    public void adicionarCartoes(Cartao cartao) {
        if (cartao == null) {
            System.out.println("Cartão inválido");
            return;
        }
        this.cartoes.add(cartao);
        System.out.println("Novo cartão adicionado: " + cartao.getNumeroCartao());
    }


    public void saque(Float valor) {
        Float novoSaldo = this.saldo - valor;

        if (valor == null || valor < 0) {
            System.out.println("Valor inválido");
            return;

        } else if (novoSaldo >= -this.limite) {
            Movimentacao movimentacao = new Movimentacao(valor, SAQUE, LocalDate.now());
            this.movimentacoes.add(movimentacao);
            this.saldo = novoSaldo;
            System.out.println(movimentacao.getTipo() + " de " + movimentacao.getValor() + " na data " + movimentacao.getData());
            return;
        }

    };

    public void deposito(Float valor) {
        if (valor == null || valor < 0) {
            System.out.println("Valor inválido");
            return;
        } else {
            Movimentacao movimentacao = new Movimentacao(valor, DEPOSITO, LocalDate.now());
            this.movimentacoes.add(movimentacao);
            this.saldo += valor;
            System.out.println(movimentacao.getTipo() + " de " + movimentacao.getValor() + " na data " + movimentacao.getData());
        }

    }

}
