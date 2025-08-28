package conta.corrente;
import java.time.LocalDate;

public class Movimentacao {
    private Float valor;
    private String tipo;
    private LocalDate data;
    private ContaCorrente contaCorrente;

    public Movimentacao(Float valor, String tipo, LocalDate data, ContaCorrente contaCorrente) {
        this.valor = valor;
        this.tipo = tipo;
        this.data = data;
        this.contaCorrente = contaCorrente;
    };

    public Float getValor() { return this.valor; };

    public String getTipo() { return this.tipo;};

    public LocalDate getData() { return this.data; };
}


