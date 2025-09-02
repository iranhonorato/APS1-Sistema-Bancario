package conta.corrente;

import java.time.LocalDate;

public class Cartao {
    public enum Status { ATIVO, INATIVO }

    private String numeroCartao;
    private String tipo;
    private LocalDate validade;
    private Status status;

    public Cartao(String numeroCartao, String tipo, LocalDate validade, Status status) {
        this.numeroCartao = numeroCartao;
        this.tipo = tipo;
        this.validade = validade;
        this.status =  status;
    };

    // Métodos get
    public String getNumeroCartao() { return this.numeroCartao; };
    public String getTipo() { return this.tipo; };
    public LocalDate getValidade() { return this.validade; };
    public Status getStatus() { return this.status; };

    // Métodos Set
    public void setNumeroCartao(String numeroCartao) { this.numeroCartao = numeroCartao; };
    public void setTipo(String tipo) { this.tipo = tipo; };
    public void setValidade(LocalDate validade) { this.validade = validade; };
    public void setSatus(Status status) { this.status = status; };


    // Verificando validade
    public Boolean isExpired(LocalDate dataAtual) {
        if (dataAtual.isAfter(this.validade) || dataAtual.isEqual(this.validade)) {
            return true;
        };
        return false;
    };


    // Verificando status do cartão
    public Boolean cancelaCartao() {
        if (this.status == Status.ATIVO) {
            this.status = Status.INATIVO;
            return true;
        } else if (this.status == Status.INATIVO) {
            this.status = Status.ATIVO;
        };
        return false;
    };


}
