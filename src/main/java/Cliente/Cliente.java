package Cliente;
import java.time.LocalDate;


public class Cliente {
    private String cpf;
    private String nome;
    private LocalDate dataNascimento;
    private Float salario;

    public Cliente(String cpf, String nome, LocalDate dataNascimento, Float salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

}
