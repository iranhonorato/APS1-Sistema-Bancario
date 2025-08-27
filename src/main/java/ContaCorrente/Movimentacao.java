package ContaCorrente;
import java.time.LocalDate;

public class Movimentacao {
    private Float valor;
    private String tipo;
    private LocalDate data;

    public Movimentacao(Float valor, String tipo, LocalDate data) {
        this.valor = valor;
        this.tipo = tipo;
        this.data = data;
    }


}


