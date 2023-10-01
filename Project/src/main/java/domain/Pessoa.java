package domain;

import java.util.Date;

public class Pessoa {
    private String nome;
    private Date dataNascimento;
    private String genero;
    private String numero;

    public String getNome() { return nome; }
    public String getNumero() { return numero; }
    public String getGenero() { return genero; }

    public Pessoa(String nome, Date dataNascimento, String genero, String numero) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.numero = numero;
    }
}
