package domain;

import java.util.Date;

public class Receita {
    private Paciente paciente;
    private Medico medico;
    private Date dataEmissao;
    private String descricao;
    private FeedbackMedicamento feedback;

    public Receita(Paciente paciente, Medico medico, Date dataEmissao, String descricao, FeedbackMedicamento feedback) {
        this.paciente = paciente;
        this.medico = medico;
        this.dataEmissao = dataEmissao;
        this.descricao = descricao;
        this.feedback = feedback;
    }

    public FeedbackMedicamento getFeedback() {
        return feedback;
    }


    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public String getDescricao() {
        return descricao;
    }
}
