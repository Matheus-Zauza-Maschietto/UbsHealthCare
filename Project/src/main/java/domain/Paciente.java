package domain;

import java.util.Date;

public class Paciente extends Pessoa{
    private String endereco;

    public String getEndereco() { return endereco; }

    public Paciente(String nome, Date dataNascimento, String genero, String telefone, String endereco) {
        super(nome, dataNascimento, genero, telefone);
        this.endereco = endereco;
    }
}
