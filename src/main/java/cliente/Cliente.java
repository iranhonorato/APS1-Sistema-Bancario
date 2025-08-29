package cliente;
import java.time.LocalDate;
import conta.corrente.ContaCorrente;

public class Cliente {
    private String cpf;
    private String nome;
    private LocalDate dataNascimento;
    private Float salario;

    public Cliente(String cpf, String nome, LocalDate dataNascimento, Float salario,  ContaCorrente contaCorrente) {
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    };

    public String getCpf() { return this.cpf; };
    public String getNome() { return this.nome; };
    public LocalDate getDataNascimento() { return this.dataNascimento; };
    public Float getSalario() { return this.salario;};

    public void setNome(String nome) { this.nome = nome; }
    public void setDataNascimento(LocalDate dataNascimento) { this.dataNascimento = dataNascimento; }
    public void setSalario(Float salario) { this.salario = salario; }

};
