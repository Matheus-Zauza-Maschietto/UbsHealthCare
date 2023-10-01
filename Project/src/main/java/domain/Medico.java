package domain;

import java.util.Date;

public class Medico extends Pessoa {
    private String CRM;
    private String especialidade;
    private Integer numeroRegistro;

    public Medico(String nome, Date dataNascimento, String genero, String numero, String CRM, String especialidade, Integer numeroRegistro) {
        super(nome, dataNascimento, genero, numero);
        this.CRM = CRM;
        this.especialidade = especialidade;
        this.numeroRegistro = numeroRegistro;
    }
}
