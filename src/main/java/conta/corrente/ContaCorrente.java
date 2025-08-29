package conta.corrente;
import java.time.LocalDate;
import java.util.ArrayList;

import static conta.corrente.Movimentacao.Tipo.DEPOSITO;
import static conta.corrente.Movimentacao.Tipo.SAQUE;

public class ContaCorrente {
    private String agencia;
    private String numero;
    private Float saldo;
    private Float limite;
    private ArrayList<Movimentacao> movimentacoes = new ArrayList<>();

    public ContaCorrente(String agencia, String numero, Float saldo, Float limite) {
        this.agencia = agencia;
        this.numero= numero;
        this.saldo = saldo;
        this.limite = limite;

    };

    public String getAgencia() { return this.agencia; };
    public String getNumero () { return this.numero; };
    public Float getSaldo() { return this.saldo; };
    public Float getLimite() { return this.limite; };
    public void setAgencia(String agencia) { this.agencia = agencia; };
    public void setNumero (String numero) { this.numero = numero; };


    public void saque(Float valor) {
        if (valor == null || valor < 0) {
            System.out.println("Valor inválido");
        };

        if (this.saldo >= -this.limite) {
            Movimentacao movimentacao = new Movimentacao(valor, SAQUE, LocalDate.now());
            this.movimentacoes.add(movimentacao);
            this.saldo -= valor;
            System.out.println(movimentacao.getTipo() + " de " + movimentacao.getValor() + " na data " + movimentacao.getData());
        }

    };

    public void deposito(Float valor) {
        if (valor == null || valor < 0) {
            System.out.println("Valor inválido");
        } else {
            Movimentacao movimentacao = new Movimentacao(valor, DEPOSITO, LocalDate.now());
            this.movimentacoes.add(movimentacao);
            this.saldo += valor;
            System.out.println(movimentacao.getTipo() + " de " + movimentacao.getValor() + " na data " + movimentacao.getData());
        }

    }

}
