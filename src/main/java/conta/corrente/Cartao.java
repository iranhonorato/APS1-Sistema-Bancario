package conta.corrente;

import java.time.LocalDate;

public class Cartao {
    private String numeroCartao;
    private String tipo;
    private LocalDate validade;
    private String status;
    private ContaCorrente contaCorrente;

    public Cartao(String numeroCartao, String tipo, LocalDate validade, String status, ContaCorrente contaCorrente) {
        this.numeroCartao = numeroCartao;
        this.tipo = tipo;
        this.validade = validade;
        this.status = status;
        this.contaCorrente = contaCorrente;
    };

    public String getNumeroCartao() { return this.numeroCartao; };

    public String getTipo() { return this.tipo; };

    public LocalDate getValidade() { return this.validade; };

    public String getStatus() { return this.status; };

    public ContaCorrente getContaCorrente() { return this.contaCorrente; };

    public void setNumeroCartao(String numeroCartao) { this.numeroCartao = numeroCartao; };

    public void setTipo(String tipo) { this.tipo = tipo; };

    public void setValidade(LocalDate validade) { this.validade = validade; };

    public void setSatus(String status) { this.status = status; };

    public Boolean isExpired(LocalDate dataAtual) {
        if (dataAtual.isAfter(this.validade) || dataAtual.isEqual(this.validade)) {
            return true;
        };
        return false;
    };

    public Boolean cancelaCartao() {
        if (this.status == "ATIVO") {
            this.status = "CANCELADO";
            return true;
        } else if (this.status == "CANCELADO") {
            this.status = "ATIVO";
        }
        return false;
    };


}
