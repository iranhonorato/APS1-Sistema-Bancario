package ContaCorrente;

public class ContaCorrente {
    private String agencia;
    private String numero;
    private Float saldo;
    private Float limite;

    public ContaCorrente(String agencia, String numero, Float saldo, Float limite) {
        this.agencia = agencia;
        this.numero= numero;
        this.saldo = saldo;
        this.limite = limite;
    };

    public String getAgencia() {
        return this.agencia;
    };

    public String getNumero () {
        return this.numero;
    };

    public Float getSaldo() {
        return this.saldo;
    };

    public Float getLimite() {
        return this.limite;
    };


}
