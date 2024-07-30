package models;
import java.time.LocalDate;
import java.time.Period;

public class Empregado {
    private String nome;
    private LocalDate dataNascimento;
    private String numCarteiraMotorista;

    public Empregado(String nome, LocalDate dataNascimento, String numCarteiraMotorista) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.numCarteiraMotorista = numCarteiraMotorista;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getNumCarteiraMotorista() {
        return numCarteiraMotorista;
    }

    public int getIdade() {
        Period periodo = Period.between(dataNascimento, LocalDate.now());
        return periodo.getYears();
        
    }

    
}
