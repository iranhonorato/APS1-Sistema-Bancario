package conta.corrente;
import java.time.LocalDate;

public class Movimentacao {
    public enum Tipo { SAQUE, DEPOSITO };

    private Float valor;
    private Tipo tipo;
    private LocalDate data;

    public Movimentacao(Float valor, Tipo tipo, LocalDate data) {
        this.valor = valor;
        this.tipo = tipo;
        this.data = data;
    };


    public Float getValor() { return this.valor; };
    public Tipo getTipo() { return this.tipo;};
    public LocalDate getData() { return this.data; };
}


